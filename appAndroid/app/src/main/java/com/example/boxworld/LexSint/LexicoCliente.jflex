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
{up}                    {return new Symbol(sym.UP,yyline+1,yycolumn+1,yytext());}
{down}                  {return new Symbol(sym.DOWN,yyline+1,yycolumn+1,yytext());}
{left}                  {return new Symbol(sym.LEFT,yyline+1,yycolumn+1,yytext());}
{right}                 {return new Symbol(sym.RIGHT,yyline+1,yycolumn+1,yytext());}
{push}                  {return new Symbol(sym.PUSH,yyline+1,yycolumn+1,yytext());}
{ceil}                  {return new Symbol(sym.CEIL,yyline+1,yycolumn+1,yytext());}
{floor}                 {return new Symbol(sym.FLOOR,yyline+1,yycolumn+1,yytext());}
{worold}                 {return new Symbol(sym.WOROLD,yyline+1,yycolumn+1,yytext());}
{worolds}                {return new Symbol(sym.WOROLDS,yyline+1,yycolumn+1,yytext());}
{all}                   {return new Symbol(sym.ALL,yyline+1,yycolumn+1,yytext());}
{id}                    {return new Symbol(sym.ID,yyline+1,yycolumn+1,yytext());}
//Singnos de puntuacion 
{PuntoYComa}            {return new Symbol(sym.PUNTOYCOMA,yyline+1,yycolumn+1,yytext());}
{dosPuntos}            {return new Symbol(sym.DOSPUNTOS,yyline+1,yycolumn+1,yytext());}
{comillas}              {return new Symbol(sym.COMILLAS,yyline+1,yycolumn+1,yytext());}
//signos de agrupacion 
{parentesisAbierto}     {return new Symbol(sym.PARENTESISABIERTO,yyline+1,yycolumn+1,yytext());}
{parentesisCerrado}     {return new Symbol(sym.PARENTESISCERRADO,yyline+1,yycolumn+1,yytext());}
{llaveAbierta}          {return new Symbol(sym.LLAVEABIERTA,yyline+1,yycolumn+1,yytext());}
{llaveCerrada}          {return new Symbol(sym.LLAVECERRADA,yyline+1,yycolumn+1,yytext());}
//Operaciones
{suma}                  {return new Symbol(sym.SUMA,yyline+1,yycolumn+1,yytext());}
{resta}                 {return new Symbol(sym.RESTA,yyline+1,yycolumn+1,yytext());}
{multi}                 {return new Symbol(sym.MULTI,yyline+1,yycolumn+1,yytext());} 
{potencia}              {return new Symbol(sym.POTENCIA,yyline+1,yycolumn+1,yytext());}
{raiz}                  {return new Symbol(sym.RAIZ,yyline+1,yycolumn+1,yytext());}

{integer}               {return new Symbol(sym.NUMERO,yyline+1,yycolumn+1,yytext());}
{decimal}               {return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());}

{comentario}            {}
{WhiteSpace}            {}
[^]                     {/*return new SYMBOL(sym.ERROR,yyline,yycolumn,yytext());*/}//Expresion regular de error