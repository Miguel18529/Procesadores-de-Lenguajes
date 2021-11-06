lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];

ESQUEMA:'ESQUEMA';
FUENTE:'FUENTE';
DATOS:'DATOS';
DESTINO:'DESTINO';
RESTRICCIONES:'RESTRICCIONES';
IMPLICA:'implica';
VAR:'VAR';
COMA:',';
PA:'(';
PC:')';
PyC:';';

NUMERO:DIGITO+;
IDENT: LETRA(LETRA|DIGITO)*;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;
COMENTARIO_LINEA: '//' .*? FIN_LINEA -> skip;