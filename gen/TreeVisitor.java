// Generated from C:/Users/sebyn/Downloads/Compiler_Assignment/src\impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TreeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TreeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TreeParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(TreeParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreeParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(TreeParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreeParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(TreeParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TreeParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(TreeParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(TreeParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(TreeParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(TreeParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(TreeParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(TreeParser.AndContext ctx);
}