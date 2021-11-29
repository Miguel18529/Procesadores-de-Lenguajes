import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interprete extends AnasintBaseVisitor<Integer>{
    //Global
    //memoria para almacenar el valor de las variables (1)

    public static Map<String, Integer> almacen = new HashMap<>();

    //lista_vars: VAR {actualizar memoria con (VAR,0) } (1) COMA lista_vars
    //		    | VAR {actualizar memoria con (VAR,0) } (1)
    @Override
    public Integer visitLista_vars(Anasint.Lista_varsContext ctx) {
        //opción óptima: almacen.put(ctx.VAR().getText(), 0);

        //opción fiel a la gramática:
        if (ctx.getChildCount()==3){
            String var = ctx.VAR().getText();
            almacen.put(var, 0);
            visitLista_vars(ctx.lista_vars());
        } else {
            String var = ctx.VAR().getText();
            almacen.put(var, 0);
        }
        System.out.println(almacen);
        return null;
    }

    //instrucciones INSTRUCCIONES {cent=hay que interpretar} (lista_instrucciones[cent])?; (3)
    @Override
    public Integer visitInstrucciones(Anasint.InstruccionesContext ctx) {
        if(ctx.getChildCount()>1){
            Integer cent = 1;
            visitLista_instrs(ctx.lista_instrs(), cent);
        }
        return null;
    }

    //lista_instrucciones[cent]:cent_nuevo=instruccion[cent] (lista_instrucciones[cent_nuevo])? (3);
    public Integer visitLista_instrs(Anasint.Lista_instrsContext ctx, Integer cent) {
        if (ctx.getChildCount()>1){
            Integer cent_nuevo=visitInstruccion(ctx.instruccion(), cent);
            visitLista_instrs(ctx.lista_instrs(), cent);
        } else{
            Integer cent_nuevo=visitInstruccion(ctx.instruccion(), cent);
        }
        return null;
    }

    //instruccion[cent] dev cent_nuevo: asignacion[cent] {cent_nuevo=cent} (3)
    //				 | condicional[cent] {cent_nuevo=cent} (3)
    //				 | cent_nuevo=ruptura[cent] (3)
    //				 | impresion[cent] {cent_nuevo=cent} (3)
    //				 ;
    public Integer visitInstruccion(Anasint.InstruccionContext ctx, Integer cent) {
        Integer cent_nuevo;
        if(ctx.asignacion()!=null){
            visitAsignacion(ctx.asignacion(), cent);
            cent_nuevo = cent;
            System.out.println("cent asignaicion: " + cent_nuevo + "->" + ctx.asignacion().ASIG().getSymbol().getLine());
        } else if(ctx.condicional()!=null){
            visitCondicional(ctx.condicional(), cent);
            cent_nuevo = cent;
            System.out.println("cent condiconal: " + cent_nuevo + "->" + ctx.condicional().ENTONCES().getSymbol().getLine());
        } else if(ctx.ruptura()!=null){
            cent_nuevo=visitRuptura(ctx.ruptura(), cent);
            System.out.println("cent ruptura: " + cent_nuevo + "->" + ctx.ruptura().RUPTURA().getSymbol().getLine());
        } else{
            visitImpresion(ctx.impresion(), cent);
            cent_nuevo=cent;
            System.out.println("cent impresion: " + cent_nuevo + "->" + ctx.impresion().MOSTRAR().getSymbol().getLine());
        }
        return cent_nuevo;
    }

    //asignacion[cent]: VAR ASIG v=expr PUNTOYCOMA {si cent==hay que interpretar entonces (3) actualizar memoria con (VAR,v) (2,a) fsi };
    public Integer visitAsignacion(Anasint.AsignacionContext ctx, Integer cent) {
            Integer v = visitExpr(ctx.expr());
            if(cent==1){
                System.out.println("Añado: "+ ctx.VAR().getText() + ": " + v + " linea: " + ctx.VAR().getSymbol().getLine());
                almacen.put(ctx.VAR().getText(), v);
            }

        return null;
    }
    //condicional[cent_ext]: SI PARENTESISABIERTO v=condicion PARENTESISCERRADO ENTONCES (2.b) {evaluamos la condición v}
    //							{cent_int=cent_ext Y v} (4)
    //							lista_instrucciones[cent_int] (alternativa[NO cent_int])?
    //					   FINSI;
    public Integer visitCondicional(Anasint.CondicionalContext ctx, Integer cent_ext) {
        Integer v = visitCondicion(ctx.condicion());
        Integer cent_int=conjuncionEntera(cent_ext, v);
        System.out.println(cent_int);
        visitLista_instrs(ctx.lista_instrs(), cent_int);
        if(ctx.alternativa()!=null){
            visitAlternativa(ctx.alternativa(), negacionEntera(cent_int));
        }
        return null;
    }

    //condicion dev v: v1=expr MAYOR v2=expr {si (v1>v2) entonces v=cierto sino v=falso fsi} (2.b)
    // | v1=expr MENOR v2=expr {si (v1<v2) entonces v=cierto sino v=falso fsi} (2.b)
    // | v1=expr IGUAL v2=expr {si (v1==v2) entonces v=cierto sino v=falso fsi} (2.b)
    // | v1=expr DISTINTO v2=expr {si (v1!=v2) entonces v=cierto sino v=falso fsi} (2.b)
    // | v1=expr MAYORIGUAL v2=expr {si (v1>=v2) entonces v=cierto sino v=falso fsi} (2.b)
    // | v1=expr MENORIGUAL v2=expr {si (v1<=v2) entonces v=cierto sino v=falso fsi} (2.b)
    // ;
    @Override
    public Integer visitCondicion(Anasint.CondicionContext ctx) {
        Integer v=0;
        Integer v1=visitExpr(ctx.expr(0));
        Integer v2=visitExpr(ctx.expr(1));
        if(ctx.MAYOR()!=null){
            if(v1>v2){
                v=1;
            }
        } else if(ctx.MENOR()!=null){
            if(v1<v2){
                v=1;
            }
        } else if(ctx.IGUAL()!=null){
            if(v1.compareTo(v2)==0){
                v=1;
            }
        } else if(ctx.DISTINTO()!=null){
            if(v1.compareTo(v2)!=0){
                v=1;
            }
        } else if(ctx.MAYORIGUAL()!=null){
            if(v1>=v2){
                v=1;
            }
        } else{
            if(v1<=v2){
                v=1;
            }
        }
        return v;
    }

    //expr dev v: v1=expr MAS v2=expr {v=v1+v2} (2.a)
    // | v1=expr MENOS v2=expr {v=v1-v2}
    // | v1=expr POR v2=expr {v=v1*v2}
    // | VAR {v=valor de VAR en el almacen}
    // | NUM {v=NUM}
    // | PARENTESISABIERTO v=expr PARENTESISCERRADO
    // ;


    @Override
    public Integer visitExpr(Anasint.ExprContext ctx) {
        Integer v = 0;
        if(ctx.MAS()!=null){
            Integer v1 = visitExpr(ctx.expr(0));
            Integer v2 = visitExpr(ctx.expr(1));
            v=v1+v2;
        }else if(ctx.MENOS()!=null) {
            Integer v1 = visitExpr(ctx.expr(0));
            Integer v2 = visitExpr(ctx.expr(1));
            v = v1 - v2;
        }else if(ctx.POR()!=null) {
            Integer v1 = visitExpr(ctx.expr(0));
            Integer v2 = visitExpr(ctx.expr(1));
            v = v1 * v2;
        }else if(ctx.VAR()!=null) {
            v=almacen.get(ctx.VAR().getText());
        }else if(ctx.NUM()!=null) {
            v=Integer.parseInt(ctx.NUM().getText());
        } else{
            v=visitExpr(ctx.expr(0));
        }
        return v;
    }

    //alternativa[cent_int]: SINO lista_instrucciones[cent_int];
    public Integer visitAlternativa(Anasint.AlternativaContext ctx, Integer cent_int) {
        visitLista_instrs(ctx.lista_instrs(), cent_int);
        return null;
    }

    //ruptura[cent] dev cent_nuevo: RUPTURA PUNTOYCOMA {si cent==hay que interpretar entonces	(3)
    //										cent_nuevo= No hay que interpretar (2.d)
    //										sino
    //											cent_nuevo= No hay que interpretar (2.d)
    //										fsi};
    public Integer visitRuptura(Anasint.RupturaContext ctx, Integer cent) {
        Integer cent_nuevo;
        if(cent==1){
            cent_nuevo=0;
            System.out.println("BREAK CAMBIO PARAR " + "linea: " + ctx.RUPTURA().getSymbol().getLine());
        } else{
            cent_nuevo=0;
            System.out.println("BREAK SIGO PARAO " + ctx.RUPTURA().getSymbol().getLine());
        }
        return cent_nuevo;
    }

    //impresion[cent]: MOSTRAR PARENTESISABIERTO l=vars PARENTESISCERRADO PUNTOYCOMA
    //					{si cent==Hay que interpretar entonces (3)
    //						consultar el valor de cada variable de l en el almacen y mostrar por consola (2.c)
    //					fsi} ;
    public Integer visitImpresion(Anasint.ImpresionContext ctx, Integer cent) {
        for(int i=0; i <ctx.vars().children.size(); i+=2){
            System.out.println("Mostrar -> " + ctx.vars().children.get(i).getText() + ": " + almacen.get(ctx.vars().children.get(i).getText()));
        }
        return null;
    }


    //función auxiliar conjunciones con enteros
    public static Integer conjuncionEntera(Integer v1, Integer v2){
        Integer res = 0;
        if(v1==v2){
            res=v1;
        }
        return res;
    }

    //función auxiliar negar el centinela entero
    public static Integer negacionEntera(Integer v){
        Integer resultado = 0;
        if(v==0){
            resultado=1;
        }
        return resultado;
    }
}