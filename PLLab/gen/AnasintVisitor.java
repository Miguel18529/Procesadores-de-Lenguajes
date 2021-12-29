// Generated from C:/Users/amigo/IdeaProjects/PLLab/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Anasint}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnasintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#definicion_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_variables(Anasint.Definicion_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#l_hib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_hib(Anasint.L_hibContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#l_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_bool(Anasint.L_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#l_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_int(Anasint.L_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Anasint.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(Anasint.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#idents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdents(Anasint.IdentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignaciones(Anasint.AsignacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(Anasint.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(Anasint.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_lista(Anasint.Expr_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#lista_entera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_entera(Anasint.Lista_enteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#lista_booleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_booleana(Anasint.Lista_booleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#lista_hibrida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_hibrida(Anasint.Lista_hibridaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion_entera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_entera(Anasint.Expresion_enteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion_booleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_booleana(Anasint.Expresion_booleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funcion_booleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_booleana(Anasint.Funcion_booleanaContext ctx);
}