// Generated from switchcase.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link switchcaseParser}.
 */
public interface switchcaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(switchcaseParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(switchcaseParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#switchcase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchcase(switchcaseParser.SwitchcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#switchcase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchcase(switchcaseParser.SwitchcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(switchcaseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(switchcaseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#swstat}.
	 * @param ctx the parse tree
	 */
	void enterSwstat(switchcaseParser.SwstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#swstat}.
	 * @param ctx the parse tree
	 */
	void exitSwstat(switchcaseParser.SwstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#swcase}.
	 * @param ctx the parse tree
	 */
	void enterSwcase(switchcaseParser.SwcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#swcase}.
	 * @param ctx the parse tree
	 */
	void exitSwcase(switchcaseParser.SwcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#swdefault}.
	 * @param ctx the parse tree
	 */
	void enterSwdefault(switchcaseParser.SwdefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#swdefault}.
	 * @param ctx the parse tree
	 */
	void exitSwdefault(switchcaseParser.SwdefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#statcase}.
	 * @param ctx the parse tree
	 */
	void enterStatcase(switchcaseParser.StatcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#statcase}.
	 * @param ctx the parse tree
	 */
	void exitStatcase(switchcaseParser.StatcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#jumpstat}.
	 * @param ctx the parse tree
	 */
	void enterJumpstat(switchcaseParser.JumpstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#jumpstat}.
	 * @param ctx the parse tree
	 */
	void exitJumpstat(switchcaseParser.JumpstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(switchcaseParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(switchcaseParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#deklarasi}.
	 * @param ctx the parse tree
	 */
	void enterDeklarasi(switchcaseParser.DeklarasiContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#deklarasi}.
	 * @param ctx the parse tree
	 */
	void exitDeklarasi(switchcaseParser.DeklarasiContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclarator(switchcaseParser.InitdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclarator(switchcaseParser.InitdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#inisialisasi}.
	 * @param ctx the parse tree
	 */
	void enterInisialisasi(switchcaseParser.InisialisasiContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#inisialisasi}.
	 * @param ctx the parse tree
	 */
	void exitInisialisasi(switchcaseParser.InisialisasiContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#floatdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFloatdeclarator(switchcaseParser.FloatdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#floatdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFloatdeclarator(switchcaseParser.FloatdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(switchcaseParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(switchcaseParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchcaseParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(switchcaseParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchcaseParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(switchcaseParser.DeclContext ctx);
}