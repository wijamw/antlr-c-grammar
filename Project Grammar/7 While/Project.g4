grammar Project;

prog : stat+ ;
stat :    'while' '(' con ')' '{' NEWLINE stat '}' NEWLINE
	| 'while' '(' con ')' '{' NEWLINE expr NEWLINE '}' NEWLINE
	| 'while' '(' con ')' 'do' '{' NEWLINE stat '}'	NEWLINE
	| 'while' '(' con ')' 'do' '{' NEWLINE expr NEWLINE '}' NEWLINE
	| 'do' '{' NEWLINE stat '}' 'while' '(' con ')' NEWLINE
	| 'do' '{' NEWLINE expr NEWLINE '}' 'while' '(' con ')' NEWLINE ;

con  :    ID  kondisi ID 
	| ID  kondisi INT 
	| ID  kondisi '(' ID  operator ID  ')'
	| ID  kondisi '(' ID  operator INT ')'
	| ID  kondisi '(' INT operator INT ')'
	| ID  kondisi '(' INT operator ID  ')'
	| con logic con 
 	| '0' | '1' | 'TRUE' | 'FALSE'
	;

expr :    expr operator expr
	| NEWLINE expr
	| expr NEWLINE 
	| expr NEWLINE expr
	| INT  operator INT 	';' 
	| INT  operator ID	';' 
	| ID   operator INT	';' 
	| ID   operator ID	';' 
	| ID   ('++'|'--')	';' 
	|      ('++'|'--') ID	';' 
	| '(' expr ')' 		';' 
	| ID '=' expr		
	| INT			';' 
	| ID			';' 			
	;		

operator : '*' | '/'  | '+'  | '-'               ;
kondisi	 : '<' | '<=' | '>'  | '>=' |'==' | '!=' ;
logic	 : '&' | '|'  | '&&' | '||'     	 ;
ID : [a-zA-z]+ ;
INT : [0-9]+ ;
NEWLINE : '\r' ? '\n' ;
WS : [ \t]+ -> skip ;
