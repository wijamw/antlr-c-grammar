// Moh. Wijayanto - Sabtu 28 Mei 2016
// Senin 30 Mei 2016
// Attempt to Create C grammar

grammar CW;

file
: 	statementseq? EOF
;

//Statement
statementseq
:	
    statement
	| statementseq statement
;
statement
:   
    funcDeclar
    | labeledStatement
    | expr
    | varDeclar ';'
    | compoundStatement
    | selectionStatement
    | iterationStatement
    | jumpStatement
    | funcall
;


// For Statement
iterationStatement
    :   'for' '(' init? ';' condition? ';' state? ')' statement
    ;

init 
:   varDeclar
    | declaratorID
;

ifcondition
:   condition
    | condition logicalOperator condition
;

condition
:   declaratorID 
    | declaratorID relationalExpression initializerClause
;

state
:   unaryExpression declaratorID
    | declaratorID assignmentOperator initializerClause
    | declaratorID unaryExpression
;


//Switch
selectionStatement
: 	'switch' '(' condition ')' statement
    | 'if' '(' ifcondition ')' statement ('else' statement)?
;
//End of Switch

labeledStatement
:	'case' expr ':' statement
	| 'default' ':' statement
	| ID ':' statement
;

compoundStatement
:	'{' statementseq? '}'
;

jumpStatement
:	'break' ';'
	| 'continue' ';'
	| 'goto' expr ';'
	| 'return' expr? ';'
;

// Function
funcDeclar
: 	declarator '(' parameter? ')' statement 
    | declarator '(' parameter? ')' ';'
;

parameter
: 	declarator
    | parameter ',' declarator
;

funcall
: 	declaratorID '(' expr? ')' ';'
;

//declaratorID
varDeclar
:   declarator
    | assignment
;

declarator
:   type declaratorID 
    | type assignment //salah int c //=
;

declaratorID
:   declaratorID '[' indexArray? ']'		//array
    | declaratorID '(' declaratorID ')'	 
  	| '*' declaratorID 				//pointer
    | '(' declaratorID ')'
    | ID
;

indexArray
:   initializerClause
;

assignment
: 	declaratorID assignmentOperator initializerClause 
    | '*' ('*')? declaratorID assignmentOperator '&'? initializerClause
;

initializerClause
:   exprOperator
    | declaratorID
;

// Expression Statement
expr
:   exprOperator
    | expr ',' exprOperator
;

exprOperator
:	exprValue
    | exprValue assignmentOperator exprValue   
    | exprValue unaryOperator exprValue   
    | exprValue relationalExpression exprValue
;
exprValue
:	'(' expr ')'
    | '{' expr '}'
    | INT                    
    | ID
    | '\'' ID '\''    
    | STRING
;

/*exprList
: 	expr
	| exprList ',' expr 
;*/

// ==== LexerRules ====

type
    :   'void'
    |   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    |   'unsigned'
    |   'signed'
    |   'typedef'
    ;

//Operator
relationalExpression
    :   '<'	
    | 	'>' 
    | 	'<=' 
    | 	'>='
    |	'=='
    |	'!='
    ;
unaryExpression
    :   '++' 
    | 	'--' 
    ;
assignmentOperator
    : '=' 
    | '*=' 
    | '/=' 
    | '%=' 
    | '+=' 
    | '-=' 
    | '<<=' 
    | '>>=' 
    | '&=' 
    | '^=' 
    | '|='
    ;
unaryOperator
    :   '&' 
    | 	'*' 
    | 	'+' 
    | 	'-' 
    | 	'~' 
    | 	'!'
    |	'/'
    |   '^'
    |   '%'
    ;

logicalOperator
:   '&'
    | '&&'
    | '|'
    | '||'
    | '^'
;
// End operator

INT
    :   '-'? NUMBER '.' DIGIT EXP? // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? NUMBER EXP             // 1e10 -3e4
    |   '-'? NUMBER                 // -3, 45
    ;
ID 
	: ID_LETTER(ID_LETTER|DIGIT)* ; // From C language
fragment 
ID_LETTER 
	: [_a-zA-Z]+ ;
fragment 
DIGIT 
	: [0-9]+ ;	
fragment 
NUMBER 
    :   '0' | [1-9] [0-9]* ; // no leading zeros
fragment 
EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]
fragment
HEX : [0-9a-fA-F] ;

/* == Whitespace and Comment == */
Whitespace
:
	[ \t]+ -> skip
;

Newline
:
	(
		'\r' '\n'?
		| '\n'
	) -> skip
;

BlockComment
:
	'/*' .*? '*/' -> skip
;

LineComment
:
	'//' ~[\r\n]* -> skip
;
/* == End of Whitespace and Comment == */

/* == STRING == */
STRING :  '"' (ESC | ~["\\])* '"' ;
fragment 
ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment 
UNICODE : 'u' HEX HEX HEX HEX ;
fragment
TEXT : ~[,\n\r"]+ ;

/* == END of STRING == */