parser grammar Anasint;
options{
 tokenVocab=Analex;
}
programa: especificaciones instrucciones;

especificaciones: ESPECIFICACION clases asociaciones generalizaciones restricciones<EOF>;

//CLASES
clases: CLASES DP clase*;

clase: CLASE NOMBRE PA atributos* PC;

atributos: atributo (COMA atributo)*;

atributo:  IDENT DP tipo;

tipo: TXT
    | NUM
    ;

//ASOCIACIONES
asociaciones: ASOCIACIONES DP asociacion*;

asociacion: ASOCIACION IDENT PA contenido PC;

contenido: cont1 COMA cont2;

cont1: CLASEM DP NOMBRE COMA ROL DP IDENT COMA MULTIPLICIDAD DP mult;

cont2: CLASEM DP NOMBRE COMA ROL DP IDENT COMA MULTIPLICIDAD DP mult;

mult: MAS
    | POR
    | NUMERO
    ;

//GENERALIZACIONES
generalizaciones: GENERALIZACIONES DP generalizacion*;

generalizacion: GENERALIZACION PA superclase COMA subclases PC;

superclase: SUPERCLASE DP NOMBRE;

subclases: SUBCLASES DP NOMBRE;

//RESTRICCIONES
restricciones: RESTRICCIONES DP;

//INSTRUCCIONES
instrucciones: INSTRUCCIONES DP instruccion*;

instruccion: crear
           | eliminar
           | consistencia
           ;

crear: MAS objeto
     | MAS enlace
     ;

objeto: OBJETO IDENT PA cont_objeto PC;

cont_objeto: clase_objeto (COMA atrib_objeto)*;

clase_objeto: CLASEM IGUAL NOMBRE;

atrib_objeto: IDENT IGUAL valor_objeto;

valor_objeto: NUMERO | VALORTXT;

enlace: ENLACE IDENT PA contenido_enlace PC;

contenido_enlace: asociacion_enlace COMA objetos_enlace;

asociacion_enlace: ASOCIACIONM IGUAL IDENT;

objetos_enlace: obj COMA obj;

obj: OBJETOM IGUAL IDENT;

eliminar: MENOS ENLACE IDENT
        | MENOS OBJETO IDENT
        ;

consistencia: CONSISTENCIA;