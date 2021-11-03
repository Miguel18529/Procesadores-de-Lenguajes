public class Anasem extends AnasintBaseListener{

    VerificarAmbiguedad verificador = new VerificarAmbiguedad();

    int contador_instr = 0;


    //variables: IDENT COMA variables {almacenamos (IDENT, ambiguo) en el almacén}	#Ids
	//	 | IDENT {almacenamos (IDENT, ambiguo) en el almacén}	#Id
    //;

    public void exitIds(Anasint.IdsContext ctx) {
        verificador.memoria.put(ctx.IDENT().getText(), true);
    }

    public void exitId(Anasint.IdContext ctx) {
        verificador.memoria.put(ctx.IDENT().getText(), true);
    }

    public void exitAsignacion(Anasint.AsignacionContext ctx){
        contador_instr++;

        String instr = ctx.IDENT().getText()+ ' '+ctx.ASIG().getText()+ ' ' + ctx.expresion().getText();

        Boolean c = verificador.visit(ctx.expresion());

        verificador.memoria.put(ctx.IDENT().getText(), c);

        if (c) System.out.println("Asignacion : "+instr+ " es ambigua (Linea: " + ctx.IDENT().getSymbol().getText()+ ". Instruccion: " + contador_instr+")");
    }
}



