//codigo en java
    package com.mycompany.servidor_boxworold.Juego;
    import java_cup.runtime.*;

%%
    //config de jflex
%class Lexer
%unicode
%line
%column 
%public
%cup

//%standalone
  /*  
    // Palabras reservadas 
    cajas = "boxes"
    // Signos de puntuacion 
    puntoComa = ";"
    punto = "."
    numeral = "#" 
    floor = "FLOOR"
    ceil = "CEIL"   
    parentesisAbierto = "("
    parentesisCerrado = ")"
    //operadores
multi = "*"
div = "/"
resta = "-"
suma = "+"*/
    //Expresiones regulares
type = "HALL"
LineTerminator = \n|\r|\n\r 
WhiteSpace = {LineTerminator}|[ \t\f]
integer = 0|[1-9][0-9]*
decimal = {integer}\.\d
id = [_a-zA-Z][a-zA-Z0-9]*
hex = [0-9]|[a]|[b]|[c]|[d]|[e]|[f]
hexa = [#][hex]+
%%

//palabras reservadas 
"name"                {return new Symbol(sym.NOMBRE,yyline+1,yycolumn+1,yytext());}
"rows"                {return new Symbol(sym.FILA,yyline+1,yycolumn+1,yytext());}
"cols"                {return new Symbol(sym.COLUMNA,yyline+1,yycolumn+1,yytext());}
"player_color"        {return new Symbol(sym.PLAYER_COLOR,yyline+1,yycolumn+1,yytext());}
"hall_color"          {return new Symbol(sym.HALL_COLOR,yyline+1,yycolumn+1,yytext());}
"brick_color"         {return new Symbol(sym.BRICK_COLOR,yyline+1,yycolumn+1,yytext());}
"undfined_color"      {return new Symbol(sym.UNDEFINED_COLOR,yyline+1,yycolumn+1,yytext());}
"box_color"           {return new Symbol(sym.BOX_COLOR,yyline+1,yycolumn+1,yytext());}
"box_on_target_color" {return new Symbol(sym.BOX_ONT_TAGET_COLOR,yyline+1,yycolumn+1,yytext());}
"target_color"        {return new Symbol(sym.TARGET_COLOR,yyline+1,yycolumn+1,yytext());}
"board"               {return new Symbol(sym.BOARD,yyline+1,yycolumn+1,yytext());}
"posX"                {return new Symbol(sym.POSX,yyline+1,yycolumn+1,yytext());}
"posy"                {return new Symbol(sym.POSY,yyline+1,yycolumn+1,yytext());}
"type"                {return new Symbol(sym.TYPE,yyline+1,yycolumn+1,yytext());}
"config"              {return new Symbol(sym.CONFIG,yyline+1,yycolumn+1,yytext());}
"targets"             {return new Symbol(sym.TARGETS,yyline+1,yycolumn+1,yytext());}
"player"              {return new Symbol(sym.PLAYER,yyline+1,yycolumn+1,yytext());}

//agrupacion 
"{"                   {return new Symbol(sym.LLAVEABIERTA,yyline+1,yycolumn+1,yytext());}
"}"                   {return new Symbol(sym.LLAVECERRADA,yyline+1,yycolumn+1,yytext());}
"["                   {return new Symbol(sym.CORCHETEABIERTO,yyline+1,yycolumn+1,yytext());}
"]"                   {return new Symbol(sym.CORCHETECERRADO,yyline+1,yycolumn+1,yytext());}

//signos 
"\""                  {return new Symbol(sym.COMILLAS,yyline+1,yycolumn+1,yytext());}
":"                   {return new Symbol(sym.DOSPUNTOS,yyline+1,yycolumn+1,yytext());}
","                   {return new Symbol(sym.COMA,yyline+1,yycolumn+1,yytext());}

//reglas lexicas 
{integer}               {return new Symbol(sym.NUMERO,yyline+1,yycolumn+1,yytext());}
{decimal}               {return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());}
{id}                    {return new Symbol(sym.ID,yyline+1,yycolumn+1,yytext());}
//{type}                  {return new Symbol(sym.TIPO,yyline+1,yycolumn+1,yytext());}
{hexa}                  {return new Symbol(sym.HEXADECIMAL,yyline+1,yycolumn+1,yytext());}
{WhiteSpace}            {}

[^] {}
