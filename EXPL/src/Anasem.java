import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Anasem extends AnasintBaseVisitor{

    public static List<Boolean> almacen = new ArrayList<>();

    @Override
    public Object visitRuptura(Anasint.RupturaContext ctx) {
        if(almacen.isEmpty()){
            almacen.add(true);
        }
        if(almacen.get(almacen.size()-1) == true){
            System.out.println("ERROR: break inalcanzable");
        } else {
            almacen.add(almacen.size()-1, true);
        }
        return super.visitRuptura(ctx);
    }

    @Override
    public Object visitIteracion(Anasint.IteracionContext ctx) {
        if(almacen.isEmpty()){
            almacen.add(false);
        }
        if(almacen.get(almacen.size()-1) == true){
            almacen.add(true);
        }
        return super.visitIteracion(ctx);
    }
}
