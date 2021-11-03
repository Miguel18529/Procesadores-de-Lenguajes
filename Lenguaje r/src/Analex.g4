lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];

VARIABLES: 'VARIABLES';
ASIGNACIONES: 'ASIGNACIONES';

HLIST: 'Hlist';
BLIST: 'Blist';
ILIST: 'Ilist';
BOOLEAN: 'Boolean';
INTEGER: 'Integer';
BOOLEANO: 'true'|'false';
NOT: 'not';
OR: 'or';
AND: 'and';
APPEND: 'append';
COMA: ',';
PyC: ';';
IGUAL: '=';
CA: '[';
CC: ']';
ADD: 'add';
MINUS: 'minus';
TIMES: 'times';
MENOS: '-';
PA: '(';
PC: ')';

NUMERO: MENOS?DIGITO+;
IDENT: LETRA+(DIGITO|LETRA)*;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;
COMENTARIO_LINEA: '//' .*? FIN_LINEA -> skip;
