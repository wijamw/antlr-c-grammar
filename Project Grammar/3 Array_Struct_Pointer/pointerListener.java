// Generated from pointer.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pointerParser}.
 */
public interface pointerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pointerParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(pointerParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link pointerParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(pointerParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link pointerParser#init_pointer1}.
	 * @param ctx the parse tree
	 */
	void enterInit_pointer1(pointerParser.Init_pointer1Context ctx);
	/**
	 * Exit a parse tree produced by {@link pointerParser#init_pointer1}.
	 * @param ctx the parse tree
	 */
	void exitInit_pointer1(pointerParser.Init_pointer1Context ctx);
	/**
	 * Enter a parse tree produced by {@link pointerParser#init_pointer2}.
	 * @param ctx the parse tree
	 */
	void enterInit_pointer2(pointerParser.Init_pointer2Context ctx);
	/**
	 * Exit a parse tree produced by {@link pointerParser#init_pointer2}.
	 * @param ctx the parse tree
	 */
	void exitInit_pointer2(pointerParser.Init_pointer2Context ctx);
	/**
	 * Enter a parse tree produced by {@link pointerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(pointerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pointerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(pointerParser.TypeContext ctx);
}