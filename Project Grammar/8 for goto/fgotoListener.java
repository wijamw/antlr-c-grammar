// Generated from fgoto.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fgotoParser}.
 */
public interface fgotoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fgotoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(fgotoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(fgotoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(fgotoParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(fgotoParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(fgotoParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(fgotoParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(fgotoParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(fgotoParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(fgotoParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(fgotoParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(fgotoParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(fgotoParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(fgotoParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(fgotoParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(fgotoParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(fgotoParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(fgotoParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(fgotoParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(fgotoParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(fgotoParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(fgotoParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(fgotoParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(fgotoParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(fgotoParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(fgotoParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(fgotoParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(fgotoParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(fgotoParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link fgotoParser#declaration_expression}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_expression(fgotoParser.Declaration_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fgotoParser#declaration_expression}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_expression(fgotoParser.Declaration_expressionContext ctx);
}