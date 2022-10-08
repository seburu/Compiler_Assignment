grammar impl;

start   : cs=commands EOF;

commands : c=command cs=commands                        #Sequence
	 | 	   	                                            #NOP
	 ;

command: '.hardware' id=IDENTIFIER                      #Hardware
       | '.inputs' (ids=IDENTIFIER)+                    #Inputs
       | '.outputs' (ids=IDENTIFIER)+                   #Outputs
       | '.latch' id1=IDENTIFIER '->' id2=IDENTIFIER    #Latch
       | '.update' (e=expr)+                               #Update
       | '.simulate' id=IDENTIFIER '=' b=BINARY         #Simulate
       ;



expr: '(' e=expr ')'                                    #Parenthesis
    | '!' e=expr                                        #Not
    | e1=expr '&&' e2=expr                              #And
    | e1=expr '||' e2=expr                              #Or
    | e1=expr '==' e2=expr                              #Equal
    | id=IDENTIFIER '=' e=expr                          #Assignment
    | x=IDENTIFIER                                      #Var
    ;

BINARY: ('0'|'1')+;
HVIDRUM : [ \t\r\n]+ -> skip ;
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;
COMMENT : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;

