// Generated from Project.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectParser}.
 */
public interface ProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjectParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ProjectParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ProjectParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ProjectParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ProjectParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#con}.
	 * @param ctx the parse tree
	 */
	void enterCon(ProjectParser.ConContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#con}.
	 * @param ctx the parse tree
	 */
	void exitCon(ProjectParser.ConContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ProjectParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ProjectParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(ProjectParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(ProjectParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#kondisi}.
	 * @param ctx the parse tree
	 */
	void enterKondisi(ProjectParser.KondisiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#kondisi}.
	 * @param ctx the parse tree
	 */
	void exitKondisi(ProjectParser.KondisiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(ProjectParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(ProjectParser.LogicContext ctx);
}