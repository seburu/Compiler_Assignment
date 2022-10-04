// Generated from C:/Users/sebyn/Downloads/Compiler_Assignment/src\impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(implParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(implParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(implParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(implParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(implParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(implParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(implParser.AndContext ctx);
}