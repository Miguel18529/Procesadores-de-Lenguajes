parser grammar Anasint;

options{
    tokenVocab = Analex;
}

programa: esq_fuente datos_fuente esq_destino restr;

esq_fuente: ESQUEMA FUENTE clases+;

clases: IDENT PA elements PC;

elements: IDENT COMA elements
        | IDENT
        ;

datos_fuente:DATOS FUENTE datos+;

datos: IDENT PA atribs PC;

atribs: (IDENT|NUMERO) COMA atribs
      | (IDENT|NUMERO)
      ;

esq_destino: ESQUEMA DESTINO clases+;

restr: RESTRICCIONES restriccion+;

restriccion: decl_vars implicacion;

decl_vars: VAR variables PyC;

variables: IDENT COMA variables
         | IDENT
         ;

implicacion: IDENT PA variables PC IMPLICA IDENT PA variables PC;