grammar LabeledExpr;
import CommonLexerRules;

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   ID '=' expr NEWLINE         # assign
    |   NEWLINE                     # blank
    ;

expr:  expr op=('*'|'/') expr  # mulDiv
    |  expr op=('+'|'-') expr  # addSub
    |  expr op=('<'|'>'|'<='|'>=') expr # Relational
    |  expr op=('=='|'!=') expr # Comparison
    |   '(' expr ')'         # parens
    |   INT                  # int
    |   ID                   # id
    ;


MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
NOT :   '!' ;
AND :   '&&' ;
OR  :   '||' ;
GT  :   '>' ;
LT  :   '<' ;
GE  :   '>=' ;
LE  :   '<=' ;
EQ  :   '==' ;
NE  :   '!=' ;
