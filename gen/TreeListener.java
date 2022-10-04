// Generated from C:/Users/sebyn/Downloads/Compiler_Assignment/src\impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TreeParser}.
 */
public interface TreeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TreeParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TreeParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreeParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TreeParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreeParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(TreeParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreeParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(TreeParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreeParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(TreeParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreeParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(TreeParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TreeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TreeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(TreeParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(TreeParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(TreeParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(TreeParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(TreeParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(TreeParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(TreeParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(TreeParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(TreeParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(TreeParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(TreeParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link TreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(TreeParser.AndContext ctx);
}