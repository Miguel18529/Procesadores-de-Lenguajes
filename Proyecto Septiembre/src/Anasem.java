import javax.swing.plaf.synth.SynthTableHeaderUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anasem extends AnasintBaseVisitor{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static Map<String, List<String>> clasesConAtributos = new HashMap<>();
    public static Map<String, List<String>> objetos = new HashMap<>();
    public static Map<String, String> objetoTipo = new HashMap<>();
    public static List<String> clases = new ArrayList<>();
    public static Map<String, List<String>> generalizaciones = new HashMap<>();
    public static Map<String, List<String>> asociaciones = new HashMap<>();
    public static Map<String, List<String>> enlaces = new HashMap<>();

    //COMPRUEBO QUE LAS CLASES SON UNICAS Y NO SE REPITEN LOS NOMBRES
    //ALMACENO EN "CLASES" LOS NOMBRES
    //ALMACENO EN "CLASESCONATRIBUTOS" LOS NOMBRES COMO CLAVE Y LOS ATRIBUTOS COMO VALOR
    @Override
    public Object visitClase(Anasint.ClaseContext ctx) {
        String clase = ctx.NOMBRE().getText();
        if(clases.contains(clase)){
            System.out.println(ANSI_RED + "La clase "+ clase + " ya existe" + ANSI_RESET);
            System.exit(1);
        } else{
            clases.add(ctx.NOMBRE().getText());
            clasesConAtributos.put(clase, new ArrayList<>());
            List<String> aux = new ArrayList<>();
            for(int i = 0; i < ctx.atributos().size(); i++){
                if(ctx.atributos(i).atributo() != null){
                    for (int j = 0; j < ctx.atributos(i).atributo().size(); j++){
                        //COMPRUEBO QUE NO OCURRAN REPETICIONES EN LOS ATRIBUTOS
                        if(aux.contains(ctx.atributos(i).atributo(j).getText())){
                            System.out.println(ANSI_RED + "El atributo " + ctx.atributos(i).atributo(j).getText() + "está repetido" + ANSI_RESET);
                            System.exit(1);
                        } else{
                            aux.add(ctx.atributos(i).atributo(j).getText());
                            clasesConAtributos.put(clase, aux);
                        }
                    }
                }
            }
        }
        return super.visitClase(ctx);
    }

    //COMPROBAR QUE LAS CLASES EN LAS ASOCIACIONES EXISTEN
    //ALMACENAR ASOCIACIONES EN MAP ASOCIACIONES
    @Override
    public Object visitAsociacion(Anasint.AsociacionContext ctx) {
        String clase1 = ctx.contenido().cont1().NOMBRE().getText();
        String clase2 = ctx.contenido().cont2().NOMBRE().getText();
        if(!clases.contains(clase1)){
            System.out.println(ANSI_RED + "La clase "+ clase1 + " no existe" + ANSI_RESET);
            System.exit(1);
        } else if(!clases.contains(clase2)){
            System.out.println(ANSI_RED + "La clase "+ clase2 + " no existe" + ANSI_RESET);
            System.exit(1);
        } else{
            List<String> aux = new ArrayList<>();
            aux.add(ctx.contenido().cont1().NOMBRE().getText());
            aux.add(ctx.contenido().cont1().IDENT().getText());
            aux.add(ctx.contenido().cont1().mult().getText());
            aux.add(ctx.contenido().cont2().NOMBRE().getText());
            aux.add(ctx.contenido().cont2().IDENT().getText());
            aux.add(ctx.contenido().cont2().mult().getText());
            asociaciones.put(ctx.IDENT().getText(), aux);
        }
        return super.visitAsociacion(ctx);
    }

    //COMPROBANDO QUE LAS GENERALIZACIONES SEAN CORRECTAS
    //SUPERCLASES Y SUBCLASES DEBEN EXISTIR PREVIAMENTE A LA GENERALIZACIÓN
    //NO SE PUEDEN REPETIR GENERALIZACIONES
    //UNA CLASE NO PUEDE SER SUPERCLASE NI SUBCLASE DE SI MISMA
    @Override
    public Object visitGeneralizacion(Anasint.GeneralizacionContext ctx) {
        String superclase = ctx.superclase().NOMBRE().getText();
        String subclase = ctx.subclases().NOMBRE().getText();

        //ALMACENO LAS CLASES Y SUBCLASES EN GENERALIZAZIONES, INCLUYENDO LA TRANSITIVIDAD
        if (superclase.compareTo(subclase) != 0){
            if (clases.contains(superclase)){
                if(clases.contains(subclase)){
                    if (generalizaciones.containsKey(superclase)){
                        if (!generalizaciones.get(superclase).contains(subclase)){
                            generalizaciones.get(superclase).add(subclase);
                            if(!generalizaciones.get(subclase).isEmpty()){
                                List<String> subs = generalizaciones.get(superclase);
                                for(int i = 0; i < generalizaciones.get(subclase).size(); i++){
                                    subs.add(generalizaciones.get(subclase).get(i));
                                }
                                generalizaciones.put(superclase, subs);
                            }
                        } else {
                            System.out.println(ANSI_RED + "Esta subclase ya está considerada" + ANSI_RESET);
                            System.exit(1);
                        }
                    } else {
                        List<String> subc = new ArrayList<>();
                        subc.add(subclase);
                        generalizaciones.put(superclase, subc);
                    }
                } else{
                    System.out.println(ANSI_RED + "La subclase " + subclase + " no está declarada" + ANSI_RESET);
                    System.exit(1);
                }
            } else {
                System.out.println(ANSI_RED + "La superclase " + superclase + " no está declarada" + ANSI_RESET);
                System.exit(1);
            }
        } else{
            System.out.println(ANSI_RED + "Una Clase no puede ser Subclase de si misma" + ANSI_RESET);
            System.exit(1);
        }


        //CON ESTO HEREDAN LAS SUBCLASES DIRECTAS Y CON TRANSITIVIDAD FUNCIONA BIEN
        List<String> atribSubclase = clasesConAtributos.get(subclase);
        List<String> atribSuperclase = clasesConAtributos.get(superclase);
        List<String> atribsFinales = Stream.concat(atribSuperclase.stream(), atribSubclase.stream()).collect(Collectors.toList());
        clasesConAtributos.put(subclase, atribsFinales);
        if (generalizaciones.containsKey(subclase)){
            for(int i = 0; i < generalizaciones.get(subclase).size(); i++){
                List<String> f = clasesConAtributos.get(superclase);
                List<String> f2 = clasesConAtributos.get(generalizaciones.get(subclase).get(i));
                for (int j = 0; j < f.size(); j++){
                    if (!f2.contains(f.get(j))){
                        f2.add(f.get(j));
                    }
                }
                clasesConAtributos.put(generalizaciones.get(subclase).get(i), f2);
            }
        }
        return super.visitGeneralizacion(ctx);
    }

    //COMPRUEBO QUE LAS CLASES DE LOS OBJETOS CREADOS EXISTAN
    //TAMBIEN ME ASEGURO DE QUE LOS ATRIBUTOS SEAN CORRECTOS
    //LOS ATRIBUTOS QUE NO SE RELLENEN, DAN ERROR CORRECTAMENTE
    @Override
    public Object visitObjeto(Anasint.ObjetoContext ctx) {
        String obj = ctx.IDENT().getText();
        String clase = ctx.cont_objeto().clase_objeto().NOMBRE().getText();
        List<String> arrays = new ArrayList<>();
        if(clases.contains(clase)) {
            for(int j = 0; j < clasesConAtributos.get(clase).size(); j++){
                String[] aux = clasesConAtributos.get(clase).get(j).split(":");
                arrays.add(aux[0]);
            }

            objetos.put(obj, new ArrayList<>());
            List<String> atribs = new ArrayList<>();
            for (int i = 0; i < ctx.cont_objeto().atrib_objeto().size(); i++){
                if(arrays.contains(ctx.cont_objeto().atrib_objeto().get(i).getText().split("=")[0])){
                    atribs.add(ctx.cont_objeto().atrib_objeto().get(i).getText());
                } else{
                    System.out.println(ANSI_RED + "El atributo "+ ctx.cont_objeto().atrib_objeto().get(i).getText().split("=")[0] + " no existe." + ANSI_RESET);
                    System.exit(1);
                }
            }
            List<String> atribsAux = new ArrayList<>();
            for(int i = 0; i < atribs.size(); i++){
                atribsAux.add(atribs.get(i).split("=")[0]);
            }
            for(int i = 0; i < arrays.size(); i++){
                if(!atribsAux.contains(arrays.get(i))){
                    System.out.println(ANSI_RED + "El atributo " + arrays.get(i) + " no se está usando" + ANSI_RESET);
                    System.exit(1);
                }
            }

            String clave = ctx.cont_objeto().clase_objeto().getText().split("=")[1];

            for(int i = 0; i<clasesConAtributos.get(clave).size(); i++){
                String s1 = clasesConAtributos.get(clave).get(i).split(":")[0];
                String s2 = clasesConAtributos.get(clave).get(i).split(":")[1];
                for(int j = 0; j<atribs.size();j++){
                    if(atribs.get(j).split("=")[0].equals(s1)){
                        if(s2.equals("NUM")){
                            if(!esEntero(atribs.get(j).split("=")[1])){
                                System.out.println(ANSI_RED + "El atributo " + atribs.get(j) + " no es un entero" + ANSI_RESET);
                                System.exit(1);
                            }
                        } else {
                            if(esEntero(atribs.get(j).split("=")[1])){
                                System.out.println(ANSI_RED + "El atributo " + atribs.get(j) + " no es una cadena" + ANSI_RESET);
                                System.exit(1);
                            }
                        }
                    }
                }
            }
            objetos.put(obj, atribs);
            objetoTipo.put(obj, clase);
        } else{
            System.out.println(ANSI_RED + "El objeto "+ obj + " no se puede crear porque no existe la clase " + clase + ANSI_RESET);
            System.exit(1);
        }
        return super.visitObjeto(ctx);
    }

    public Boolean esEntero(String x){
        Boolean res;
        try{
            Integer.parseInt(x);
            res = true;
        }catch (Exception e){
            res = false;

        }
        return res;
    }
    //LA CREACIÓN DE ENLACES FUNCIONA BIEN
    //INCLUYE SUBCLASES Y EL ORDEN ES CORRECTO

    @Override
    public Object visitEnlace(Anasint.EnlaceContext ctx) {
        String nombre = ctx.IDENT().getText();
        String asoc = ctx.contenido_enlace().asociacion_enlace().IDENT().getText();
        if(asociaciones.containsKey(asoc)) {
            List<String> aux = new ArrayList<>();
            for (int i = 0; i<ctx.contenido_enlace().objetos_enlace().obj().size(); i++){
                if(objetos.containsKey(ctx.contenido_enlace().objetos_enlace().obj(i).IDENT().getText())){
                    aux.add(ctx.contenido_enlace().objetos_enlace().obj(i).IDENT().getText());
                } else{
                    System.out.println(ANSI_RED + "El objeto "+ ctx.contenido_enlace().objetos_enlace().obj(i).IDENT().getText() + " no existe." + ANSI_RESET);
                    System.exit(1);
                }
            }
            if(objetoTipo.get(ctx.contenido_enlace().objetos_enlace().obj(0).IDENT().getText()).compareTo(asociaciones.get(asoc).get(0)) == 0){
                if(objetoTipo.get(ctx.contenido_enlace().objetos_enlace().obj(1).IDENT().getText()).compareTo(asociaciones.get(asoc).get(3)) == 0){
                    enlaces.put(nombre, aux);
                } else if(generalizaciones.get(asociaciones.get(asoc).get(3)).contains(objetoTipo.get(ctx.contenido_enlace().objetos_enlace().obj(1).IDENT().getText()))){
                    enlaces.put(nombre, aux);
                }else{
                    System.out.println(ANSI_RED + "1. La asociación está mal construida" + ANSI_RESET);
                    System.exit(1);
                }
            }else if(generalizaciones.get(asociaciones.get(asoc).get(0)).contains(objetoTipo.get(ctx.contenido_enlace().objetos_enlace().obj(0).IDENT().getText()))){
                if(objetoTipo.get(ctx.contenido_enlace().objetos_enlace().obj(1).IDENT().getText()).compareTo(asociaciones.get(asoc).get(3)) == 0){
                    enlaces.put(nombre, aux);
                } else{
                    System.out.println(ANSI_RED + "2. La asociación está mal construida" + ANSI_RESET);
                    System.exit(1);
                }
            }else{
                System.out.println(ANSI_RED + "3. La asociación está mal construida" + ANSI_RESET);
                System.exit(1);
            }

        } else{
            System.out.println(ANSI_RED + "La asociacion "+ asoc + " no existe." + ANSI_RESET);
            System.exit(1);
        }
        return super.visitEnlace(ctx);
    }

    //LOS OBJETOS O ENLACES QUE SE QUIEREN ELIMINAR DEBEN EXISTIR
    @Override
    public Object visitEliminar(Anasint.EliminarContext ctx) {

        if(ctx.ENLACE()!= null){
            if(enlaces.containsKey(ctx.IDENT().getText())){
                enlaces.remove(ctx.IDENT().getText());
            } else{
                System.out.println(ANSI_RED + "El enlace "+ ctx.IDENT().getText() + " no existe." + ANSI_RESET);
                System.exit(1);
            }
        } else if(ctx.OBJETO()!= null){
            if(objetos.containsKey(ctx.IDENT().getText())){
                objetos.remove(ctx.IDENT().getText());
                objetoTipo.remove(ctx.IDENT().getText());
            } else{
                System.out.println(ANSI_RED + "El objeto "+ ctx.IDENT().getText() + " no existe." + ANSI_RESET);
                System.exit(1);
            }

        }
        return super.visitEliminar(ctx);
    }
}