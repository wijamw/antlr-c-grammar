// Generated from Grammer.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammerParser}.
 */
public interface GrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammerParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(GrammerParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(GrammerParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(GrammerParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(GrammerParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#matem}.
	 * @param ctx the parse tree
	 */
	void enterMatem(GrammerParser.MatemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#matem}.
	 * @param ctx the parse tree
	 */
	void exitMatem(GrammerParser.MatemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(GrammerParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(GrammerParser.ArgContext ctx);
}