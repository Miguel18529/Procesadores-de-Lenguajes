// Generated from C:/Users/amigo/IdeaProjects/intexp\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link Anasint#declaracion_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_variables(Anasint.Declaracion_variablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ids}
	 * labeled alternative in {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(Anasint.IdsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Anasint.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(Anasint.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarNoAmb}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNoAmb(Anasint.VarNoAmbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(Anasint.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(Anasint.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpBin}
	 * labeled alternative in {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBin(Anasint.OpBinContext ctx);
}