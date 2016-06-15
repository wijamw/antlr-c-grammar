lexer grammar LexerRules;

Identifier
    :   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;

fragment
IdentifierNondigit
    :   Nondigit
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

INT
    :   [0-9]+ //('.' NUMBER)*
    ;

CHAR        
    : '\'' . '\'' 
    ;           

UNSG        
    : [0-9]+
    ;

FLOAT       
    : INT+ '.' INT+
    ;

DOUBLE      
    : INT + '.' INT+ 
    ;

Whitespace
    :   [ \t]+ -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/' -> skip
    ;

LineComment
    :   '//' ~[\r\n]* -> skip
    ;

