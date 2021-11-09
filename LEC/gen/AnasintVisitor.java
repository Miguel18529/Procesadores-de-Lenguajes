// Generated from C:/Users/amigo/IdeaProjects/LEC/src\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link Anasint#contextos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextos(Anasint.ContextosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#contexto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContexto(Anasint.ContextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignaciones(Anasint.AsignacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#defecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefecto(Anasint.DefectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresiones(Anasint.ExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Anasint.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(Anasint.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(Anasint.Expr2Context ctx);
}