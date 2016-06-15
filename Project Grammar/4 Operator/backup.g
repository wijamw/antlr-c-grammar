grammar Expr;
import LexerRules;

prog    :   stat+;

stat    :   arit 
    	  |   matem+ ';' 
        |   type Identifier ';' 
        |   type Identifier '=' matem ';' 
        |   type Identifier ',' Identifier ',' Identifier ';' //
        |   type Identifier '=' Identifier ',' matem ';' 
        |   type Identifier '=' matem ',' Identifier ';' 
        |   type Identifier '=' INT ',' Identifier ';' 
        |   Identifier '=' arit ';' 
        |   Identifier penugasan Identifier ';' 
        |   Identifier '=' bitwise ';' //
        |   Identifier indec ';'  
        |   indec Identifier ';' //
        |   Identifier '=' Identifier indec ';' 
        |   perbandingan 
        |   Identifier '=' ternary ';'
        ;

type    :   ('int'|'float'|'bool'|'double'|'char')
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

penugasan   : ('+'|'-'|'*'|'/'|'%'|'~'|'|'|'&'|'^'|'<<'|'>>') '=' 
            ;

indec   :   ('++'|'--') | ('+1'|'-1')
        ;

perbandingan  :   Identifier ('=='|'!='|'>'|'<'|'>='|'<='|'||'|'&&') Identifier
	            |   ('!') Identifier |('!') INT
              |   INT ('=='|'!='|'>'|'<'|'>='|'<='|'||'|'&&') INT
              |  '(' perbandingan ')'
	            |  '(' '!' '(' perbandingan ')' ')'
	            |  '(' '(' arit ')' ('=='|'!='|'>'|'<'|'>='|'<=') Identifier ')' 
              ;

matem   :   matem ('+'|'-'|'*'|'/'|'%') matem ',' matem ('+'|'-'|'*'|'/'|'%') matem
        |   matem ('+'|'-'|'*'|'/'|'%') matem ('+'|'-'|'*'|'/'|'%') matem
        |   matem ('+'|'-'|'*'|'/'|'%') matem
        |   INT
        |   Identifier
        |   FLOAT
        |   '(' matem ')'
        ;

arit    :   arit ('+'|'-'|'*'|'/'|'%') arit
        |   INT
        |   Identifier
        |   FLOAT
        |   '(' arit ')'
        |   '(' arit ')' ('+'|'-'|'*'|'/'|'%') '(' arit ')' ;

ternary   : '(' Identifier ('=='|'!='|'>'|'<'|'>='|'<=') INT ')' '?' INT ':' INT
          | '(' Identifier ('=='|'!='|'>'|'<'|'>='|'<=') Identifier ')' '?' Identifier ':' Identifier
          | '(' INT ('=='|'!='|'>'|'<'|'>='|'<=') INT ')' '?' Identifier ':' Identifier
          ;


