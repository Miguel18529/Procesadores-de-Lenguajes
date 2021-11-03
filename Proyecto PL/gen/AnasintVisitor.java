// Generated from C:/Users/amigo/IdeaProjects/Proyecto PL/src\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(Anasint.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#nombreVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreVariable(Anasint.NombreVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Anasint.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuencia(Anasint.SecuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(Anasint.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#contenidoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenidoFuncion(Anasint.ContenidoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#nombreFuncionProcedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreFuncionProcedimiento(Anasint.NombreFuncionProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#contenidoProcedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenidoProcedimiento(Anasint.ContenidoProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#entradas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntradas(Anasint.EntradasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#salidas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalidas(Anasint.SalidasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(Anasint.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#valorAsignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorAsignacion(Anasint.ValorAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#nombresVariablesAsignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombresVariablesAsignacion(Anasint.NombresVariablesAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion_entera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_entera(Anasint.Expresion_enteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(Anasint.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#llamada_secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_secuencia(Anasint.Llamada_secuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_logica(Anasint.Expresion_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion_secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_secuencia(Anasint.Expresion_secuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion_secuencia_entera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_secuencia_entera(Anasint.Expresion_secuencia_enteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion_secuencia_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_secuencia_logica(Anasint.Expresion_secuencia_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#uso_predicado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUso_predicado(Anasint.Uso_predicadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(Anasint.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#igualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdad(Anasint.IgualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#desigualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesigualdad(Anasint.DesigualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#concatenador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenador(Anasint.ConcatenadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracion(Anasint.IteracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuptura(Anasint.RupturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(Anasint.MostrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#devolucion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevolucion(Anasint.DevolucionContext ctx);
}