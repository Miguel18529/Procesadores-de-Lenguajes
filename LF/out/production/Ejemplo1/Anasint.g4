parser grammar Anasint;
options{ tokenVocab=Analex; }
programa : variables instrucciones EOF #Prog ;
variables: VARIABLES idents PyC #Vars ;
idents : VAR COMA idents #Ids
       | VAR #Id
       ;
instrucciones : INSTRUCCIONES (definicion|evaluacion)* #Instrs ;
definicion : VAR DEF expresion PyC #Def ;
evaluacion : EVAL VAR PyC #Ev ;
expresion : PA expresion PC #ParExpr
          | MENOS expresion #UnarioMenosExpr
          | expresion POR expresion #PorExpr
          | expresion MAS expresion #MasExpr
          | expresion MENOS expresion #MenosExpr
          | NUMERO #NumExpr
          | VAR #IdExpr
          ;