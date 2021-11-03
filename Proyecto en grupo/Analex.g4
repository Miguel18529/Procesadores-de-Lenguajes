lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z]|'_';
NUM: 'NUM';
LOG: 'LOG';
SEQ: 'SEQ';
PA: '(';
PC: ')';
CA: '[';
CC: ']';
DOSPUNTOS: ':';
PyC: ';';
COMA: ',';
SUMA: '+';
RESTA: '-';
POR: '*';
AND: '&&';
OR: '||';
NOT: '!';
IGUAL: '=';
IGUALIGUAL: '==';
DISTINTO: '!=';
MAYOR: '>';
MENOR: '<';
MENORIGUAL: '<=';
MAYORIGUAL: '>=';
HACER: 'hacer';
FALSO: 'F';
VERDADERO: 'T';
INDEFINIDO: 'unknown';
DEV: 'dev';
SI: 'si';
ENTONCES: 'entonces';
FSI: 'fsi';
SINO: 'sino';
RUPTURA: 'ruptura';
MIENTRAS: 'mientras';
FMIENTRAS: 'fmientras';
NUMERO: (DIGITO)+;
VARIABLES: 'VARIABLES';
FUNCION: 'FUNCION';
FFUNCION: 'FFUNCION';
PROCEDIMIENTO: 'PROCEDIMIENTO';
FPROCEDIMIENTO: 'FPROCEDIMIENTO';
MOSTRAR: 'mostrar';
INSTRUCCIONES: 'INSTRUCCIONES';
IDENT: LETRA(LETRA|DIGITO)*;





COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;
COMENTARIO_LINEA: '//' .*? FIN_LINEA -> skip;




