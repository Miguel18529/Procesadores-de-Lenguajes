// Generated from C:/Users/amigo/IdeaProjects/Lenguaje r/src\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Anasint.TipoContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(Anasint.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_lista(Anasint.Expr_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#lista_por_extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_por_extension(Anasint.Lista_por_extensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#lista_append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_append(Anasint.Lista_appendContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Anasint.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_entera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_entera(Anasint.Expr_enteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_booleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_booleana(Anasint.Expr_booleanaContext ctx);
}