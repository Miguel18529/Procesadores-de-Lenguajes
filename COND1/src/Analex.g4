lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

fragment LETRA:[a-zA-Z];
fragment DIGITO:[0-9];

PROGRAMA:'PROGRAMA';
VARIABLES:'VARIABLES';
INSTRUCCIONES:'INSTRUCCIONES';
RUPTURA:'ruptura';
MOSTRAR:'mostrar';
ENTONCES:'entonces';
FINSI:'finsi';
SINO:'sino';
MAYOR:'>';
MENOR:'<';
IGUAL:'==';
DISTINTO:'!=';
MAYORIGUAL:'>=';
MENORIGUAL:'<=';
MAS:'+';
MENOS:'-';
POR:'*';
PUNTOYCOMA:';';
COMA:',';
ASIG:'=';
SI:'si';
PARENTESISABIERTO:'(';
PARENTESISCERRADO:')';
NUM:NUMERO;
VAR:IDENT;
NUMERO: DIGITO+;
IDENT: LETRA(LETRA|DIGITO)*;

COMENT_BLOQUE: '/*' .*? '*/' -> skip;
COMENT_LINEA: '//' .*? FIN_LINEA -> skip;