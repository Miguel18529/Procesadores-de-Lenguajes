parser grammar Anasint;

options{
    tokenVocab=Analex;
}

programa: variables asignaciones;

variables: VARIABLES (definicion_variables PyC)+;

definicion_variables: (l_hib|l_bool|l_int|int|bool);

l_hib: HLIST idents;

l_bool: BLIST idents;

l_int: ILIST idents;

int: INTEGER idents;

bool: BOOLEAN idents;

idents: IDENT (COMA IDENT)*;

asignaciones: ASIGNACIONES (asignacion)* PyC;

asignacion: IDENT IGUAL valor;

valor: lista
	 | expresion_entera
	 | expresion_booleana
     ;
lista: CA expr_lista CC;

expr_lista: lista_entera
		  | lista_booleana
		  | lista_hibrida
          ;

lista_entera: expresion_entera (COMA expresion_entera)*;

lista_booleana: expresion_booleana (COMA expresion_booleana)*;

lista_hibrida: (expresion_entera|expresion_booleana) (COMA (expresion_booleana|expresion_entera));

expresion_entera: NUMERO
                | IDENT
                | expresion_entera MAS expresion_entera
                | expresion_entera MENOS expresion_entera
                | expresion_entera POR expresion_entera
                ;

expresion_booleana: TRUE
                  | FALSE
                  | IDENT
                  | NOT PA expresion_booleana PC
                  | funcion_booleana PA expresion_booleana COMA expresion_booleana PC
                  ;

funcion_booleana: OR|AND;











