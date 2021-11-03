parser grammar Anasint;

options{
    tokenVocab=Analex;
}

programa: variables asignaciones;

variables: VARIABLES (definicion_variables PyC)+;

definicion_variables: tipo idents;

tipo: HLIST
    | BLIST
    | ILIST
    | BOOLEAN
    | INTEGER
    ;

idents: IDENT (COMA IDENT)*;

asignaciones: ASIGNACIONES asig*;

asig: IDENT IGUAL expresion PyC;

expresion: expr_lista
         | expr_booleana
         | expr_entera
         ;

expr_lista: lista_por_extension
          | lista_append
          | variable
          ;

lista_por_extension: CA (expr_entera|expr_booleana) (COMA (expr_entera|expr_booleana))* CC;

lista_append: APPEND PA expr_lista COMA expr_lista PC;

variable: IDENT;

expr_entera: (ADD|MINUS|TIMES) PA IDENT COMA IDENT PC
           | IDENT
           | NUMERO
           ;

expr_booleana: (OR|AND) PA expr_booleana COMA expr_booleana PC
             | NOT PA expr_booleana PC
             | IDENT
             | BOOLEANO
             ;
