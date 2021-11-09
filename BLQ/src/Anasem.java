import java.util.ArrayList;
import java.util.List;

public class Anasem extends AnasintBaseListener{

    public List<String> almacen = new ArrayList<>();

    @Override
    public void enterBloque(Anasint.BloqueContext ctx) {
        String vars=ctx.variables().getText().replace(";", "");
        almacen.add(vars);
        super.enterBloque(ctx);
    }

    @Override
    public void exitBloque(Anasint.BloqueContext ctx) {
        almacen.remove(almacen.size()-1);
        super.exitBloque(ctx);
    }

    @Override
    public void enterAsignacion(Anasint.AsignacionContext ctx) {
        Boolean flag = false;
        for(int i=0;i<almacen.size();i++){
            if(almacen.get(i).contains(ctx.IDENT().getText())){
               flag=true;
            }
        }
        if(!flag){
            System.out.println("ERROR: Variable no declarada "+ ctx.IDENT().getText() +" en: "+ctx.IDENT().getSymbol().getLine());
        }
        super.enterAsignacion(ctx);
    }

    @Override
    public void enterExpr2(Anasint.Expr2Context ctx) {
        if(ctx.IDENT()!=null){
            System.out.println(almacen);
            System.out.println("expr2: " + ctx.IDENT().getText());
            Boolean flag = false;
            for(int i=0; i <almacen.size(); i++){
                if(almacen.get(i).contains(ctx.IDENT().getText())){
                    flag=true;
                }
            }
            if(!flag){
                System.out.println("ERROR: Variable no declarada " + ctx.IDENT().getText() + " en: "+ctx.IDENT().getSymbol().getLine());
            }

        }
        super.enterExpr2(ctx);
    }
}
