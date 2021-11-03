import java.util.ArrayList;
import java.util.List;

public class Anasem extends AnasintBaseListener{

    public List<Boolean> almacen = new ArrayList<>();

    @Override
    public void enterIteracion(Anasint.IteracionContext ctx) {
        if(almacen.isEmpty()){
            almacen.add(false);
        } else if(almacen.get(almacen.size()-1) == false){
            almacen.add(false);
        } else{
            almacen.add(true);
        }
        System.out.println("Entrada almacen while: "+almacen);
        super.enterIteracion(ctx);
    }

    @Override
    public void exitIteracion(Anasint.IteracionContext ctx) {
        almacen.remove(almacen.size()-1);
        System.out.println("Salida almacen while: "+almacen);
        super.exitIteracion(ctx);
    }

    @Override
    public void enterSeleccion(Anasint.SeleccionContext ctx) {
        if(almacen.isEmpty()){
            almacen.add(false);
        } else if(almacen.get(almacen.size()-1) == false){
            almacen.add(false);
        } else{
            almacen.add(true);
        }
        System.out.println("Entrada almacen if: "+almacen);
        super.enterSeleccion(ctx);
    }

    @Override
    public void exitSeleccion(Anasint.SeleccionContext ctx) {
        almacen.remove(almacen.size()-1);
        System.out.println("Salida almacen if: "+almacen);
        super.exitSeleccion(ctx);
    }

    @Override
    public void enterRuptura(Anasint.RupturaContext ctx) {
        if(almacen.isEmpty()){
            almacen.add(true);
        } else if(almacen.get(almacen.size()-1)==false){
           // almacen.remove(almacen.size()-1);
            almacen.set(almacen.size()-1, true);
        } else{
            System.out.println("ERROR Break inalcanzable en línea: "+ctx.BREAK().getSymbol().getLine());
        }
        super.enterRuptura(ctx);
    }
}
