// Generated from C:/Users/amigo/IdeaProjects/Proyecto en grupo\Anasint.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 */
	void enterSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 */
	void exitSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(Anasint.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(Anasint.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#entradas}.
	 * @param ctx the parse tree
	 */
	void enterEntradas(Anasint.EntradasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#entradas}.
	 * @param ctx the parse tree
	 */
	void exitEntradas(Anasint.EntradasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#salidas}.
	 * @param ctx the parse tree
	 */
	void enterSalidas(Anasint.SalidasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#salidas}.
	 * @param ctx the parse tree
	 */
	void exitSalidas(Anasint.SalidasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#predicado}.
	 * @param ctx the parse tree
	 */
	void enterPredicado(Anasint.PredicadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#predicado}.
	 * @param ctx the parse tree
	 */
	void exitPredicado(Anasint.PredicadoContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#nombreVariable}.
	 * @param ctx the parse tree
	 */
	void enterNombreVariable(Anasint.NombreVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#nombreVariable}.
	 * @param ctx the parse tree
	 */
	void exitNombreVariable(Anasint.NombreVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(Anasint.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(Anasint.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#secuencia}.
	 * @param ctx the parse tree
	 */
	void enterSecuencia(Anasint.SecuenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#secuencia}.
	 * @param ctx the parse tree
	 */
	void exitSecuencia(Anasint.SecuenciaContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(Anasint.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(Anasint.InstruccionContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_entera}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_entera(Anasint.Expresion_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_entera}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_entera(Anasint.Expresion_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(Anasint.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(Anasint.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#llamada_secuencia}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_secuencia(Anasint.Llamada_secuenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#llamada_secuencia}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_secuencia(Anasint.Llamada_secuenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_secuencia_entera}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_secuencia_entera(Anasint.Expresion_secuencia_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_secuencia_entera}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_secuencia_entera(Anasint.Expresion_secuencia_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_secuencia_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_secuencia_logica(Anasint.Expresion_secuencia_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_secuencia_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_secuencia_logica(Anasint.Expresion_secuencia_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica(Anasint.Expresion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica(Anasint.Expresion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterCondicionales(Anasint.CondicionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitCondicionales(Anasint.CondicionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(Anasint.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(Anasint.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#concatenar}.
	 * @param ctx the parse tree
	 */
	void enterConcatenar(Anasint.ConcatenarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#concatenar}.
	 * @param ctx the parse tree
	 */
	void exitConcatenar(Anasint.ConcatenarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#igualdades}.
	 * @param ctx the parse tree
	 */
	void enterIgualdades(Anasint.IgualdadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#igualdades}.
	 * @param ctx the parse tree
	 */
	void exitIgualdades(Anasint.IgualdadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#desigualdades}.
	 * @param ctx the parse tree
	 */
	void enterDesigualdades(Anasint.DesigualdadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#desigualdades}.
	 * @param ctx the parse tree
	 */
	void exitDesigualdades(Anasint.DesigualdadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_condicional}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_condicional(Anasint.Expresion_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_condicional}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_condicional(Anasint.Expresion_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 */
	void enterIteracion(Anasint.IteracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 */
	void exitIteracion(Anasint.IteracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 */
	void enterRuptura(Anasint.RupturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 */
	void exitRuptura(Anasint.RupturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#resultado}.
	 * @param ctx the parse tree
	 */
	void enterResultado(Anasint.ResultadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#resultado}.
	 * @param ctx the parse tree
	 */
	void exitResultado(Anasint.ResultadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#valor_devuelto}.
	 * @param ctx the parse tree
	 */
	void enterValor_devuelto(Anasint.Valor_devueltoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#valor_devuelto}.
	 * @param ctx the parse tree
	 */
	void exitValor_devuelto(Anasint.Valor_devueltoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(Anasint.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(Anasint.MostrarContext ctx);
}