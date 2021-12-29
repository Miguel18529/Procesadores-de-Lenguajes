// Generated from C:/Users/amigo/IdeaProjects/Ejemplo1/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Prog}
	 * labeled alternative in {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void enterProg(Anasint.ProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Prog}
	 * labeled alternative in {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void exitProg(Anasint.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vars}
	 * labeled alternative in {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterVars(Anasint.VarsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vars}
	 * labeled alternative in {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitVars(Anasint.VarsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ids}
	 * labeled alternative in {@link Anasint#idents}.
	 * @param ctx the parse tree
	 */
	void enterIds(Anasint.IdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ids}
	 * labeled alternative in {@link Anasint#idents}.
	 * @param ctx the parse tree
	 */
	void exitIds(Anasint.IdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Anasint#idents}.
	 * @param ctx the parse tree
	 */
	void enterId(Anasint.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Anasint#idents}.
	 * @param ctx the parse tree
	 */
	void exitId(Anasint.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Instrs}
	 * labeled alternative in {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrs(Anasint.InstrsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Instrs}
	 * labeled alternative in {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrs(Anasint.InstrsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Def}
	 * labeled alternative in {@link Anasint#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDef(Anasint.DefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Def}
	 * labeled alternative in {@link Anasint#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDef(Anasint.DefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ev}
	 * labeled alternative in {@link Anasint#evaluacion}.
	 * @param ctx the parse tree
	 */
	void enterEv(Anasint.EvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ev}
	 * labeled alternative in {@link Anasint#evaluacion}.
	 * @param ctx the parse tree
	 */
	void exitEv(Anasint.EvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(Anasint.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(Anasint.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(Anasint.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(Anasint.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(Anasint.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(Anasint.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MenosExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMenosExpr(Anasint.MenosExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MenosExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMenosExpr(Anasint.MenosExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnarioMenosExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterUnarioMenosExpr(Anasint.UnarioMenosExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnarioMenosExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitUnarioMenosExpr(Anasint.UnarioMenosExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PorExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterPorExpr(Anasint.PorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PorExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitPorExpr(Anasint.PorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MasExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMasExpr(Anasint.MasExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MasExpr}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMasExpr(Anasint.MasExprContext ctx);
}