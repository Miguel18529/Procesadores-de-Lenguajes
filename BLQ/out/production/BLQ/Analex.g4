lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

fragment LETRA:[a-zA-Z];
fragment DIGITO:[0-9];

BLOQUE: 'BLOQUE';
FBLOQUE: 'FBLOQUE';
COMA:',';
PyC:';';
IGUAL:'=';
MAS:'+';
MENOS:'-';
POR:'*';
DIV:'/';
PA:'(';
PC:')';
NUMERO: DIGITO+;
IDENT: LETRA(LETRA|DIGITO)*;

COMENT_BLOQUE: '/*' .*? '*/' -> skip;
COMENT_LINEA: '//' .*? FIN_LINEA -> skip;