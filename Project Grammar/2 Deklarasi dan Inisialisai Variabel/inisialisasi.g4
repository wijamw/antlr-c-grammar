grammar inisialisasi;
import LexerRules;

prog 			: 	statement+;

statement		: 	operator
				|	deklarasi
				| 	pointer
				|	array
				|	struct
				;

pointer 		: 
				(	(type_data init_pointer1 ';')
				|	(init_pointer2 ';')
				|	('const' type_data init_pointer2';')
				)+
				;

array			:	(type_INT Identifier size+ ('=' init_array1)? ';')
				| 	('unsigned' Identifier size+ ('=' init_array4)? ';')
				| 	(type_CHAR Identifier size+ ('=' init_array2)?  ';' )
				| 	((type_FLOAT | type_DOUBLE) Identifier size+ ('=' init_array3)?  ';' )
				; 

struct			: ('struct' Identifier '{' dec+ '}')+								//DEKLARASI	STRUCT		
				| ('struct' Identifier Identifier (',' Identifier)* ';')+			//DEKLARASI MULTI STRUCT
				| (Identifier '.' Identifier '=' init_struct ';')					//INISIALISASI
				; 

operator    :   aritmatich 
        	|   matem+ ';' 
            |   type_data Identifier '=' ((Identifier ',' matem) | (matem ',' Identifier) | (matem)) ';' 
            |   Identifier '=' ((Identifier indec) | (ternary) | (bitwise) | (aritmatich) | (matem)) ';' 
            |   Identifier assignment Identifier ';' 
            |   Identifier indec ';'  
            |   indec Identifier ';' 
            |   comparator 
            ;

bitwise :   Identifier ('&'|'|'|'^'|'<<'|'>>') Identifier 
        |   INT ('&'|'|'|'^'|'<<'|'>>') INT 
        |   FLOAT ('&'|'|'|'^'|'<<'|'>>') INT 
        |   INT ('&'|'|'|'^'|'<<'|'>>') FLOAT 
        |   FLOAT ('&'|'|'|'^'|'<<'|'>>') FLOAT 
        |   ('~') INT 
        |   ('~') Identifier 
        |   ('~') FLOAT 
        ;

assignment  : ('+'|'-'|'*'|'/'|'%'|'~'|'|'|'&'|'^'|'<<'|'>>') '=' 
            ;

indec   :   ('++'|'--') | ('+1'|'-1') 
        ;

comparator		:   Identifier ('=='|'!='|'>'|'<'|'>='|'<='|'||'|'&&') Identifier
				|	Identifier ('=='|'!='|'>'|'<'|'>='|'<='|'||'|'&&') INT
	            |   ('!') Identifier |('!') INT
              	|   INT ('=='|'!='|'>'|'<'|'>='|'<='|'||'|'&&') INT
              	|  '(' comparator ')'
	            |  '(' '!' '(' comparator ')' ')'
	            |  '(' '(' aritmatich ')' ('=='|'!='|'>'|'<'|'>='|'<=') Identifier ')' 
              	;

matem   :   (INT | Identifier | FLOAT) matem ('+'|'-'|'*'|'/'|'%') matem ',' matem ('+'|'-'|'*'|'/'|'%') matem
        |   matem ('+'|'-'|'*'|'/'|'%') matem ('+'|'-'|'*'|'/'|'%') matem
        |   matem ('+'|'-'|'*'|'/'|'%') matem
        |   INT
        |   Identifier
        |   FLOAT
        |   '(' matem ')'
        ;

aritmatich    :   aritmatich ('+'|'-'|'*'|'/'|'%') aritmatich
              |   INT
              |   Identifier
              |   FLOAT
              |   '(' aritmatich ')'
              |   '(' aritmatich ')' ('+'|'-'|'*'|'/'|'%') '(' aritmatich ')' ;

ternary   : '(' Identifier ('=='|'!='|'>'|'<'|'>='|'<=') INT ')' '?' INT ':' INT
          | '(' Identifier ('=='|'!='|'>'|'<'|'>='|'<=') Identifier ')' '?' Identifier ':' Identifier
          | '(' INT ('=='|'!='|'>'|'<'|'>='|'<=') INT ')' '?' Identifier ':' Identifier
          ;


dec 			: type_data   Identifier size* ';' 
				| type_int  Identifier size* ';'
				;

type_int 		: ('short'|'int'|'long'|'unsigned')
				;

init_struct		: INT (',' INT)* | CHAR (',' CHAR)* | FLOAT (',' FLOAT)* | DOUBLE (',' DOUBLE)*;


size 			: '[' INT ']';

