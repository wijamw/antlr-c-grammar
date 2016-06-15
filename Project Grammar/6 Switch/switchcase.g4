grammar switchcase;

/*prog
	: stat+
	;
*/
stat
	: switchcase
	| jumpstat+
	| (assign ';')+
	;
switchcase
	: 'switch' '(' identifier ')' (swstat|'{' swstat* '}')?
	;
identifier
	: ID
	| INT
	| Bool
	| '\'' ID+ '\''
	;
swstat
	: swcase+
	| swdefault
	;
swcase
	: 'case' identifier ':' (statcase)*
	; 
swdefault
	: 'default' ':' (statcase)*
	;
statcase
	: switchcase 
	| ID inisialisasi ';'
	| jumpstat
	;
jumpstat
	: 'break' ';'
	| 'continue' ';'
	| 'goto' ';'
	;
//=============================================================================//

assign
	: deklarasi
	| inisialisasi
	;
deklarasi
	: 'int' initdeclarator
	| 'char'
	| 'float' floatdeclarator
	| 'double'
	;
initdeclarator
	: ID inisialisasi?
	| initdeclarator ',' initdeclarator
	;
inisialisasi
	: '=' expr
	; 
floatdeclarator
	: INT+ '.'INT*
	| '.' INT*
	;
expr:   '(' expr ')' 
	//|	expr '^' <assoc=right> expr 
	|	expr ('*'|'/') expr   
    |   expr ('+'|'-') expr   
    |   INT                    
    |   ID                    
    ;
/* New */
decl 
	:	decl '[' ']'	// match [] suffixes using direct left-recursion
	|	'*' decl		// *x, *x[], **x
	|	'(' decl ')'	// (x), (x[]), (*x)[]
	|	ID
	;
STRING: '"' (ESC|.)*? '"' ;
fragment
ESC : '\\"' | '\\\\' ; // 2-char sequences \" and \\
ID
	: Abjad(Abjad|INT)* 
	;	
Bool
	: 'true'
	| 'false'
	;

fragment
Abjad
	: [_a-zA-Z]+
	;
INT
	: [0-9]+ ;

/* Whitespace and Comment*/
COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;
LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;
WS  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
    ;

// Definitive Word
/*
Int 	
	: 'int' 	
	;
Char 	
	: 'char' 	
	;
Float 	
	: 'float' 	
	;
Double 	
	: 'double' 	
	;

Break 	
	: 'break' 	
	;
Continue
	: 'continue'
	;
Goto	
	: 'goto'
	;
*/