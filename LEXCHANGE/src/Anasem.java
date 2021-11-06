import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anasem extends AnasintBaseVisitor{
    public Map<String, Integer> almacen = new HashMap<>();

    @Override
    public Object visitEsq_fuente(Anasint.Esq_fuenteContext ctx) {

        List<Anasint.ClasesContext> clases = ctx.clases();
        for(int i = 0; i < clases.size();i++){
            String nombre = clases.get(i).IDENT().getText();
            List<String> lista = new ArrayList<>();
            String[] aux = visit(clases.get(i).elements()).toString().split(",");
            for(int j = 0; j<aux.length; j++){
                lista.add(aux[j]);
            }
            almacen.put(nombre, contar_elems(lista));
        }
        return super.visitEsq_fuente(ctx);
    }

    @Override
    public Object visitDatos_fuente(Anasint.Datos_fuenteContext ctx) {
        List<Anasint.DatosContext> datos = ctx.datos();
        for(int i = 0; i<datos.size();i++){
            if(!almacen.containsKey(datos.get(i).IDENT().getText())){
                System.out.println("ERROR: La clase "+ datos.get(i).IDENT().getText() +" de la línea: " + datos.get(i).IDENT().getSymbol().getLine() + ". No está declarada.");
            } else{
                List<String> lista = new ArrayList<>();
                String[] aux = visitAtribs(datos.get(i).atribs()).toString().split(",");
                for(int j = 0; j<aux.length;j++){
                    lista.add(aux[j]);
                }
                if(almacen.get(datos.get(i).IDENT().getText())!=contar_elems(lista)){
                    System.out.println("ERROR: La clase "+ datos.get(i).IDENT().getText() +" de la línea: " + datos.get(i).IDENT().getSymbol().getLine() + ". No tiene el número correcto de elementos.");
                }
            }

        }
        return super.visitDatos_fuente(ctx);
    }

    @Override
    public String visitElements(Anasint.ElementsContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAtribs(Anasint.AtribsContext ctx) {
        return ctx.getText();
    }

    public static Integer contar_elems(List<String> elems){
        Integer contador = 0;
        for(int i = 0; i<elems.size(); i++){
            contador+=1;
        }
        return contador;
    }
}
