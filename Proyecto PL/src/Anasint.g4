parser grammar Anasint;
options{
	tokenVocab=Analex;
}
programa: PROGRAMA variables subprogramas instrucciones <EOF>;

variables: VARIABLES (vars)*;

vars: nombreVariable DP tipo PyC;

nombreVariable: IDENT (COMA IDENT)*;

tipo: (LOG|NUM|secuencia);

secuencia: SEQ PA (NUM|LOG) PC;

subprogramas: SUBPROGRAMAS (funcion|procedimiento)*;

funcion: FUNCION nombreFuncionProcedimiento contenidoFuncion variables instrucciones FFUNCION;

contenidoFuncion: PA (entradas)* PC DEV PA (salidas)+ PC;

procedimiento: PROCEDIMIENTO nombreFuncionProcedimiento contenidoProcedimiento variables instrucciones FPROCEDIMIENTO;

nombreFuncionProcedimiento: IDENT;

contenidoProcedimiento: PA (entradas)* PC;

entradas: tipo IDENT (COMA entradas)*;

salidas: tipo IDENT (COMA salidas)*;

instrucciones: INSTRUCCIONES instruccion*;

instruccion: (asignacion|uso_predicado|condicional|iteracion|ruptura|mostrar|devolucion);

asignacion: nombresVariablesAsignacion IGUAL valorAsignacion PyC;

valorAsignacion: expresion (COMA expresion)* ;

nombresVariablesAsignacion: IDENT (COMA IDENT)*;

expresion: (expresion_entera|expresion_logica|expresion_secuencia);

expresion_entera: PA expresion_entera PC
                | expresion_entera (POR|SUMA|RESTA) expresion_entera
                | llamada_funcion
                | llamada_secuencia
                | IDENT
                | (RESTA)?NUMERO
                ;

llamada_funcion: IDENT PA (expresion (COMA expresion)*)? PC;

llamada_secuencia: IDENT CA expresion_entera CC;

expresion_logica: VERDADERO
                | FALSO
                | IDENT
                | llamada_secuencia
                | llamada_funcion
                ;

expresion_secuencia: (expresion_secuencia_entera|expresion_secuencia_logica);

expresion_secuencia_entera: CA (expresion_entera (COMA expresion_entera)*)? CC;

expresion_secuencia_logica: CA (expresion_logica (COMA expresion_logica)*)? CC;

uso_predicado: IDENT PA (expresion (COMA expresion)*)? PC PyC;

condicional: SI  PA condicion PC ENTONCES (instruccion)* (SINO (instruccion)*)? FSI;

condicion: PA (igualdad|desigualdad|concatenador) PC
         | (igualdad|desigualdad|concatenador)
         ;

igualdad: expresion IGUALIGUAL expresion;

desigualdad: expresion (MENORQUE|MAYORQUE|DISTINTODE|MENOROIGUAL|MAYOROIGUAL) expresion;

concatenador: NOT (igualdad|desigualdad)
                | (igualdad|desigualdad) OR (igualdad|desigualdad)
                | (igualdad|desigualdad) AND (igualdad|desigualdad)
                ;

iteracion: MIENTRAS PA condicion PC HACER (instruccion)* FMIENTRAS;

ruptura: RUPTURA PyC;

mostrar: MOSTRAR PA (expresion (COMA expresion)*)? PC PyC;

devolucion: DEV IDENT (COMA IDENT)* PyC;