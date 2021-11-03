lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];

ASIG: '=';
WHILE: 'while';
IF: 'if';
BREAK: 'break';
MAS: '+';
MENOS: '-';
POR:'*';
DIV:'/';
MENOR:'<';
MAYOR:'>';
MENORIGUAL:'<=';
MAYORIGUAL:'>=';
IGUAL:'==';
DISTINTO:'!=';
PA: '(';
PC: ')';
LLA: '{';
LLC: '}';
PyC: ';';
IDENT: LETRA(DIGITO|LETRA)*;
NUMERO: ('-')?DIGITO+;

COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;
COMENTARIO_LINEA: '//' .*? FIN_LINEA -> skip;