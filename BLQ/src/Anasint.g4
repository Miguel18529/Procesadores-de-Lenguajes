parser grammar Anasint;

options{
    tokenVocab=Analex;
}

programa: bloque EOF;

bloque: BLOQUE variables instrucciones FBLOQUE;

variables: vars PyC;

vars: IDENT COMA vars
    | IDENT
    ;

instrucciones: (asignacion|bloque)*;

asignacion: IDENT IGUAL expr PyC;

expr: expr1 (MAS|MENOS) expr
    | expr1;

expr1: expr2 (POR|DIV) expr1
     | expr2;

expr2: NUMERO
     | IDENT
     | PA expr PC
     ;