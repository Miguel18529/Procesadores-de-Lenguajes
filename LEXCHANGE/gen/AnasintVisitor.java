// Generated from C:/Users/amigo/IdeaProjects/Procesadores-de-Lenguajes/LEXCHANGE/src\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link Anasint#esq_fuente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsq_fuente(Anasint.Esq_fuenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#clases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClases(Anasint.ClasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(Anasint.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#datos_fuente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatos_fuente(Anasint.Datos_fuenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#datos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatos(Anasint.DatosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#atribs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribs(Anasint.AtribsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#esq_destino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsq_destino(Anasint.Esq_destinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#restr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestr(Anasint.RestrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#restriccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriccion(Anasint.RestriccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#implicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicacion(Anasint.ImplicacionContext ctx);
}