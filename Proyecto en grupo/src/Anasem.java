import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class Anasem extends AnasintBaseVisitor{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public Map<String,String> almacen_variables = new HashMap<String,String>();
    public Map<String,String> accion_variables = new HashMap<String,String>();
    public List<String> valores_devueltos = new ArrayList<>();
    List<String> lista_expresion_entera = new ArrayList<>();

    @Override
    public Object visitTipo(Anasint.TipoContext ctx) {
        String tipo = ctx.getText();
        return tipo;
    }

    @Override
    public Object visitNombreVariable(Anasint.NombreVariableContext ctx) {
        Set<String> var = new LinkedHashSet<>();
        var.add(ctx.IDENT().getText());
        if (ctx.getChildCount()>1){
            Set<String> s = (Set<String>)visit(ctx.nombreVariable());
            var.addAll(s);
        }
        return var;
    }

    @Override
    public Object visitVars(Anasint.VarsContext ctx) {
        Map<String,String> almacen = new HashMap<String, String>();
        Set<String> v = (Set<String>)visit(ctx.nombreVariable());
        String t = (String)visit(ctx.tipo());
        List<String> l = new ArrayList<>(v);
        for (int i = 0;i<l.size();i++){
            if (!almacen_variables.containsKey(l.get(i))){
                almacen.put(l.get(i),t);
                accion_variables.put(l.get(i),"escritura");
            }else{
                System.out.println(ANSI_RED + "ERROR: No se ha podido almacenar la variable '" + l.get(i) + "'" + " porque ya existe en el almacén" + ANSI_RESET);
                break;
            }
        }
        return almacen;
    }

    @Override
    public Object visitVariables(Anasint.VariablesContext ctx) {
        for (int i = 1;i<ctx.children.size();i++){
            Map<String,String> aux2 = (Map<String,String>)visit(ctx.children.get(i));
            almacen_variables.putAll(aux2);
        }
        return almacen_variables;
    }

    @Override
    public Object visitEntradas(Anasint.EntradasContext ctx) {
        if (ctx.getChildCount() > 0){
            String tipo = (String) visit(ctx.tipo());
            if (!almacen_variables.containsKey(ctx.IDENT().getText())){
                almacen_variables.put(ctx.IDENT().getText(),tipo);
                if (ctx.getChildCount()>2){
                    Map<String,String> aux2 = (Map<String, String>)visit(ctx.entradas());
                    almacen_variables.putAll(aux2);
                }
            }else{
                System.out.println(ANSI_RED + "ERROR: No se ha podido almacenar la variable '" + ctx.IDENT().getText() + "'" + " porque ya existe en el almacén" + ANSI_RESET);
            }
        }
        return almacen_variables;
    }

    @Override
    public Object visitSalidas(Anasint.SalidasContext ctx) {
        try{
            if (!almacen_variables.containsKey(ctx.IDENT().getText())){
                almacen_variables.put(ctx.IDENT().getText(),ctx.NUM().getText());
                accion_variables.put(ctx.IDENT().getText(),"salida");
                if (ctx.getChildCount()>2){
                    Map<String,String> aux2 = (Map<String, String>)visit(ctx.salidas());
                    almacen_variables.putAll(aux2);
                }
            }else{
                System.out.println(ANSI_RED + "ERROR: No se ha podido almacenar la variable '" + ctx.IDENT().getText() + "'" + " porque ya existe en el almacén" + ANSI_RESET);
            }
        }catch (Exception e){
            if (!almacen_variables.containsKey(ctx.IDENT().getText())){
                almacen_variables.put(ctx.IDENT().getText(),ctx.secuencia().getText());
                accion_variables.put(ctx.IDENT().getText(),"salida");
                if (ctx.getChildCount()>2){
                    Map<String,String> aux2 = (Map<String, String>)visit(ctx.salidas());
                    almacen_variables.putAll(aux2);
                }
            }else{
                System.out.println(ANSI_RED + "ERROR: No se ha podido almacenar la variable '" + ctx.IDENT().getText() + "'" + " porque ya existe en el almacén" + ANSI_RESET);
            }
        }
        return almacen_variables;
    }

    @Override
    public Object visitProcedimiento(Anasint.ProcedimientoContext ctx) {
        Map<String,String> m = (Map<String, String>)visit(ctx.entradas());
        List<String> l = new ArrayList<>(m.keySet());
        for (int i = 0;i<l.size();i++){
            accion_variables.put(l.get(i),"escritura");
        }
        Map<String,String> m2 = (Map<String, String>)visit(ctx.variables());
        System.out.println(m2);
        System.out.println(accion_variables);
        return m2;
    }

    @Override
    public Object visitPredicado(Anasint.PredicadoContext ctx) {
        if (!almacen_variables.containsKey(ctx.IDENT().getText())){
            almacen_variables.put(ctx.IDENT().getText(),ctx.LOG().getText());
            accion_variables.put(ctx.IDENT().getText(),"salida");
        }else{
            System.out.println("La variable " + ctx.IDENT().getText() + " ya existe en el almacen");
        }
        return true;
    }

    @Override
    public Object visitFuncion(Anasint.FuncionContext ctx) {
        Map<String,String> m = (Map<String, String>)visit(ctx.entradas());
        almacen_variables.putAll(m);
        List<String> l = new ArrayList<>(m.keySet());
        for (int i = 0 ; i < l.size(); i++){
            accion_variables.put(l.get(i), "lectura");
        }
        try {
            Map<String,String> m2 = (Map<String, String>)visit(ctx.salidas());
        }catch (Exception e){
            Boolean res = (Boolean)visit(ctx.predicado());
        }
        Map<String,String> m3 = (Map<String, String>)visit(ctx.variables());
        Boolean res = (Boolean)visit(ctx.instrucciones());
        System.out.println(m3);
        System.out.println(accion_variables);
        return m3;
    }

    @Override
    public Object visitInstrucciones(Anasint.InstruccionesContext ctx) {
        for (int i = 1; i< ctx.children.size();i++){
            Boolean res = (Boolean)visit(ctx.children.get(i));
        }
        return true;
    }

    @Override
    public Object visitInstruccion(Anasint.InstruccionContext ctx) {
        Boolean res = (Boolean)visit(ctx.children.get(0));
        return true;
    }

    @Override
    public Object visitAsignacion(Anasint.AsignacionContext ctx) {
        Set<String> aux = (Set<String>)visit(ctx.nombreVariable());
        List<String> l = new ArrayList<>(aux);
        String tipoExp = "";
        Boolean res = true;
        int posicion = 2;
        for (int i = 0;i<l.size();i++){
            if (!almacen_variables.containsKey(l.get(i)) || accion_variables.get(l.get(i)) == "lectura"){
                System.out.println(ANSI_RED + "La variable " + l.get(i) + " no está definida o es de lectura." + ANSI_RESET);
            }else{
                for (int j=posicion;posicion<ctx.children.size()-1;){ //ARREGLAR
                    try{
                        tipoExp = (String) visit(ctx.getChild(j));
                        System.out.println("Soy tipoExp:" + tipoExp);
                        posicion = posicion + 2;
                        break;
                    }catch (Exception e){
                        System.out.println("eyy");
                    }
                }
                if (!almacen_variables.get(l.get(i)).equals(tipoExp)){
                    res = false;
                    System.out.println(ANSI_RED+"El tipo de la variable no es igual al de la expresion."+ANSI_RESET);
                    //System.exit(0);
                }
            }
        }
        return res;
    }

    @Override
    public Object visitResultado(Anasint.ResultadoContext ctx) {
        Boolean aux = (Boolean) visit(ctx.valor_devuelto());
        return aux;
    }

    @Override
    public Object visitValor_devuelto(Anasint.Valor_devueltoContext ctx) {
        Boolean res = true;
        try {
            valores_devueltos.add(ctx.IDENT().getText());
        }catch (Exception e){
            try{
                valores_devueltos.add(ctx.VERDADERO().getText());
            }catch (Exception e2){
                valores_devueltos.add(ctx.FALSO().getText());
            }
        }
        if (ctx.getChildCount() > 2) {
            visit(ctx.valor_devuelto());
        }else{
            List<String> l = new ArrayList<>(almacen_variables.keySet());
            List<String> aux = new ArrayList<>();
            for (int i = 0; i < l.size(); i++){
                if (accion_variables.get(l.get(i)) == "salida"){
                    aux.add(l.get(i));
                }
            }
            if (valores_devueltos.size() != aux.size()) {
                System.out.println(ANSI_RED + "ERROR1:La expresión devuelta no es correcta." + ANSI_RESET);
            }else if ((valores_devueltos.contains("T") || valores_devueltos.contains("F")) && aux.size() > 1) {
                System.out.println(ANSI_RED+"ERROR2:La expresión devuelta no es correcta."+ANSI_RESET);
            }else if ((valores_devueltos.contains("T") || valores_devueltos.contains("F")) && aux.size() == 1 && !almacen_variables.get(aux.get(0)).equals("LOG")){
                System.out.println(ANSI_RED+"ERROR3:La expresión devuelta no es correcta."+ANSI_RESET);
            }else {
                for (int i = 0; i<valores_devueltos.size();i++){
                    if (!valores_devueltos.get(i).equals("T") && !valores_devueltos.get(i).equals("F") && !aux.contains(valores_devueltos.get(i))){
                        System.out.println(ANSI_RED+"ERROR4:La expresión devuelta no es correcta."+ANSI_RESET);
                        break;
                    }
                }
            }
        }
        return res;
    }

    @Override
    public Object visitExpresion(Anasint.ExpresionContext ctx) {
        String res = (String) visit(ctx.children.get(0));
        return res;
    }

    @Override
    public Object visitExpresion_entera(Anasint.Expresion_enteraContext ctx) {
        String res = "";
        try{
            if (!ctx.NUMERO().getText().isEmpty()){
                res = "NUM";
            }
        }catch (Exception e){
            try {
                res = almacen_variables.get(ctx.IDENT().getText());
            }catch (Exception e1){
                try {
                    Integer.parseInt(ctx.llamada_secuencia().getText());
                }catch (Exception e2){
                    if (ctx.children.size()>1){

                        for (int i = 0; i< ctx.getChildCount();i++){
                            try{
                                String res2 = (String)visit(ctx.expresion_entera(i));
                                lista_expresion_entera.add(res2);
                            }catch(Exception e3){

                            }
                        }
                        if(lista_expresion_entera.contains("LOG") || lista_expresion_entera.contains("SEQ(LOG)") || lista_expresion_entera.contains("SEQ(NUM)")){
                            System.out.println(ANSI_RED+ "ERROR: La suma no es válida");
                            System.exit(0);
                        } else {
                            res = "NUM";
                        }
                        lista_expresion_entera.clear();

                    }
                }
            }
        }
        return res;
    }
    /*@Override
    public Object visitExpresion_entera(Anasint.Expresion_enteraContext ctx) {
        String res = "";
        try{
            if (!ctx.NUMERO().getText().isEmpty()){
                res = "NUM";
            }
        }catch (Exception e){
            try {
                res = almacen_variables.get(ctx.IDENT().getText());
            }catch (Exception e1){
                try{
                    if(!ctx.SUMA().getText().isEmpty()){
                        if (esEntero(ctx.getChild(0).getText()) && esEntero(ctx.getChild(2).getText())) {
                            res = "NUM";
                        } else {
                            if(ctx.expresion_entera().get(0).getText()!=null){
                                //for(int i = 0; i < ctx.expresion_entera().size(); i++){
                                    //System.out.println(i);
                                res = (String) visit(ctx.expresion_entera(0));
                                System.out.println(ctx.expresion_entera().get(1).getText());
                                    System.out.println("kk " +res);
                                //}
                            }else{
                                System.out.println(ANSI_RED+"ERROR: Alguno de los elementos de la suma no es entero");
                                //(System.exit(0);
                            }


                        }

                        res = "NUM";
                    }
                } catch (Exception e2){
                    try{
                        if (!ctx.RESTA().getText().isEmpty()){
                            res = "NUM";
                        }
                    } catch (Exception e3){
                        try {
                            if(!ctx.POR().getText().isEmpty()){
                                res = "NUM";
                            }
                        } catch (Exception e4){
                            try{
                                if (!ctx.llamada_secuencia().getText().isEmpty()){
                                    if(almacen_variables.containsKey(ctx.getChild(0).getChild(0).getText())){
                                        if(!almacen_variables.get(ctx.getChild(0).getChild(0).getText()).equals("SEQ(NUM)")){
                                            System.out.println(ANSI_RED + "ERROR: La secuencia no es de tipo entero");
                                        }
                                    }
                                    res = "NUM";
                                }
                            } catch (Exception e5){
                                if (!ctx.llamada_funcion().getText().isEmpty()){
                                    res = "NUM";
                                }
                            }
                        }

                    }
                }

            }
        }
        return res;
    }*/

    @Override
    public Object visitExpresion_logica(Anasint.Expresion_logicaContext ctx) {
        String res = "";
        try{
            if (!ctx.VERDADERO().getText().isEmpty()){
                res = "LOG";
            }
        }catch (Exception e){
            try{
                if (!ctx.FALSO().getText().isEmpty()){
                    res = "LOG";
                }
            }catch (Exception e1){
                try {
                    res = almacen_variables.get(ctx.IDENT().getText());
                }catch (Exception e2){

                }
            }
        }
        return res;
    }

    @Override
    public Object visitExpresion_secuencia_entera(Anasint.Expresion_secuencia_enteraContext ctx) {
        return "SEQ(NUM)";
    }

    @Override
    public Object visitExpresion_secuencia_logica(Anasint.Expresion_secuencia_logicaContext ctx) {
        return "SEQ(LOG)";
    }
}

