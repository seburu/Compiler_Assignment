// Generated from C:/Users/sebyn/Downloads/Compiler_Assignment/src\impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(implParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(implParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(implParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(implParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(implParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(implParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(implParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(implParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(implParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(implParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(implParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(implParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(implParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(implParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(implParser.AndContext ctx);
}