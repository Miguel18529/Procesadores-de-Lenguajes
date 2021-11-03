// Generated from C:/Users/amigo/IdeaProjects/intexp\Anasint.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link Anasint#declaracion_variables}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variables(Anasint.Declaracion_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#declaracion_variables}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variables(Anasint.Declaracion_variablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ids}
	 * labeled alternative in {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterIds(Anasint.IdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ids}
	 * labeled alternative in {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitIds(Anasint.IdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterId(Anasint.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitId(Anasint.IdContext ctx);
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
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterPar(Anasint.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitPar(Anasint.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarNoAmb}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterVarNoAmb(Anasint.VarNoAmbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarNoAmb}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitVarNoAmb(Anasint.VarNoAmbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterVar(Anasint.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitVar(Anasint.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterNum(Anasint.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitNum(Anasint.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpBin}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterOpBin(Anasint.OpBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpBin}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitOpBin(Anasint.OpBinContext ctx);
}