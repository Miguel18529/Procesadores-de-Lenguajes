parser grammar Anasint;

options{
    tokenVocab = Analex;
}

programa: esq_fuente datos_fuente esq_destino restr;

esq_fuente: ESQUEMA FUENTE (IDENT PA parametros PC)+;

parametros: IDENT_MAYUS COMA parametros
          | IDENT_MAYUS
          ;

datos_fuente:DATOS FUENTE (IDENT PA datos PC)+;

datos: (IDENT|NUMERO) COMA datos
     | (IDENT|NUMERO)
     ;

esq_destino: ESQUEMA DESTINO (IDENT PA parametros PC)+;

restr: RESTRICCIONES restriccion+;

restriccion: decl_vars implicacion;

decl_vars: VAR variables PyC;

variables: IDENT COMA variables
         | IDENT
         ;

implicacion: IDENT PA variables PC IMPLICA IDENT PA variables PC;