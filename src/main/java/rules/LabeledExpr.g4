grammar LabeledExpr;
import CommonLexerRules;

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   ID '=' expr NEWLINE         # assign
    |   NEWLINE                     # blank
    ;

expr:   expr op=('*'|'/'|'+'|'-') expr      # arithm
    |   INT                         # int
    |   ID                          # id
    |   '(' expr ')'                # parens
    | expr op=('>'|'<'|'>='|'<='|'=='|'!=') expr  # comparison
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
