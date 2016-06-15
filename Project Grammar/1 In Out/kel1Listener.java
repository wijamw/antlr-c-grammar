// Generated from kel1.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link kel1Parser}.
 */
public interface kel1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link kel1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(kel1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(kel1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link kel1Parser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(kel1Parser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(kel1Parser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link kel1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(kel1Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(kel1Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link kel1Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(kel1Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(kel1Parser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link kel1Parser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(kel1Parser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(kel1Parser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link kel1Parser#funcall}.
	 * @param ctx the parse tree
	 */
	void enterFuncall(kel1Parser.FuncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#funcall}.
	 * @param ctx the parse tree
	 */
	void exitFuncall(kel1Parser.FuncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link kel1Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(kel1Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(kel1Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link kel1Parser#alphabet}.
	 * @param ctx the parse tree
	 */
	void enterAlphabet(kel1Parser.AlphabetContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#alphabet}.
	 * @param ctx the parse tree
	 */
	void exitAlphabet(kel1Parser.AlphabetContext ctx);
	/**
	 * Enter a parse tree produced by {@link kel1Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(kel1Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(kel1Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link kel1Parser#tipedata}.
	 * @param ctx the parse tree
	 */
	void enterTipedata(kel1Parser.TipedataContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#tipedata}.
	 * @param ctx the parse tree
	 */
	void exitTipedata(kel1Parser.TipedataContext ctx);
	/**
	 * Enter a parse tree produced by {@link kel1Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(kel1Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link kel1Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(kel1Parser.VarContext ctx);
}