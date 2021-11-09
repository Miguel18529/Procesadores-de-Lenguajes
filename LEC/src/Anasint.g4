parser grammar Anasint;

options{
    tokenVocab=Analex;
    }

programa: contextos defecto expresiones;

contextos: contexto+;

contexto: CONTEXTO NUMERO asignaciones*;

asignaciones: IDENT IGUAL NUMERO PyC;

defecto: DEFECTO NUMERO;

expresiones: EXPRESIONES (expr PyC)*;

expr: expr1(MAS|MENOS)expr
    | expr1
    ;

expr1:expr2(POR|DIV)expr1
     |expr2
     ;

expr2: NUMERO
     | IDENT
     | PA expr PC
     | IDENT LLA NUMERO LLC
     ;