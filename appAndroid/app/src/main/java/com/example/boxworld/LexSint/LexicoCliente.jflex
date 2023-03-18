    package com.example.boxworld.LexSint;
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

worolds = "worlds"
worold = "world"
all = "all"
up = "up"
down = "down"
left = "left"
right = "right"
push =  "push"
dosPuntos = ":"
PuntoYComa = ";"
numeral = "#"
parentesisAbierto = "("
parentesisCerrado = ")"
llaveAbierta = "{"
llaveCerrada = "}"
comillas = "\""
punto = "."
suma = "+"
resta = "-"
multi = "*"
div = "/"
ceil = "CEIL"
floor = "FLOOR"
potencia = "^"
raiz = "SQRT"

id = [_a-zA-Z][a-zA-Z0-9]*
comentario = [numeral][[a-zA-Z]|[" "]|[0-9]]*
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
{worold}                 {System.out.println(yytext());return new Symbol(sym.WOROLD,yyline+1,yycolumn+1,yytext());}
{worolds}                {System.out.println(yytext());return new Symbol(sym.WOROLDS,yyline+1,yycolumn+1,yytext());}
{all}                   {System.out.println(yytext());return new Symbol(sym.ALL,yyline+1,yycolumn+1,yytext());}
{id}                    {System.out.println(yytext());return new Symbol(sym.ID,yyline+1,yycolumn+1,yytext());}
//Singnos de puntuacion 
{PuntoYComa}            {System.out.println(yytext());return new Symbol(sym.PUNTOYCOMA,yyline+1,yycolumn+1,yytext());}
{dosPuntos}            {System.out.println(yytext());return new Symbol(sym.DOSPUNTOS,yyline+1,yycolumn+1,yytext());}
{comillas}              {System.out.println(yytext());return new Symbol(sym.COMILLAS,yyline+1,yycolumn+1,yytext());}
//signos de agrupacion 
{parentesisAbierto}     {System.out.println(yytext());return new Symbol(sym.PARENTESISABIERTO,yyline+1,yycolumn+1,yytext());}
{parentesisCerrado}     {System.out.println(yytext());return new Symbol(sym.PARENTESISCERRADO,yyline+1,yycolumn+1,yytext());}
{llaveAbierta}          {System.out.println(yytext());return new Symbol(sym.LLAVEABIERTA,yyline+1,yycolumn+1,yytext());}
{llaveCerrada}          {System.out.println(yytext());return new Symbol(sym.LLAVECERRADA,yyline+1,yycolumn+1,yytext());}
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