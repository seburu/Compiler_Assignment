grammar impl;

start   : ha=hardware in=inputs ou=outputs la+=latch+ up=update si=simulate EOF;


hardware: '.hardware' id=IDENTIFIER;
inputs  : '.inputs' ids+=IDENTIFIER+;
outputs : '.outputs' ids+=IDENTIFIER+;
latch   : '.latch' id1=IDENTIFIER '->' id2=IDENTIFIER;
update  : '.update' as+=assignment+;
simulate: '.simulate' id=IDENTIFIER '=' b=BINARY;

assignment : id=IDENTIFIER '=' e=expr ;

expr: '(' e=expr ')'                                    #Parenthesis
    | '!' e=expr                                        #Not
    | e1=expr '&&' e2=expr                              #And
    | e1=expr '||' e2=expr                              #Or
    | x=IDENTIFIER                                      #Var
    ;

/*
command: '.hardware' id=IDENTIFIER                      #Hardware
       | '.inputs' (ids=IDENTIFIER)+                    #Inputs
       | '.outputs' (ids=IDENTIFIER)+                   #Outputs
       | '.latch' id1=IDENTIFIER '->' id2=IDENTIFIER    #Latch
       | '.update' as=assignment+                       #Update
       | '.simulate' id=IDENTIFIER '=' b=BINARY         #Simulate
       ;

assignment : id=IDENTIFIER '=' e=expr ;

expr: '(' e=expr ')'                                    #Parenthesis
    | '!' e=expr                                        #Not
    | e1=expr '&&' e2=expr                              #And
    | e1=expr '||' e2=expr                              #Or
    | e1=expr '==' e2=expr                              #Equal
    | x=IDENTIFIER                                      #Var
    ;
*/
BINARY: ('0'|'1')+;
HVIDRUM : [ \t\r\n]+ -> skip ;
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;
COMMENT : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;

