parser grammar Anasint;

options{
    tokenVocab=Analex;
}
programa : PROGRAMA variables instrucciones EOF ;

variables : VARIABLES (lista_vars)? PUNTOYCOMA;

lista_vars : VAR COMA lista_vars
 | VAR
 ;
instrucciones : INSTRUCCIONES (lista_instrs)? ;

lista_instrs : instruccion (lista_instrs)? ;

instruccion : asignacion
 | condicional
 | ruptura
 | impresion
 ;
asignacion : VAR ASIG expr PUNTOYCOMA;

condicional : SI PARENTESISABIERTO condicion PARENTESISCERRADO ENTONCES
 lista_instrs (alternativa)?
 FINSI;

alternativa : SINO lista_instrs ;

ruptura : RUPTURA PUNTOYCOMA ;

impresion : MOSTRAR PARENTESISABIERTO vars PARENTESISCERRADO PUNTOYCOMA ;

vars : VAR COMA vars
 | VAR
 ;

condicion : expr MAYOR expr
  | expr MENOR expr
  | expr IGUAL expr
  | expr DISTINTO expr
  | expr MAYORIGUAL expr
  | expr MENORIGUAL expr
  ;

expr : expr MAS expr
  | expr MENOS expr
  | expr POR expr
  | VAR
  | NUM
  | PARENTESISABIERTO expr PARENTESISCERRADO
  ;