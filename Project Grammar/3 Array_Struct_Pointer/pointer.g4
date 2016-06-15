grammar pointer;

s 				: 
				(	(type init_pointer1 ';')
				|	(init_pointer2 ';')
				|	('const' type init_pointer2';')
				)+;
				
init_pointer1 	: 
			'*'('const')?ID ('=' ('&')? ID (',' init_pointer1)*)?
		;
init_pointer2	: 
			ID ('=' ('&')? ID (',' init_pointer2)*)?
		;		
type	
    	:   ('short'
    	|   'int'
    	|   'long'
    	|   'float'
    	|   'double'
  	    |   'bool'
  	    |	'char'
  	    |	'String'
        );


BOOLEAN		: 'true'|'false'
			;

STRING 		: '\"' .+ '\"'
			; 

CHAR		: '\'' . '\'' 
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
