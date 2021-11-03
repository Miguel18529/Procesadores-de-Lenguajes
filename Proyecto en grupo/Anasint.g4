parser grammar Anasint;
options{
  tokenVocab=Analex;
}

programa : subprogramas  EOF;

subprogramas : funcion | procedimiento;

funcion : FUNCION IDENT PA entradas PC DEV PA (salidas | predicado) PC variables instrucciones FFUNCION;

procedimiento : PROCEDIMIENTO IDENT PA entradas PC variables instrucciones FPROCEDIMIENTO;

entradas : tipo IDENT (COMA entradas)? | ;
salidas : (NUM|secuencia) IDENT (COMA salidas)?;
predicado : LOG IDENT;

variables : VARIABLES (vars)*;
vars : nombreVariable DOSPUNTOS tipo PyC;
nombreVariable : IDENT (COMA nombreVariable)?;
tipo: NUM | LOG | secuencia;
secuencia: SEQ PA (NUM|LOG) PC;

//las instrucciones son: asignación, condicional, iteración,ruptura de control,llamada a procedimiento función, devolución de resultados de una función, mostrar por consola el valor de variables y aserto


instrucciones : INSTRUCCIONES instruccion*;

instruccion: (asignacion | condicionales | iteracion | ruptura | resultado | mostrar );

asignacion: nombreVariable IGUAL expresion (COMA expresion)* PyC;
expresion : expresion_entera
      | expresion_logica
      | expresion_secuencia_logica
      | expresion_secuencia_entera
      ;

expresion_entera:  expresion_entera (POR|SUMA|RESTA) expresion_entera
      | PA expresion_entera PC
      | llamada_funcion
      | llamada_secuencia
      | (RESTA)? NUMERO
      | IDENT
      ;

llamada_funcion : IDENT PA (expresion (COMA expresion)*)? PC;

llamada_secuencia : IDENT CA expresion_entera CC;

expresion_secuencia_entera : CA (expresion_entera (COMA expresion_entera)*)? CC ;

expresion_secuencia_logica: CA (expresion_logica (COMA expresion_logica)*)? CC ;


expresion_logica : expresion_logica (AND|OR) expresion_logica
              | PA expresion_logica PC
              | llamada_funcion
              | llamada_secuencia
              | INDEFINIDO
              | VERDADERO
              | FALSO
              | IDENT;

//usamos expresion_entera|expresion_logica, para “operar” dentro de una sec, ejem: sec(i+1)


condicionales : SI PA condicion PC
          ENTONCES instruccion*
          (SINO instruccion*)?
          FSI
          ;

condicion : expresion_condicional condicional expresion_condicional (concatenar condicion)*;


condicional : igualdades | desigualdades | concatenar;

concatenar : (AND | OR)
      | NOT
      ;
igualdades : IGUALIGUAL;

desigualdades : DISTINTO | MAYOR | MENOR | MENORIGUAL | MAYORIGUAL;

expresion_condicional : expresion_entera | expresion_logica;


iteracion : MIENTRAS PA condicion PC HACER
              instruccion+
          FMIENTRAS
      ;
ruptura : RUPTURA PyC;

resultado : DEV valor_devuelto PyC;

valor_devuelto : (IDENT | VERDADERO | FALSO) (COMA valor_devuelto)? ;

mostrar :  MOSTRAR PA expresion PC PyC;
