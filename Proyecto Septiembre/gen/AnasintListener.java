// Generated from C:/Users/amigo/IdeaProjects/Proyecto Septiembre/src\Anasint.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link Anasint#especificaciones}.
	 * @param ctx the parse tree
	 */
	void enterEspecificaciones(Anasint.EspecificacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#especificaciones}.
	 * @param ctx the parse tree
	 */
	void exitEspecificaciones(Anasint.EspecificacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#clases}.
	 * @param ctx the parse tree
	 */
	void enterClases(Anasint.ClasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#clases}.
	 * @param ctx the parse tree
	 */
	void exitClases(Anasint.ClasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#clase}.
	 * @param ctx the parse tree
	 */
	void enterClase(Anasint.ClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#clase}.
	 * @param ctx the parse tree
	 */
	void exitClase(Anasint.ClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#atributos}.
	 * @param ctx the parse tree
	 */
	void enterAtributos(Anasint.AtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#atributos}.
	 * @param ctx the parse tree
	 */
	void exitAtributos(Anasint.AtributosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(Anasint.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(Anasint.AtributoContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#asociaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsociaciones(Anasint.AsociacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asociaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsociaciones(Anasint.AsociacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asociacion}.
	 * @param ctx the parse tree
	 */
	void enterAsociacion(Anasint.AsociacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asociacion}.
	 * @param ctx the parse tree
	 */
	void exitAsociacion(Anasint.AsociacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#contenido}.
	 * @param ctx the parse tree
	 */
	void enterContenido(Anasint.ContenidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#contenido}.
	 * @param ctx the parse tree
	 */
	void exitContenido(Anasint.ContenidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#cont1}.
	 * @param ctx the parse tree
	 */
	void enterCont1(Anasint.Cont1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#cont1}.
	 * @param ctx the parse tree
	 */
	void exitCont1(Anasint.Cont1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#cont2}.
	 * @param ctx the parse tree
	 */
	void enterCont2(Anasint.Cont2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#cont2}.
	 * @param ctx the parse tree
	 */
	void exitCont2(Anasint.Cont2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(Anasint.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(Anasint.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#generalizaciones}.
	 * @param ctx the parse tree
	 */
	void enterGeneralizaciones(Anasint.GeneralizacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#generalizaciones}.
	 * @param ctx the parse tree
	 */
	void exitGeneralizaciones(Anasint.GeneralizacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#generalizacion}.
	 * @param ctx the parse tree
	 */
	void enterGeneralizacion(Anasint.GeneralizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#generalizacion}.
	 * @param ctx the parse tree
	 */
	void exitGeneralizacion(Anasint.GeneralizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#superclase}.
	 * @param ctx the parse tree
	 */
	void enterSuperclase(Anasint.SuperclaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#superclase}.
	 * @param ctx the parse tree
	 */
	void exitSuperclase(Anasint.SuperclaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#subclases}.
	 * @param ctx the parse tree
	 */
	void enterSubclases(Anasint.SubclasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#subclases}.
	 * @param ctx the parse tree
	 */
	void exitSubclases(Anasint.SubclasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#restricciones}.
	 * @param ctx the parse tree
	 */
	void enterRestricciones(Anasint.RestriccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#restricciones}.
	 * @param ctx the parse tree
	 */
	void exitRestricciones(Anasint.RestriccionesContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#crear}.
	 * @param ctx the parse tree
	 */
	void enterCrear(Anasint.CrearContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#crear}.
	 * @param ctx the parse tree
	 */
	void exitCrear(Anasint.CrearContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(Anasint.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(Anasint.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#cont_objeto}.
	 * @param ctx the parse tree
	 */
	void enterCont_objeto(Anasint.Cont_objetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#cont_objeto}.
	 * @param ctx the parse tree
	 */
	void exitCont_objeto(Anasint.Cont_objetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#clase_objeto}.
	 * @param ctx the parse tree
	 */
	void enterClase_objeto(Anasint.Clase_objetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#clase_objeto}.
	 * @param ctx the parse tree
	 */
	void exitClase_objeto(Anasint.Clase_objetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#atrib_objeto}.
	 * @param ctx the parse tree
	 */
	void enterAtrib_objeto(Anasint.Atrib_objetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#atrib_objeto}.
	 * @param ctx the parse tree
	 */
	void exitAtrib_objeto(Anasint.Atrib_objetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#valor_objeto}.
	 * @param ctx the parse tree
	 */
	void enterValor_objeto(Anasint.Valor_objetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#valor_objeto}.
	 * @param ctx the parse tree
	 */
	void exitValor_objeto(Anasint.Valor_objetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#enlace}.
	 * @param ctx the parse tree
	 */
	void enterEnlace(Anasint.EnlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#enlace}.
	 * @param ctx the parse tree
	 */
	void exitEnlace(Anasint.EnlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#contenido_enlace}.
	 * @param ctx the parse tree
	 */
	void enterContenido_enlace(Anasint.Contenido_enlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#contenido_enlace}.
	 * @param ctx the parse tree
	 */
	void exitContenido_enlace(Anasint.Contenido_enlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asociacion_enlace}.
	 * @param ctx the parse tree
	 */
	void enterAsociacion_enlace(Anasint.Asociacion_enlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asociacion_enlace}.
	 * @param ctx the parse tree
	 */
	void exitAsociacion_enlace(Anasint.Asociacion_enlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#objetos_enlace}.
	 * @param ctx the parse tree
	 */
	void enterObjetos_enlace(Anasint.Objetos_enlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#objetos_enlace}.
	 * @param ctx the parse tree
	 */
	void exitObjetos_enlace(Anasint.Objetos_enlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(Anasint.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(Anasint.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#eliminar}.
	 * @param ctx the parse tree
	 */
	void enterEliminar(Anasint.EliminarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#eliminar}.
	 * @param ctx the parse tree
	 */
	void exitEliminar(Anasint.EliminarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#consistencia}.
	 * @param ctx the parse tree
	 */
	void enterConsistencia(Anasint.ConsistenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#consistencia}.
	 * @param ctx the parse tree
	 */
	void exitConsistencia(Anasint.ConsistenciaContext ctx);
}