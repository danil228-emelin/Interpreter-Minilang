grammar LabeledExpr;
import CommonLexerRules;

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   ID '=' expr NEWLINE         # assign
    |   ifStat                      # ifStatement
    |   NEWLINE                     # blank
    ;

ifStat: 'if' expr 'then' block ('else' block)? ;

block: '{' stat* '}' | stat;

expr: expr op=('*'|'/') expr         # mulDiv
    |   expr op=('+'|'-') expr         # addSub
    |   expr op=('<'|'>'|'<='|'>=') expr # relational
    |   expr op=('=='|'!=') expr       # equality
    |   '(' expr ')'                # parens
    |   INT                         # int
    |   ID                          # id
    ;

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
NOT : '!' ;
AND : '&&' ;
OR  : '||' ;
GT  : '>' ;
LT  : '<' ;
GE  : '>=' ;
LE  : '<=' ;
EQ  : '==' ;
NE  : '!=' ;
