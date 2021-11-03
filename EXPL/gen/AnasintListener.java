// Generated from C:/Users/amigo/IdeaProjects/Procesadores-de-Lenguajes/EXPL/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(Anasint.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(Anasint.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 */
	void enterIteracion(Anasint.IteracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 */
	void exitIteracion(Anasint.IteracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#seleccion}.
	 * @param ctx the parse tree
	 */
	void enterSeleccion(Anasint.SeleccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#seleccion}.
	 * @param ctx the parse tree
	 */
	void exitSeleccion(Anasint.SeleccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 */
	void enterRuptura(Anasint.RupturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 */
	void exitRuptura(Anasint.RupturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(Anasint.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(Anasint.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Anasint.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Anasint.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr_suma}.
	 * @param ctx the parse tree
	 */
	void enterExpr_suma(Anasint.Expr_sumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr_suma}.
	 * @param ctx the parse tree
	 */
	void exitExpr_suma(Anasint.Expr_sumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(Anasint.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(Anasint.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterExpr_base(Anasint.Expr_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitExpr_base(Anasint.Expr_baseContext ctx);
}