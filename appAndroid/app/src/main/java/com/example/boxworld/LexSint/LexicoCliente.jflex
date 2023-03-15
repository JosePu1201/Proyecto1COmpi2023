    package com.mycompany.servidor_boxworold.Grafico.LexerCliente;
    import com.mycompany.servidor_boxworold.Grafico.CupCliente.sym;
    import java_cup.runtime.*;      

%%
    //config de jflex
%class LexerCliente
%unicode
%line
%column 
%public
%standalone
%cup
%eofval{
  return new Symbol(<EOF);
%eofval}
%eofclose

up = "up"
down = "down"
left = "left"
right = "right"
push =  "push"
PuntoYComa = ";"
numeral = "#"
parentesisAbierto = "("
parentesisCerrado = ")"
punto = "."
suma = "+"
resta = "-"
multi = "*"
div = "/"
ceil = "CEIL"
floor = "FLOOR"
potencia = "^"
raiz = "SQRT"

comentario = [numeral][[a-zA-Z]|["\t"]|[" "]|[0-9]]*
LineTerminator = \n|\r|\n\r 
WhiteSpace = {LineTerminator}|[ \t\f]|[" "]
integer = 0|[1-9][0-9]*
decimal = {integer}\.\d
%%
//Palabras eservadas
{up}                    {System.out.println(yytext());return new Symbol(sym.UP,yyline+1,yycolumn+1,yytext());}
{down}                  {System.out.println(yytext());return new Symbol(sym.DOWN,yyline+1,yycolumn+1,yytext());}
{left}                  {System.out.println(yytext());return new Symbol(sym.LEFT,yyline+1,yycolumn+1,yytext());}
{right}                 {System.out.println(yytext());return new Symbol(sym.RIGHT,yyline+1,yycolumn+1,yytext());}
{push}                  {System.out.println(yytext());return new Symbol(sym.PUSH,yyline+1,yycolumn+1,yytext());}
{ceil}                  {System.out.println(yytext());return new Symbol(sym.CEIL,yyline+1,yycolumn+1,yytext());}
{floor}                 {System.out.println(yytext());return new Symbol(sym.FLOOR,yyline+1,yycolumn+1,yytext());}
//Singnos de puntuacion 
{PuntoYComa}            {System.out.println(yytext());return new Symbol(sym.PUNTOYCOMA,yyline+1,yycolumn+1,yytext());}
//signos de agrupacion 
{parentesisAbierto}     {System.out.println(yytext());return new Symbol(sym.PARENTESISABIERTO,yyline+1,yycolumn+1,yytext());}
{parentesisCerrado}     {System.out.println(yytext());return new Symbol(sym.PARENTESISCERRADO,yyline+1,yycolumn+1,yytext());}
//Operaciones
{suma}                  {System.out.println(yytext());return new Symbol(sym.SUMA,yyline+1,yycolumn+1,yytext());}
{resta}                 {System.out.println(yytext());return new Symbol(sym.RESTA,yyline+1,yycolumn+1,yytext());}
{multi}                 {System.out.println(yytext());return new Symbol(sym.MULTI,yyline+1,yycolumn+1,yytext());} 
{potencia}              {System.out.println(yytext());return new Symbol(sym.POTENCIA,yyline+1,yycolumn+1,yytext());}
{raiz}                  {System.out.println(yytext());return new Symbol(sym.RAIZ,yyline+1,yycolumn+1,yytext());}

{integer}               {System.out.println(yytext());return new Symbol(sym.NUMERO,yyline+1,yycolumn+1,yytext());}
{decimal}               {System.out.println(yytext());return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());}

{comentario}            {System.out.println(yytext());}
{WhiteSpace}            {}
[^]                     {/*return new SYMBOL(sym.ERROR,yyline,yycolumn,yytext());*/}//Expresion regular de error