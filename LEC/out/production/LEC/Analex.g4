lexer grammar Analex;

BLANCO:  ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

CONTEXTO: 'CONTEXTO';
DEFECTO: 'DEFECTO';
EXPRESIONES: 'EXPRESIONES';
PyC:';';
IGUAL:'=';
MAS:'+';
MENOS:'-';
POR:'*';
DIV:'/';
PA:'(';
PC:')';
LLA:'{';
LLC:'}';
NUMERO: DIGITO+;
IDENT: LETRA (DIGITO|LETRA)*;
COMENTARIO_LINEA: '//' .*? FIN_LINEA -> skip;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;