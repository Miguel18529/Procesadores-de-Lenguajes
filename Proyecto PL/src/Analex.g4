lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z]|'_';

PROGRAMA: 'PROGRAMA';
VARIABLES: 'VARIABLES';
SUBPROGRAMAS: 'SUBPROGRAMAS';
INSTRUCCIONES: 'INSTRUCCIONES';
FUNCION: 'FUNCION';
FFUNCION: 'FFUNCION';
PROCEDIMIENTO: 'PROCEDIMIENTO';
FPROCEDIMIENTO: 'FPROCEDIMIENTO';
VERDADERO: 'T';
FALSO: 'F';
DEV: 'dev';
COMA: ',';
DP: ':';
PyC: ';';
LOG: 'LOG';
NUM: 'NUM';
SEQ: 'SEQ';
PA: '(';
PC: ')';
CA: '[';
CC: ']';
IGUAL: '=';
POR: '*';
SUMA: '+';
RESTA: '-';
SI: 'si';
SINO: 'sino';
FSI: 'fsi';
ENTONCES: 'entonces';
IGUALIGUAL: '==';
MENORQUE: '<';
MAYORQUE: '>';
DISTINTODE: '!=';
MENOROIGUAL: '<=';
MAYOROIGUAL: '>=';
MIENTRAS: 'mientras';
FMIENTRAS: 'fmientras';
HACER: 'hacer';
RUPTURA: 'ruptura';
MOSTRAR: 'mostrar';
NOT: '!';
AND: '&&';
OR: '||';

NUMERO: DIGITO+;
IDENT: LETRA(LETRA|DIGITO)*;

COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;
COMENTARIO_LINEA: '//' .*? FIN_LINEA -> skip;
