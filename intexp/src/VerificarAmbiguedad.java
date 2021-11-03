import java.util.HashMap;
import java.util.Map;

public class VerificarAmbiguedad extends AnasintBaseVisitor<Boolean>{

    public Map<String, Boolean> memoria = new HashMap<>();

    public Boolean visitOpBin(Anasint.OpBinContext ctx){
        //El visit va buscando en el árbol y elige de los visit que hemos definido, el que mejor le convenga, si encuentra al final
        //de expresion, un Num, accede a visitNum...

        return visit(ctx.expresion(0)) || visit(ctx.expresion(1));
    }

    public Boolean visitNum(Anasint.NumContext ctx){
        return false;
    }

    public Boolean visitVarNoAmb(Anasint.VarNoAmbContext ctx){
        return false;
    }

    public Boolean visitVar(Anasint.VarContext ctx){
        return memoria.get(ctx.IDENT().getText());
    }

    public Boolean visitPar(Anasint.ParContext ctx) {
        return visit(ctx.expresion());
    }

}