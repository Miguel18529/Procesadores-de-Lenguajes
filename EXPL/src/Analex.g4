lexer grammar Analex;

BLANCO: ' ' ->skip;
TABULADOR: '\t'->skip;
FIN_LINEA: '\r'?'\n' ->skip;

fragment DIGITO: [0-9];
fragment LETRA: [A-Za-z];

WHILE: 'while';
IF: 'if';
BREAK: 'break';

ASIG: '=';
MENOR:'<';
MAYOR:'>';
MENORIGUAL:'<=';
MAYORIGUAL:'>=';
IGUAL:'==';
DISTINTO:'!=';
MAS:'+';
MENOS: '-';
POR:'*';
DIV:'/';
PA:'(';
PC:')';
LLA: '{';
LLC:'}';
PyC: ';';

IDENT: LETRA(DIGITO|LETRA)*;
NUMERO: DIGITO+;

COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;