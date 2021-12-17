lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

fragment LETRA:[a-zA-Z];
fragment DIGITO:[0-9];

DIAGRAMA: 'DIAGRAMA';
VARIABLES: 'VARIABLES';
ESTADOS:'ESTADOS';
INICIAL:'INICIAL';
TRANSICIONES:'TRANSICIONES';
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
Y:'Y';
O:'O';
NO:'NO';
PARENTESISABIERTO:'(';
PARENTESISCERRADO:')';
NUMERO: DIGITO+;
IDENT: LETRA(LETRA|DIGITO)*;

COMENT_BLOQUE: '/*' .*? '*/' -> skip;
COMENT_LINEA: '//' .*? FIN_LINEA -> skip;