init_array1		: '{' value1 (',' value1)* '}';		//type int
init_array2		: '{' value2 (',' value2)* '}';		//type char
init_array3		: '{' value3 (',' value3)* '}';		//type float
init_array4		: '{' value4 (',' value4)* '}';		//type USG


value1 			: init_array1
				| INT 	
				;

value2 			: init_array2
				| CHAR 	
				;

value3 			: init_array3
				| ( FLOAT	|	DOUBLE )
				;

value4 			: init_array4
				| UNSG	
				;
 
type_CHAR 		:	'char';
type_FLOAT		:   'float';
type_DOUBLE		: 	'double';
type_INT		:	'int';
			
init_pointer1 	: '*' ('const')? Identifier ('=' ('&')? Identifier (',' init_pointer1)*)?
				;

init_pointer2	: Identifier ('=' ('&')? Identifier (',' init_pointer2)*)?
				;

deklarasi	: 'unsigned'? typedata? type_data  ';'
			| 'unsigned'? typedata integer_s ';'
			;

typedata	: 'short' | 'long' 
			;

type_data	: 'int' (integer_s (','integer_s)*)? 
			| 'char' (char_s(','char_s)*)?
			| 'float' (float_s(','float_s)*)?
			| 'double' (double_s(','double_s)*)?
			| 'boolean' (boolean_s(','boolean_s)*)?
			;

integer_s 	: Identifier integer_v? ;
integer_v 	: '=' INT ;

char_s 		: Identifier char_v? ;
char_v 		: '=' '"' Identifier '"' | '=' '\'' . '\'' ;

float_s 	: Identifier float_v? ;
float_v 	: '=' INT | '=' INT'.'INT ;

double_s 	: Identifier double_v? ;
double_v 	: '=' INT | '=' INT'.'INT ;


boolean_s	: Identifier boolean_v? ;
boolean_v 	: '=' 'TRUE' | '=' 'FALSE' | '=' 'true' | '=' 'false'
			;

switchcase 	: 'switch' '(' init_switchcase ')' (swstatement |'{' swstatement* '}')?
			;

init_switchcase
			: Identifier
			| INT
			| bool
			| '\'' Identifier+ '\''
			;

swstatement
			: swcase+
			| swdefault
			;

swcase
			: 'case' Identifier ':' (statcase)*
			; 

swdefault	: 'default' ':' (statcase)*
			;

statcase	: switchcase 
			| statement ';'
			| jumpstat
			;

jumpstat 	: 'break' ';'
			| 'continue' ';'
			| 'goto' ';'
			;

bool 		: 'true' | 'false' | 'TRUE' | 'FALSE' | '0' | '1'
    		;

while_statement : 'while' '(' init_while ')' '{' Newline statement '}' Newline
				| 'while' '(' init_while ')' '{' Newline operator Newline '}' Newline
				| 'while' '(' init_while ')' 'do' '{' Newline statement '}'	Newline
				| 'while' '(' init_while ')' 'do' '{' Newline operator Newline '}' Newline
				| 'do' '{' Newline statement '}' 'while' '(' init_while ')' Newline
				| 'do' '{' Newline operator Newline '}' 'while' '(' init_while ')' Newline ;

init_while	: Identifier  relationalExpression Identifier 
			| Identifier  relationalExpression INT 
			| Identifier  relationalExpression '('  operator ')'
			| Identifier  relationalExpression '('  operator ')'
			| Identifier  relationalExpression '('  operator  ')'
			| Identifier  relationalExpression '('  operator   ')'
			| init_while logic init_while
		 	| bool
			;

relationalExpression	 
	: '<' | '<=' | '>'  | '>=' |'==' | '!=' 
	;

unaryExpression
    :   '++' | '--' 
    ;

assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '!='
    ;

logic	 
	: '&' | '|'  | '&&' | '||'     	 ;

iterationStatement
    :   'for' '(' init_for? ';' condition? ';' state? ')' (statement)*
    |   'for' '(' deklarasi? ';' condition? ';' state? ')' ('{') statement* ('}') statement*
    |   'for' '(' init_for? ';' condition? ';' state? ')' ('{') statement* ('}') statement*
    ;

init_for
    :   (Identifier)+ '=' INT
    |	(Identifier)+ '=' (Identifier)
    ;

condition
    :   (Identifier)+ relationalExpression+ (Identifier)
    |   (Identifier)+ relationalExpression INT
    ;

state
    :   unaryExpression (Identifier)+ 
    |   (Identifier)+ assignmentOperator INT
    |   (Identifier)+ unaryExpression 
    ;

jumpStatement
    :   'goto' Identifier ';' statement?
    |	Identifier ':' statement?
    ;