grammar struct;
s		: struct+;

struct	: ('struct' ID '{' dec+ '}')+				//DEKLARASI	STRUCT		
		| ('struct' ID ID (',' ID)* ';')+			//DEKLATASI MULTI STRUCT
		| (ID '.' ID '=' init ';')					//INISIALISASI
		; 

dec 	:type_int    ID size* ';' 
		|type_char   ID size* ';'
		|type_bool   ID size* ';'
		|type_float  ID size* ';'
		|type_double ID size* ';'
		;

init	: INT (',' INT)* | CHAR (',' CHAR)* | BOOLEAN (',' BOOLEAN)* | FLOAT (',' FLOAT)* | DOUBLE (',' DOUBLE)*;

type_int	: 'short'|'int'|'long'|'unsigned';
type_char 	: 'char';
type_bool 	: 'bool';
type_float	: 'float';
type_double	: 'double';

size 	: '[' INT ']';

CHAR	: ['][a-zA-Z0-9_]['];
BOOLEAN	: 'true'|'false';
INT 	: [0-9]+;
ID 		: [a-zA-Z_][a-zA-Z0- 9_-]*	;
FLOAT 	: INT+ '.' INT+;
DOUBLE  : INT + '.' INT+ ;
WS 		: [ \t\r\n]+ -> skip ; 					
NEWLINE	: '\r'? '\n';


struct identitas{
	float ngawur[20];
	int umur;
	char darah;
}
struct identitas data1, data2;
data1.umur=10;

