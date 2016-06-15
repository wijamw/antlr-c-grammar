/** Kelompok 5 :
2 D4 Tekom A
Kisron		  (13)
Iva Laili Nurmala (16)
Mochamad Hilman   (27)
Grammars always start with a grammar header. This grammar is called
 *  ArrayInit and must match the filename: ArrayInit.g4
 */
grammar Grammer;

/** A rule called init that matches comma-separated values between {...}. */
//init  : '{' value (',' value)* '}' ;  // must match at least one value
init    : BEGIN	'(' cond ')' (arg ';' | '{' (arg ';')* '}') (ELSE ( init (arg ';')* | '{'(arg ';')* '}'))
	;  // must match at least one value

/** A value can be either a nested array/struct or a simple integer (INT) */
cond 	: matem SGN matem
	| cond SGN cond
	| '(' matem SGN matem')'
	| '(' matem ')'
	;

matem	:matem ('+'|'-'|'*'|'/'|'%') matem ',' matem ('+'|'-'|'*'|'/'|'%') matem
    	|matem ('+'|'-'|'*'|'/'|'%') matem
    	|INT
    	|ID
    	|Float
    	;

arg	: init
	| arg ';'
	| ID
	;
//other	:ELSE '{' init '}'
//	|ELSE '{' arg ';' '}'
//	;


// parser rules start with lowercase letters, lexer rules with uppercase
BEGIN : 'if';
ELSE : 'else';
SGN : ['<','>','==','<=','>=','!=']+;
ID  : [a-z|A-Z|0-9]+;		//Match any char than tab and new line		//[a-z]+;
INT :   [0-9]+ ;             // Define token INT as one or more digits
Float : INT+ '.' INT+ ;
WS  :   [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out
