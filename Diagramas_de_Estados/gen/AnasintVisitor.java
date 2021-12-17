// Generated from C:/Users/amigo/IdeaProjects/Diagramas_de_Estados/src\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link Anasint#diagrama}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagrama(Anasint.DiagramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(Anasint.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#estados}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstados(Anasint.EstadosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#estado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstado(Anasint.EstadoContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#inicial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicial(Anasint.InicialContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#transiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransiciones(Anasint.TransicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#transicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransicion(Anasint.TransicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condPar}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondPar(Anasint.CondParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condMayor}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondMayor(Anasint.CondMayorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condIgual}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondIgual(Anasint.CondIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condY}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondY(Anasint.CondYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condMenorIgual}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondMenorIgual(Anasint.CondMenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condMayorIgual}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondMayorIgual(Anasint.CondMayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condO}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondO(Anasint.CondOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condNo}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNo(Anasint.CondNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condDistinto}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondDistinto(Anasint.CondDistintoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condMenor}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondMenor(Anasint.CondMenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Anasint.TermContext ctx);
}