//codigo en java

package com.mycompany.servidor_boxworold.lexer;

import com.mycompany.servidor_boxworold.lexer.cup.sym;

import java_cup.runtime.*;
import java.util.*;
import java_cup.runtime.XMLElement;

%%
    //config de jflex
%class Lexer
%unicode
%line
%column 
%public
%standalone
%cup


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
BOXES = "boxes"
BOARD = "board"
NAME = "name"
ROWS = "rows"
COLS = "cols"
PLAYERCOLOR = "player_color" 
HALLCOLOR = "hall_color" 
BRICKCOLOR = "brick_color" 
UNDEFINEDCOLOR = "undefined_color"
BOXCOLOR = "box_color"
BOXONTARGETCOLOR = "box_on_target_color"
TARGETCOLOR = "target_color"
POSX = "posX"
POSY = "posY"
TYPE = "type"
CONFIG = "config"
TARGETS = "targets" 
PLAYER = "player"
HALL = "HALL" 
BRICK = "BRICK" 
LLAVEABIERTA = "{"
LLAVECERRADA = "}"
CORCHETEABIERTO  = "\["
CORCHETECERRADO = "]"
PARENTESISABIERTO = "("
PARENTESISCERRADO = ")"
COMILLAS = "\""
DOSPUNTOS = ":"
COMA = "," 
MULTIPLICAR = "*"
MENOS = "-" 
DIAGONAL = "/"
POTENCIA = "^"
MAS = "+"
    //Expresiones regulares
LineTerminator = \n|\r|\n\r 
WhiteSpace = {LineTerminator}|[ \t\f]|[" "]
integer = 0|[1-9][0-9]*
decimal = {integer}\.\d
id = [_a-zA-Z][a-zA-Z0-9]*
hexa = [#][a-fA-F0-9]+
%%

//palabras reservadas 
{NAME}                  {System.out.println(yytext());return new Symbol(sym.NOMBRE,yyline+1,yycolumn+1);}
{ROWS}                  {System.out.println(yytext());return new Symbol(sym.FILA,yyline+1,yycolumn+1);}
{COLS}                  {System.out.println(yytext());return new Symbol(sym.COLUMNA,yyline+1,yycolumn+1);}
{PLAYERCOLOR}           {System.out.println(yytext());return new Symbol(sym.COLOR_JUGADOR,yyline+1,yycolumn+1);}
{HALLCOLOR}             {System.out.println(yytext());return new Symbol(sym.HALL_COLOR,yyline+1,yycolumn+1);}
{BRICKCOLOR}            {System.out.println(yytext());return new Symbol(sym.BRICK_COLOR,yyline+1,yycolumn+1);}
{UNDEFINEDCOLOR}        {System.out.println(yytext());return new Symbol(sym.UNDEFINED_COLOR,yyline+1,yycolumn+1);}
{BOXCOLOR}              {System.out.println(yytext());return new Symbol(sym.BOX_COLOR,yyline+1,yycolumn+1);}
{BOXONTARGETCOLOR}      {System.out.println(yytext());return new Symbol(sym.BOX_ONT_TAGET_COLOR,yyline+1,yycolumn+1);}
{TARGETCOLOR}           {System.out.println(yytext());return new Symbol(sym.TARGET_COLOR,yyline+1,yycolumn+1);}
{POSX}                  {System.out.println(yytext());return new Symbol(sym.POSX,yyline+1,yycolumn+1);}
{POSY}                  {System.out.println(yytext());return new Symbol(sym.POSY,yyline+1,yycolumn+1);}
{TYPE}                  {System.out.println(yytext());return new Symbol(sym.TYPE,yyline+1,yycolumn+1);}
{CONFIG}                {System.out.println(yytext());return new Symbol(sym.CONFIG,yyline+1,yycolumn+1);}
{TARGETS}               {System.out.println(yytext());return new Symbol(sym.TARGETS,yyline+1,yycolumn+1);}
{PLAYER}                {System.out.println(yytext());return new Symbol(sym.PLAYER,yyline+1,yycolumn+1);}
{HALL}                  {System.out.println(yytext());return new Symbol(sym.HALL,yyline+1,yycolumn+1);}
{BRICK}                 {System.out.println(yytext());return new Symbol(sym.BRICK,yyline+1,yycolumn+1);}
{BOARD}                 {System.out.println(yytext());return new Symbol(sym.BOARD,yyline+1,yycolumn+1);}
{BOXES}                 {System.out.println(yytext());return new Symbol(sym.BOXES,yyline+1,yycolumn+1);}


//agrupacion 
{LLAVEABIERTA}                          {System.out.println(yytext());return new Symbol(sym.LLAVEABIERTA,yyline+1,yycolumn+1);}
{LLAVECERRADA}                          {System.out.println(yytext());return new Symbol(sym.LLAVECERRADA,yyline+1,yycolumn+1);}
{CORCHETEABIERTO}                       {System.out.println(yytext());return new Symbol(sym.CORCHETEABIERTO,yyline+1,yycolumn+1);}
{CORCHETECERRADO}                       {System.out.println(yytext());return new Symbol(sym.CORCHETECERRADO,yyline+1,yycolumn+1);}
{PARENTESISABIERTO}                     {System.out.println(yytext());return new Symbol(sym.PARENTESISABIERTO,yyline+1,yycolumn+1);}
{PARENTESISCERRADO}                     {System.out.println(yytext());return new Symbol(sym.PARENTESISCERRADO,yyline+1,yycolumn+1);}


//signos 
{COMILLAS}                      {System.out.println(yytext());return new Symbol(sym.COMILLAS,yyline+1,yycolumn+1);}
{DOSPUNTOS}                     {System.out.println(yytext());return new Symbol(sym.DOSPUNTOS,yyline+1,yycolumn+1);}
{COMA}                          {System.out.println(yytext());return new Symbol(sym.COMA,yyline+1,yycolumn+1);}
{MULTIPLICAR}                   {System.out.println(yytext());return new Symbol(sym.MULTIPLICAR,yyline+1,yycolumn+1);}
{MENOS}                         {System.out.println(yytext());return new Symbol(sym.MENOS,yyline+1,yycolumn+1);}
{DIAGONAL}                      {System.out.println(yytext());return new Symbol(sym.DIAGONAL,yyline+1,yycolumn+1);}
{POTENCIA}                      {System.out.println(yytext());return new Symbol(sym.POTENCIA,yyline+1,yycolumn+1);}                        
{MAS}                           {System.out.println(yytext());return new Symbol(sym.MAS,yyline+1,yycolumn+1);}

//reglas lexicas 
{integer}               {System.out.println(yytext());return new Symbol(sym.NUMERO,yyline+1,yycolumn+1,yytext());}
{decimal}               {System.out.println(yytext());return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());}
{id}                    {System.out.println(yytext());return new Symbol(sym.ID,yyline+1,yycolumn+1,yytext());}
{hexa}                  {System.out.println(yytext());return new Symbol(sym.HEXADECIMAL,yyline+1,yycolumn+1,yytext());}
{WhiteSpace}            {}

[^]                     {/*return new SYMBOL(sym.ERROR,yyline,yycolumn,yytext());*/}//Expresion regular de error