// Generated from C:/Users/amigo/IdeaProjects/Lenguaje r/src\Anasint.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link Anasint#definicion_variables}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_variables(Anasint.Definicion_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#definicion_variables}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_variables(Anasint.Definicion_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(Anasint.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(Anasint.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#idents}.
	 * @param ctx the parse tree
	 */
	void enterIdents(Anasint.IdentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#idents}.
	 * @param ctx the parse tree
	 */
	void exitIdents(Anasint.IdentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsignaciones(Anasint.AsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsignaciones(Anasint.AsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(Anasint.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(Anasint.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr_lista}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lista(Anasint.Expr_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr_lista}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lista(Anasint.Expr_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#lista_por_extension}.
	 * @param ctx the parse tree
	 */
	void enterLista_por_extension(Anasint.Lista_por_extensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#lista_por_extension}.
	 * @param ctx the parse tree
	 */
	void exitLista_por_extension(Anasint.Lista_por_extensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#lista_append}.
	 * @param ctx the parse tree
	 */
	void enterLista_append(Anasint.Lista_appendContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#lista_append}.
	 * @param ctx the parse tree
	 */
	void exitLista_append(Anasint.Lista_appendContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Anasint.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Anasint.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr_entera}.
	 * @param ctx the parse tree
	 */
	void enterExpr_entera(Anasint.Expr_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr_entera}.
	 * @param ctx the parse tree
	 */
	void exitExpr_entera(Anasint.Expr_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr_booleana}.
	 * @param ctx the parse tree
	 */
	void enterExpr_booleana(Anasint.Expr_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr_booleana}.
	 * @param ctx the parse tree
	 */
	void exitExpr_booleana(Anasint.Expr_booleanaContext ctx);
}