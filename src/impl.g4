grammar impl;


start: c=sequence EOF;

sequence: c=command cs=sequence*;

command: '.hardware' id=IDENTIFIER
       | '.inputs' ids=IDENTIFIER
       | '.outputs' ids=IDENTIFIER+
       | '.latch' id1=IDENTIFIER '->' id2=IDENTIFIER
       | '.update' e=expr*
       | '.simulate' id=IDENTIFIER '=' b=BINARY
       ;

expr: '(' e=expr ')'  # Parenthesis
    | '!' e=expr    # Not
    | e1=expr '&&' e2=expr # And
    | e1=expr '||' e2=expr # Or
    | e1=expr '==' e2=expr # Equal
    | id=IDENTIFIER '=' e=expr #Assignment
    | IDENTIFIER           #Var
    ;

BINARY: ('0'|'1')+;
HVIDRUM : [ \t\n]+ -> skip ;
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;
COMMENT : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;

