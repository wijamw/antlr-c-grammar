// Generated from inisialisasi.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link inisialisasiParser}.
 */
public interface inisialisasiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(inisialisasiParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(inisialisasiParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(inisialisasiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(inisialisasiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(inisialisasiParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(inisialisasiParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(inisialisasiParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(inisialisasiParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(inisialisasiParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(inisialisasiParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(inisialisasiParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(inisialisasiParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(inisialisasiParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(inisialisasiParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(inisialisasiParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(inisialisasiParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#indec}.
	 * @param ctx the parse tree
	 */
	void enterIndec(inisialisasiParser.IndecContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#indec}.
	 * @param ctx the parse tree
	 */
	void exitIndec(inisialisasiParser.IndecContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(inisialisasiParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(inisialisasiParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#matem}.
	 * @param ctx the parse tree
	 */
	void enterMatem(inisialisasiParser.MatemContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#matem}.
	 * @param ctx the parse tree
	 */
	void exitMatem(inisialisasiParser.MatemContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#aritmatich}.
	 * @param ctx the parse tree
	 */
	void enterAritmatich(inisialisasiParser.AritmatichContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#aritmatich}.
	 * @param ctx the parse tree
	 */
	void exitAritmatich(inisialisasiParser.AritmatichContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernary(inisialisasiParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernary(inisialisasiParser.TernaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(inisialisasiParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(inisialisasiParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#type_int}.
	 * @param ctx the parse tree
	 */
	void enterType_int(inisialisasiParser.Type_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#type_int}.
	 * @param ctx the parse tree
	 */
	void exitType_int(inisialisasiParser.Type_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#init_struct}.
	 * @param ctx the parse tree
	 */
	void enterInit_struct(inisialisasiParser.Init_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#init_struct}.
	 * @param ctx the parse tree
	 */
	void exitInit_struct(inisialisasiParser.Init_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(inisialisasiParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(inisialisasiParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#init_array1}.
	 * @param ctx the parse tree
	 */
	void enterInit_array1(inisialisasiParser.Init_array1Context ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#init_array1}.
	 * @param ctx the parse tree
	 */
	void exitInit_array1(inisialisasiParser.Init_array1Context ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#init_array2}.
	 * @param ctx the parse tree
	 */
	void enterInit_array2(inisialisasiParser.Init_array2Context ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#init_array2}.
	 * @param ctx the parse tree
	 */
	void exitInit_array2(inisialisasiParser.Init_array2Context ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#init_array3}.
	 * @param ctx the parse tree
	 */
	void enterInit_array3(inisialisasiParser.Init_array3Context ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#init_array3}.
	 * @param ctx the parse tree
	 */
	void exitInit_array3(inisialisasiParser.Init_array3Context ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#init_array4}.
	 * @param ctx the parse tree
	 */
	void enterInit_array4(inisialisasiParser.Init_array4Context ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#init_array4}.
	 * @param ctx the parse tree
	 */
	void exitInit_array4(inisialisasiParser.Init_array4Context ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#value1}.
	 * @param ctx the parse tree
	 */
	void enterValue1(inisialisasiParser.Value1Context ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#value1}.
	 * @param ctx the parse tree
	 */
	void exitValue1(inisialisasiParser.Value1Context ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#value2}.
	 * @param ctx the parse tree
	 */
	void enterValue2(inisialisasiParser.Value2Context ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#value2}.
	 * @param ctx the parse tree
	 */
	void exitValue2(inisialisasiParser.Value2Context ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#value3}.
	 * @param ctx the parse tree
	 */
	void enterValue3(inisialisasiParser.Value3Context ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#value3}.
	 * @param ctx the parse tree
	 */
	void exitValue3(inisialisasiParser.Value3Context ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#value4}.
	 * @param ctx the parse tree
	 */
	void enterValue4(inisialisasiParser.Value4Context ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#value4}.
	 * @param ctx the parse tree
	 */
	void exitValue4(inisialisasiParser.Value4Context ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#type_CHAR}.
	 * @param ctx the parse tree
	 */
	void enterType_CHAR(inisialisasiParser.Type_CHARContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#type_CHAR}.
	 * @param ctx the parse tree
	 */
	void exitType_CHAR(inisialisasiParser.Type_CHARContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#type_FLOAT}.
	 * @param ctx the parse tree
	 */
	void enterType_FLOAT(inisialisasiParser.Type_FLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#type_FLOAT}.
	 * @param ctx the parse tree
	 */
	void exitType_FLOAT(inisialisasiParser.Type_FLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#type_DOUBLE}.
	 * @param ctx the parse tree
	 */
	void enterType_DOUBLE(inisialisasiParser.Type_DOUBLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#type_DOUBLE}.
	 * @param ctx the parse tree
	 */
	void exitType_DOUBLE(inisialisasiParser.Type_DOUBLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#type_INT}.
	 * @param ctx the parse tree
	 */
	void enterType_INT(inisialisasiParser.Type_INTContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#type_INT}.
	 * @param ctx the parse tree
	 */
	void exitType_INT(inisialisasiParser.Type_INTContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#init_pointer1}.
	 * @param ctx the parse tree
	 */
	void enterInit_pointer1(inisialisasiParser.Init_pointer1Context ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#init_pointer1}.
	 * @param ctx the parse tree
	 */
	void exitInit_pointer1(inisialisasiParser.Init_pointer1Context ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#init_pointer2}.
	 * @param ctx the parse tree
	 */
	void enterInit_pointer2(inisialisasiParser.Init_pointer2Context ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#init_pointer2}.
	 * @param ctx the parse tree
	 */
	void exitInit_pointer2(inisialisasiParser.Init_pointer2Context ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#deklarasi}.
	 * @param ctx the parse tree
	 */
	void enterDeklarasi(inisialisasiParser.DeklarasiContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#deklarasi}.
	 * @param ctx the parse tree
	 */
	void exitDeklarasi(inisialisasiParser.DeklarasiContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#typedata}.
	 * @param ctx the parse tree
	 */
	void enterTypedata(inisialisasiParser.TypedataContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#typedata}.
	 * @param ctx the parse tree
	 */
	void exitTypedata(inisialisasiParser.TypedataContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#type_data}.
	 * @param ctx the parse tree
	 */
	void enterType_data(inisialisasiParser.Type_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#type_data}.
	 * @param ctx the parse tree
	 */
	void exitType_data(inisialisasiParser.Type_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#integer_s}.
	 * @param ctx the parse tree
	 */
	void enterInteger_s(inisialisasiParser.Integer_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#integer_s}.
	 * @param ctx the parse tree
	 */
	void exitInteger_s(inisialisasiParser.Integer_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#integer_v}.
	 * @param ctx the parse tree
	 */
	void enterInteger_v(inisialisasiParser.Integer_vContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#integer_v}.
	 * @param ctx the parse tree
	 */
	void exitInteger_v(inisialisasiParser.Integer_vContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#char_s}.
	 * @param ctx the parse tree
	 */
	void enterChar_s(inisialisasiParser.Char_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#char_s}.
	 * @param ctx the parse tree
	 */
	void exitChar_s(inisialisasiParser.Char_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#char_v}.
	 * @param ctx the parse tree
	 */
	void enterChar_v(inisialisasiParser.Char_vContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#char_v}.
	 * @param ctx the parse tree
	 */
	void exitChar_v(inisialisasiParser.Char_vContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#float_s}.
	 * @param ctx the parse tree
	 */
	void enterFloat_s(inisialisasiParser.Float_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#float_s}.
	 * @param ctx the parse tree
	 */
	void exitFloat_s(inisialisasiParser.Float_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#float_v}.
	 * @param ctx the parse tree
	 */
	void enterFloat_v(inisialisasiParser.Float_vContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#float_v}.
	 * @param ctx the parse tree
	 */
	void exitFloat_v(inisialisasiParser.Float_vContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#double_s}.
	 * @param ctx the parse tree
	 */
	void enterDouble_s(inisialisasiParser.Double_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#double_s}.
	 * @param ctx the parse tree
	 */
	void exitDouble_s(inisialisasiParser.Double_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#double_v}.
	 * @param ctx the parse tree
	 */
	void enterDouble_v(inisialisasiParser.Double_vContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#double_v}.
	 * @param ctx the parse tree
	 */
	void exitDouble_v(inisialisasiParser.Double_vContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#boolean_s}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_s(inisialisasiParser.Boolean_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#boolean_s}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_s(inisialisasiParser.Boolean_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#boolean_v}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_v(inisialisasiParser.Boolean_vContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#boolean_v}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_v(inisialisasiParser.Boolean_vContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#switchcase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchcase(inisialisasiParser.SwitchcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#switchcase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchcase(inisialisasiParser.SwitchcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#init_switchcase}.
	 * @param ctx the parse tree
	 */
	void enterInit_switchcase(inisialisasiParser.Init_switchcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#init_switchcase}.
	 * @param ctx the parse tree
	 */
	void exitInit_switchcase(inisialisasiParser.Init_switchcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#swstatement}.
	 * @param ctx the parse tree
	 */
	void enterSwstatement(inisialisasiParser.SwstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#swstatement}.
	 * @param ctx the parse tree
	 */
	void exitSwstatement(inisialisasiParser.SwstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#swcase}.
	 * @param ctx the parse tree
	 */
	void enterSwcase(inisialisasiParser.SwcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#swcase}.
	 * @param ctx the parse tree
	 */
	void exitSwcase(inisialisasiParser.SwcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#swdefault}.
	 * @param ctx the parse tree
	 */
	void enterSwdefault(inisialisasiParser.SwdefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#swdefault}.
	 * @param ctx the parse tree
	 */
	void exitSwdefault(inisialisasiParser.SwdefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#statcase}.
	 * @param ctx the parse tree
	 */
	void enterStatcase(inisialisasiParser.StatcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#statcase}.
	 * @param ctx the parse tree
	 */
	void exitStatcase(inisialisasiParser.StatcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#jumpstat}.
	 * @param ctx the parse tree
	 */
	void enterJumpstat(inisialisasiParser.JumpstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#jumpstat}.
	 * @param ctx the parse tree
	 */
	void exitJumpstat(inisialisasiParser.JumpstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(inisialisasiParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(inisialisasiParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(inisialisasiParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(inisialisasiParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#init_while}.
	 * @param ctx the parse tree
	 */
	void enterInit_while(inisialisasiParser.Init_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#init_while}.
	 * @param ctx the parse tree
	 */
	void exitInit_while(inisialisasiParser.Init_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(inisialisasiParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(inisialisasiParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(inisialisasiParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(inisialisasiParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(inisialisasiParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(inisialisasiParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(inisialisasiParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(inisialisasiParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(inisialisasiParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(inisialisasiParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#init_for}.
	 * @param ctx the parse tree
	 */
	void enterInit_for(inisialisasiParser.Init_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#init_for}.
	 * @param ctx the parse tree
	 */
	void exitInit_for(inisialisasiParser.Init_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(inisialisasiParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(inisialisasiParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(inisialisasiParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(inisialisasiParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link inisialisasiParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(inisialisasiParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link inisialisasiParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(inisialisasiParser.JumpStatementContext ctx);
}