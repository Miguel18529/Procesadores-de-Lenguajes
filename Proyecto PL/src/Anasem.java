import java.util.HashMap;
import java.util.Map;

public class Anasem extends AnasintBaseVisitor{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static Map<String, String> almacenVariables = new HashMap<>();

    @Override
    public Object visitVariables(Anasint.VariablesContext ctx) {
        for(int i = 0; i < ctx.vars().size(); i++){
            for(int j = 0; j < ctx.vars(i).nombreVariable().getChildCount(); j+=2){
                almacenVariables.put(ctx.vars(i).nombreVariable().getChild(j).getText(), ctx.vars(i).tipo().getText());
            }
        }
        System.out.println("almacenVariables: " + almacenVariables);
        return null;
    }

    @Override
    public Object visitSalidas(Anasint.SalidasContext ctx) {
        if(ctx.children.size()<=2){
            almacenVariables.put(ctx.IDENT().getText(), ctx.tipo().getText());
        } else{
            almacenVariables.put(ctx.IDENT().getText(), ctx.tipo().getText());
            visit(ctx.salidas(0));
        }
        return super.visitSalidas(ctx);
    }

    @Override
    public Object visitEntradas(Anasint.EntradasContext ctx) {
        if(ctx.children.size()<=2){
            almacenVariables.put(ctx.IDENT().getText(), ctx.tipo().getText());
        } else{
            almacenVariables.put(ctx.IDENT().getText(), ctx.tipo().getText());
            visit(ctx.entradas(0));
        }
        return super.visitEntradas(ctx);
    }

    @Override
    public Object visitAsignacion(Anasint.AsignacionContext ctx) {

        if (ctx.valorAsignacion().children.size() != ctx.nombresVariablesAsignacion().children.size()) {
            System.out.println(ANSI_RED + "ERROR: El numero de variables no coincide con el de valores" + ANSI_RESET);
        }

        if(ctx.nombresVariablesAsignacion().children.size() < 2){
            if(!almacenVariables.containsKey(ctx.nombresVariablesAsignacion().getChild(0).getText())) {
                System.out.println(ANSI_RED + "ERROR: La variable " + ctx.nombresVariablesAsignacion().getText() + " no ha sido declarada." + ANSI_RESET);

            } else{
                if()
            }
        } else{
                for (int i = 0; i < ctx.nombresVariablesAsignacion().children.size(); i += 2){
                    if(!almacenVariables.containsKey(ctx.nombresVariablesAsignacion().getChild(i).getText())) {
                        System.out.println(ANSI_RED + "ERROR: La variable " + ctx.nombresVariablesAsignacion().getChild(i).getText() + " no ha sido declarada." + ANSI_RESET);
                    }
                }

            }

        return super.visitAsignacion(ctx);
    }

    @Override
    public Object visitExpresion_entera(Anasint.Expresion_enteraContext ctx) {

        return super.visitExpresion_entera(ctx);
    }
}
