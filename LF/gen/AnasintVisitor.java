// Generated from C:/Users/amigo/IdeaProjects/Ejemplo1/src\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by the {@code Prog}
	 * labeled alternative in {@link Anasint#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Anasint.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vars}
	 * labeled alternative in {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(Anasint.VarsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ids}
	 * labeled alternative in {@link Anasint#idents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(Anasint.IdsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Anasint#idents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Anasint.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Instrs}
	 * labeled alternative in {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrs(Anasint.InstrsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Def}
	 * labeled alternative in {@link Anasint#definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(Anasint.DefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ev}
	 * labeled alternative in {@link Anasint#evaluacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEv(Anasint.EvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(Anasint.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(Anasint.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(Anasint.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MenosExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenosExpr(Anasint.MenosExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnarioMenosExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarioMenosExpr(Anasint.UnarioMenosExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PorExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPorExpr(Anasint.PorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MasExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasExpr(Anasint.MasExprContext ctx);
}