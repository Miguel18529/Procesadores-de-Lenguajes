import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interprete extends AnasintBaseVisitor{

    public Anasem anasem = new Anasem();
    public static Map<String, List<String>> objetos = new HashMap<>();
    public static Map<String, List<String>> enlaces = new HashMap<>();

    @Override
    public Object visitObjeto(Anasint.ObjetoContext ctx) {
        String nombre = ctx.IDENT().getText();
        List<String> atribs = ctx.cont_objeto().atrib_objeto().stream().map(x -> x.getText()).collect(Collectors.toList());
        objetos.put(nombre, atribs);
        return super.visitObjeto(ctx);
    }

    @Override
    public Object visitEnlace(Anasint.EnlaceContext ctx) {
        String nombre = ctx.IDENT().getText();
        List<String> clases = ctx.contenido_enlace().objetos_enlace().obj().stream().map(x -> x.getText()).collect(Collectors.toList());
        enlaces.put(nombre, clases);
        return super.visitEnlace(ctx);
    }

    @Override
    public Object visitEliminar(Anasint.EliminarContext ctx) {
        String eliminado = ctx.IDENT().getText();
        if(objetos.containsKey(eliminado)){
            objetos.remove(eliminado);
            System.out.println("INTERPRETE -> OBJETO ELIMINADO: " + eliminado);
        } else{
            enlaces.remove(eliminado);
            System.out.println("INTERPRETE -> ENLACE ELIMINADO: " + eliminado);
        }
        return super.visitEliminar(ctx);
    }

    @Override
    public Object visitConsistencia(Anasint.ConsistenciaContext ctx) {
        System.out.println("INTERPRETE -> OBJETOS " + objetos);
        System.out.println("INTERPRETE -> ENLACES: " + enlaces);
        return super.visitConsistencia(ctx);
    }
}