grammar Expr;
import LexerRules;

prog    :   Operator+;

Operator    :   aritmatich 
        	  |   matem+ ';' 
            |   type_data Identifier '=' ((Identifier ',' matem) | (matem ',' Identifier) | (matem)) ';' 
            |   Identifier '=' ((Identifier indec) | (ternary) | (bitwise) | (aritmatich) | (matem)) ';' 
            |   Identifier assignment Identifier ';' 
            |   Identifier indec ';'  
            |   indec Identifier ';' 
            |   comparator 
            ;

type_data   :   ('int'|'float'|'bool'|'double'|'char') 
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

comparator    :   Identifier ('=='|'!='|'>'|'<'|'>='|'<='|'||'|'&&') Identifier
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
