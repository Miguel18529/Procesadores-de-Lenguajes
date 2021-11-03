// Generated from C:/Users/amigo/IdeaProjects/Proyecto Septiembre/src\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link Anasint#especificaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspecificaciones(Anasint.EspecificacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#clases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClases(Anasint.ClasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClase(Anasint.ClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#atributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributos(Anasint.AtributosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#atributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributo(Anasint.AtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Anasint.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asociaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsociaciones(Anasint.AsociacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asociacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsociacion(Anasint.AsociacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(Anasint.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#cont1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont1(Anasint.Cont1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#cont2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont2(Anasint.Cont2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(Anasint.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#generalizaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralizaciones(Anasint.GeneralizacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#generalizacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralizacion(Anasint.GeneralizacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#superclase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclase(Anasint.SuperclaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#subclases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubclases(Anasint.SubclasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#restricciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestricciones(Anasint.RestriccionesContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#crear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrear(Anasint.CrearContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(Anasint.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#cont_objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont_objeto(Anasint.Cont_objetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#clase_objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClase_objeto(Anasint.Clase_objetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#atrib_objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib_objeto(Anasint.Atrib_objetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#valor_objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_objeto(Anasint.Valor_objetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#enlace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnlace(Anasint.EnlaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#contenido_enlace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido_enlace(Anasint.Contenido_enlaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asociacion_enlace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsociacion_enlace(Anasint.Asociacion_enlaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#objetos_enlace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetos_enlace(Anasint.Objetos_enlaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(Anasint.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#eliminar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEliminar(Anasint.EliminarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#consistencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsistencia(Anasint.ConsistenciaContext ctx);
}