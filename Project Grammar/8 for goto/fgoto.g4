grammar fgoto;
import LexerRules;

statement
    :   declaration+
    |   iterationStatement+
    |   jumpStatement+
    ;

    
declaration
    :   declarationSpecifier ';' statement?
    |   declarationSpecifier ',' Identifier ';' statement?
    |   declarationSpecifier ',' Identifier '=' NUMBER ';' statement?
    |   declarationSpecifier ',' declarationSpecifier ';' statement?
    ;

jumpStatement
    :   'goto' Identifier ';' statement?
    |	Identifier ':' statement?
    ;

declarationSpecifier
    :   typeSpecifier (Identifier)+ 
    |   typeSpecifier (Identifier)+ '=' (NUMBER)+
    ;

typeSpecifier
    :   ('void'
    |   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    |   'unsigned')+
    ;

assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '!='
    ;

unaryOperator
    :   '&' | '*' | '+' | '-' | '~' | '!'
    ;

assignmentExpression
    :   unaryExpression assignmentOperator assignmentExpression
    ;

relationalExpression
    :   '<'	| '>' | '<=' | '>='
    ;

unaryExpression
    :   '++' | '--' 
    ;

iterationStatement
    :   'for' '(' init? ';' condition? ';' state? ')' (statement)*
    |   'for' '(' declaration_expression? ';' condition? ';' state? ')' ('{') statement* ('}') statement*
    |   'for' '(' init? ';' condition? ';' state? ')' ('{') statement* ('}') statement*
    ;

init
    :   (Identifier)+ '=' NUMBER
    ;

condition
    :   (Identifier)+ relationalExpression+ (Identifier)
    |   (Identifier)+ relationalExpression NUMBER
    ;

state
    :   unaryExpression (Identifier)+ 
    |   (Identifier)+ assignmentOperator NUMBER
    |   (Identifier)+ unaryExpression 
    ;

declaration_expression
    :   typeSpecifier (Identifier)+ '=' NUMBER
    ;
