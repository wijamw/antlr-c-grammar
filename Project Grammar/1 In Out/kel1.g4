grammar kel1;
prog 	
	: init+ 
	;

init
	: tipedata function '(' parameter* ')' '{' statement* '}'
	;

statement
	: output
	| input 
	| funcall
	;

input	
	: 'scanf' '(' '"' alphabet* '"' ',' ('&')* var ')' ';'
	;

output
	: 'printf' '(' '"' alphabet* '"' (','var)* (',' '"' alphabet* '"')* (',' '\'' var '\'' )* ')' ';'
	;

funcall
	: function '(' parameter* ')' ';'
	;

parameter
	: tipedata ID (',' tipedata ID)*
	;

alphabet
	:	ID
	|	INT
	|	'%' (INT)* ('#')* ('+')* ('*')* ((INT)*'.'(INT)*)* tipedata
	| '=' | '+' | '/'
	| ':' | '*' | '-'
	;

function
	: 	ID
	;

tipedata
	: 	ID
	;

var			
	: 	ID
	| 	INT ('.' INT)*
	;	

ID			
	: 	[a-zA-Z]+
	;

INT			
	: 	[0-9]+ ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
