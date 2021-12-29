// Generated from C:/Users/amigo/IdeaProjects/PLLab/src\Anasint.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link Anasint#l_hib}.
	 * @param ctx the parse tree
	 */
	void enterL_hib(Anasint.L_hibContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#l_hib}.
	 * @param ctx the parse tree
	 */
	void exitL_hib(Anasint.L_hibContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#l_bool}.
	 * @param ctx the parse tree
	 */
	void enterL_bool(Anasint.L_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#l_bool}.
	 * @param ctx the parse tree
	 */
	void exitL_bool(Anasint.L_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#l_int}.
	 * @param ctx the parse tree
	 */
	void enterL_int(Anasint.L_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#l_int}.
	 * @param ctx the parse tree
	 */
	void exitL_int(Anasint.L_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(Anasint.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(Anasint.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(Anasint.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(Anasint.BoolContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(Anasint.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(Anasint.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(Anasint.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(Anasint.ListaContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#lista_entera}.
	 * @param ctx the parse tree
	 */
	void enterLista_entera(Anasint.Lista_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#lista_entera}.
	 * @param ctx the parse tree
	 */
	void exitLista_entera(Anasint.Lista_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#lista_booleana}.
	 * @param ctx the parse tree
	 */
	void enterLista_booleana(Anasint.Lista_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#lista_booleana}.
	 * @param ctx the parse tree
	 */
	void exitLista_booleana(Anasint.Lista_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#lista_hibrida}.
	 * @param ctx the parse tree
	 */
	void enterLista_hibrida(Anasint.Lista_hibridaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#lista_hibrida}.
	 * @param ctx the parse tree
	 */
	void exitLista_hibrida(Anasint.Lista_hibridaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_entera}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_entera(Anasint.Expresion_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_entera}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_entera(Anasint.Expresion_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_booleana}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_booleana(Anasint.Expresion_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_booleana}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_booleana(Anasint.Expresion_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#funcion_booleana}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_booleana(Anasint.Funcion_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#funcion_booleana}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_booleana(Anasint.Funcion_booleanaContext ctx);
}