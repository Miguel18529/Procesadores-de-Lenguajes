parser grammar Anasint;
options{
	tokenVocab=Analex;
}
programa : declaracion_variables instrucciones EOF ;
declaracion_variables: VARIABLES variables PyC
 ;
variables: IDENT COMA variables #Ids
 | IDENT #Id
 ;
instrucciones: INSTRUCCIONES (asignacion)* ;
asignacion : IDENT ASIG expresion PyC ;
expresion : expresion (POR|DIV|MAS|MENOS) expresion #OpBin
 | NUMERO #Num
 | IDENT PA PC #VarNoAmb
 | IDENT #Var
 | PA expresion PC #Par
 ;