// Generated from C:/Users/amigo/IdeaProjects/Procesadores-de-Lenguajes/Diagramas_de_Estados/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#diagrama}.
	 * @param ctx the parse tree
	 */
	void enterDiagrama(Anasint.DiagramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#diagrama}.
	 * @param ctx the parse tree
	 */
	void exitDiagrama(Anasint.DiagramaContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(Anasint.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(Anasint.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#estados}.
	 * @param ctx the parse tree
	 */
	void enterEstados(Anasint.EstadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#estados}.
	 * @param ctx the parse tree
	 */
	void exitEstados(Anasint.EstadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(Anasint.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(Anasint.EstadoContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#inicial}.
	 * @param ctx the parse tree
	 */
	void enterInicial(Anasint.InicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#inicial}.
	 * @param ctx the parse tree
	 */
	void exitInicial(Anasint.InicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#transiciones}.
	 * @param ctx the parse tree
	 */
	void enterTransiciones(Anasint.TransicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#transiciones}.
	 * @param ctx the parse tree
	 */
	void exitTransiciones(Anasint.TransicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#transicion}.
	 * @param ctx the parse tree
	 */
	void enterTransicion(Anasint.TransicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#transicion}.
	 * @param ctx the parse tree
	 */
	void exitTransicion(Anasint.TransicionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condPar}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondPar(Anasint.CondParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condPar}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondPar(Anasint.CondParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condMayor}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondMayor(Anasint.CondMayorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condMayor}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondMayor(Anasint.CondMayorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condIgual}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondIgual(Anasint.CondIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condIgual}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondIgual(Anasint.CondIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condY}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondY(Anasint.CondYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condY}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondY(Anasint.CondYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condMenorIgual}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondMenorIgual(Anasint.CondMenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condMenorIgual}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondMenorIgual(Anasint.CondMenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condMayorIgual}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondMayorIgual(Anasint.CondMayorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condMayorIgual}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondMayorIgual(Anasint.CondMayorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condO}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondO(Anasint.CondOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condO}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondO(Anasint.CondOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condNo}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondNo(Anasint.CondNoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condNo}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondNo(Anasint.CondNoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condDistinto}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondDistinto(Anasint.CondDistintoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condDistinto}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondDistinto(Anasint.CondDistintoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condMenor}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondMenor(Anasint.CondMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condMenor}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondMenor(Anasint.CondMenorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Anasint.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Anasint.TermContext ctx);
}