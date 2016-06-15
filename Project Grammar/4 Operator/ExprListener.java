// Generated from Expr.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#type_data}.
	 * @param ctx the parse tree
	 */
	void enterType_data(ExprParser.Type_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#type_data}.
	 * @param ctx the parse tree
	 */
	void exitType_data(ExprParser.Type_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(ExprParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(ExprParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#indec}.
	 * @param ctx the parse tree
	 */
	void enterIndec(ExprParser.IndecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#indec}.
	 * @param ctx the parse tree
	 */
	void exitIndec(ExprParser.IndecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(ExprParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(ExprParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#matem}.
	 * @param ctx the parse tree
	 */
	void enterMatem(ExprParser.MatemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#matem}.
	 * @param ctx the parse tree
	 */
	void exitMatem(ExprParser.MatemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#aritmatich}.
	 * @param ctx the parse tree
	 */
	void enterAritmatich(ExprParser.AritmatichContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#aritmatich}.
	 * @param ctx the parse tree
	 */
	void exitAritmatich(ExprParser.AritmatichContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernary(ExprParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernary(ExprParser.TernaryContext ctx);
}