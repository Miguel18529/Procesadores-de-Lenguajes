import java.util.HashMap;
import java.util.Map;
public class Anasem extends AnasintBaseVisitor{

    public static Map<String, String> almacen_variables = new HashMap<>();


    //DECISIÓN DE DISEÑO 1
    @Override
    public Object visitDefinicion_variables(Anasint.Definicion_variablesContext ctx) {

        if(ctx.idents().getText().contains(",")){
            String[] aux = ctx.idents().getText().split(",");
            for(int i = 0; i<aux.length; i++){
                almacen_variables.put(aux[i], ctx.tipo().getText());
            }
        } else{
            almacen_variables.put(ctx.idents().getText(), ctx.tipo().getText());
        }
        System.out.println(almacen_variables);
        return super.visitDefinicion_variables(ctx);
    }

    //DECISIÓN DE DISEÑO 2
}
