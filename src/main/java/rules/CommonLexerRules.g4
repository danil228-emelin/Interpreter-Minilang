lexer grammar CommonLexerRules;

LINE_COMMENT : ':>' .*? '\r'? '\n' -> skip ;
COMMENT : '/*' .*? '*/' -> skip ; // Match "/*" stuff "*/"
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
