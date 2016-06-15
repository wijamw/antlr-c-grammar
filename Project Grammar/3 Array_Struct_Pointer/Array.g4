grammar Array;
s		: statement+;

statement: 
			(typedata Identifier size+ ('=' init_array1)? ';')
		| 	(typedata Identifier size+ ('=' init_array4)? ';')
		| 	(type_CHAR ID size+ ('=' init_array2)?  ';' )
		| 	((type_FLOAT | type_DOUBLE) ID size+ ('=' init_array3)?  ';' )
		; 

init_array1	: '{' value1 (',' value1)* '}';		//type int
init_array2	: '{' value2 (',' value2)* '}';		//type char
init_array3	: '{' value3 (',' value3)* '}';		//type float
init_array4	: '{' value4 (',' value4)* '}';		//type USG


value1 	: init_array1
		| INT 	
		;

value2 	: init_array2
		| CHAR 	
		;

value3 	: init_array3
		| ( FLOAT	|	DOUBLE )
		;

value4 	: init_array4
		| UNSG	
		;
 
type_CHAR 		:	'char';
type_FLOAT		:   'float';
type_DOUBLE		: 	'double';
type_INT		:	'int';

size 	: '[' INT ']';

type
    	:   
    	(	'short'
    	|   'long'
    	)
    	;

CHAR		: '\'' . '\'' 
			;			
BOOLEAN		: 'true'|'false'
			;
INT 		: [0-9]+
			| ([-][0-9]+) 
			;
ID	 		: [a-zA-Z_][a-zA-Z0- 9_-]*	
			;
UNSG 		: [0-9]+
			;
FLOAT 		: INT+ '.' INT+
			;
DOUBLE  	: INT + '.' INT+ 
			;
WS 			: [ \t\r\n]+ -> skip 
			; 					
NEWLINE		: '\r'? '\n' 
			;
