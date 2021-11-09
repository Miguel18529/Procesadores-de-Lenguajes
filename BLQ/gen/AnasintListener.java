// Generated from C:/Users/amigo/IdeaProjects/BLQ/src\Anasint.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Anasint.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Anasint.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(Anasint.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(Anasint.VarsContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(Anasint.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(Anasint.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(Anasint.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(Anasint.Expr2Context ctx);
}