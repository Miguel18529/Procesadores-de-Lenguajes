lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];

VARIABLES: 'VARIABLES';
ASIGNACIONES: 'ASIGNACIONES';

PyC: ';';
COMA: ',';

IGUAL: '=';
MAS: '+';
MENOS: '-';
POR: '*';
PA: '(';
PC: ')';
CA: '[';
CC: ']';
TRUE: 'true';
FALSE: 'false';
NOT: 'NOT';
OR: 'OR';
AND: 'AND';
HLIST: 'Hlist';
ILIST: 'Ilist';
BLIST: 'Blist';
INTEGER: 'Integer';
BOOLEAN: 'Boolean';
IDENT: LETRA+;
NUMERO: ('-')?DIGITO+;

COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;
COMENTARIO_LINEA: '//' .*? FIN_LINEA -> skip;
