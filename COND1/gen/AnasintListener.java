// Generated from C:/Users/amigo/IdeaProjects/COND1/src\Anasint.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link Anasint#lista_vars}.
	 * @param ctx the parse tree
	 */
	void enterLista_vars(Anasint.Lista_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#lista_vars}.
	 * @param ctx the parse tree
	 */
	void exitLista_vars(Anasint.Lista_varsContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#lista_instrs}.
	 * @param ctx the parse tree
	 */
	void enterLista_instrs(Anasint.Lista_instrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#lista_instrs}.
	 * @param ctx the parse tree
	 */
	void exitLista_instrs(Anasint.Lista_instrsContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#alternativa}.
	 * @param ctx the parse tree
	 */
	void enterAlternativa(Anasint.AlternativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#alternativa}.
	 * @param ctx the parse tree
	 */
	void exitAlternativa(Anasint.AlternativaContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(Anasint.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(Anasint.ImpresionContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(Anasint.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(Anasint.CondicionContext ctx);
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
}