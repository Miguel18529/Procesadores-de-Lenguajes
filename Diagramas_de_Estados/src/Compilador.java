import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Compilador extends AnasintBaseListener{
    public Map<String, Integer> almacen_variables = new HashMap<>();

    FileWriter fichero;
    String nombre_fichero = "ejemplo1";


    @Override
    public void enterDiagrama(Anasint.DiagramaContext ctx) {
        abrir_fichero();
        generar_codigo_inicio_clase();
        generar_codigo_inicio_main();
        super.enterDiagrama(ctx);
    }

    @Override
    public void exitDiagrama(Anasint.DiagramaContext ctx) {
        generar_codigo_final_main();
        generar_codigo_final_clase();
        cerrar_fichero();
        super.exitDiagrama(ctx);
    }

    @Override
    public void exitVariables(Anasint.VariablesContext ctx) {

        super.exitVariables(ctx);
    }

    @Override
    public void enterVars(Anasint.VarsContext ctx) {
        almacen_variables.put(ctx.IDENT().getText(), 0);
        System.out.println(almacen_variables);
        super.enterVars(ctx);
    }

    public void generar_codigo_inicio_clase(){
        try{
            fichero.write("import java.io.*;\n");
            fichero.write("public class "+nombre_fichero+"{\n");

        } catch(IOException e){
            System.out.println(e);
        }
    }

    public void generar_codigo_inicio_main(){
        try{
            fichero.write("public static void main(String args[]){\n");
        } catch(IOException e){
            System.out.println(e);
        }
    }

    public void generar_codigo_final_clase(){
        try{
            fichero.write("}\n");
        } catch(IOException e){
            System.out.println(e);
        }
    }
    public void generar_codigo_final_main(){
        try{
            fichero.write("}\n");
        } catch(IOException e){
            System.out.println(e);
        }
    }
    public void abrir_fichero(){
        try{
            fichero = new FileWriter("src/"+nombre_fichero+".java");
        } catch (IOException e){
            System.out.println("open_file (exception): "+e.toString());
        }
    }

    public void cerrar_fichero(){
        try{
            fichero.close();
        } catch(IOException e){
            System.out.println("close_file (exception): "+e.toString());
        }
    }
}
