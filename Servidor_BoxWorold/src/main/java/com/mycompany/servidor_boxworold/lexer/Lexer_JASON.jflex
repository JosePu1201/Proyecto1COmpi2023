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
ceil = "CEIL"
floor = "FLOOR"
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
{NAME}                  {/*System.out.println(yytext());*/return new Symbol(sym.NOMBRE,yyline+1,yycolumn+1,yytext());}
{ROWS}                  {/*System.out.println(yytext());*/return new Symbol(sym.FILA,yyline+1,yycolumn+1,yytext());}
{COLS}                  {/*System.out.println(yytext());*/return new Symbol(sym.COLUMNA,yyline+1,yycolumn+1,yytext());}
{PLAYERCOLOR}           {/*System.out.println(yytext());*/return new Symbol(sym.COLOR_JUGADOR,yyline+1,yycolumn+1,yytext());}
{HALLCOLOR}             {/*System.out.println(yytext());*/return new Symbol(sym.HALL_COLOR,yyline+1,yycolumn+1,yytext());}
{BRICKCOLOR}            {/*System.out.println(yytext());*/return new Symbol(sym.BRICK_COLOR,yyline+1,yycolumn+1,yytext());}
{UNDEFINEDCOLOR}        {/*System.out.println(yytext());*/return new Symbol(sym.UNDEFINED_COLOR,yyline+1,yycolumn+1,yytext());}
{BOXCOLOR}              {/*System.out.println(yytext());*/return new Symbol(sym.BOX_COLOR,yyline+1,yycolumn+1,yytext());}
{BOXONTARGETCOLOR}      {/*System.out.println(yytext());*/return new Symbol(sym.BOX_ONT_TAGET_COLOR,yyline+1,yycolumn+1,yytext());}
{TARGETCOLOR}           {/*System.out.println(yytext());*/return new Symbol(sym.TARGET_COLOR,yyline+1,yycolumn+1,yytext());}
{POSX}                  {/*System.out.println(yytext());*/return new Symbol(sym.POSX,yyline+1,yycolumn+1,yytext());}
{POSY}                  {/*System.out.println(yytext());*/return new Symbol(sym.POSY,yyline+1,yycolumn+1,yytext());}
{TYPE}                  {/*System.out.println(yytext());*/return new Symbol(sym.TYPE,yyline+1,yycolumn+1,yytext());}
{CONFIG}                {/*System.out.println(yytext());*/return new Symbol(sym.CONFIG,yyline+1,yycolumn+1,yytext());}
{TARGETS}               {/*System.out.println(yytext());*/return new Symbol(sym.TARGETS,yyline+1,yycolumn+1,yytext());}
{PLAYER}                {/*System.out.println(yytext());*/return new Symbol(sym.PLAYER,yyline+1,yycolumn+1,yytext());}
{HALL}                  {/*System.out.println(yytext());*/return new Symbol(sym.HALL,yyline+1,yycolumn+1,yytext());}
{BRICK}                 {/*System.out.println(yytext());*/return new Symbol(sym.BRICK,yyline+1,yycolumn+1,yytext());}
{BOARD}                 {/*System.out.println(yytext());*/return new Symbol(sym.BOARD,yyline+1,yycolumn+1,yytext());}
{BOXES}                 {/*System.out.println(yytext());*/return new Symbol(sym.BOXES,yyline+1,yycolumn+1,yytext());}
{ceil}                  {return new Symbol(sym.CEIL,yyline+1,yycolumn+1,yytext());}
{floor}                 {return new Symbol(sym.FLOOR,yyline+1,yycolumn+1,yytext());}


//agrupacion 
{LLAVEABIERTA}                          {/*System.out.println(yytext());*/return new Symbol(sym.LLAVEABIERTA,yyline+1,yycolumn+1,yytext());}
{LLAVECERRADA}                          {/*System.out.println(yytext());*/return new Symbol(sym.LLAVECERRADA,yyline+1,yycolumn+1,yytext());}
{CORCHETEABIERTO}                       {/*System.out.println(yytext());*/return new Symbol(sym.CORCHETEABIERTO,yyline+1,yycolumn+1,yytext());}
{CORCHETECERRADO}                       {/*System.out.println(yytext());*/return new Symbol(sym.CORCHETECERRADO,yyline+1,yycolumn+1,yytext());}
{PARENTESISABIERTO}                     {/*System.out.println(yytext());*/return new Symbol(sym.PARENTESISABIERTO,yyline+1,yycolumn+1,yytext());}
{PARENTESISCERRADO}                     {/*System.out.println(yytext());*/return new Symbol(sym.PARENTESISCERRADO,yyline+1,yycolumn+1,yytext());}


//signos 
{COMILLAS}                      {/*System.out.println(yytext());*/return new Symbol(sym.COMILLAS,yyline+1,yycolumn+1,yytext());}
{DOSPUNTOS}                     {/*System.out.println(yytext());*/return new Symbol(sym.DOSPUNTOS,yyline+1,yycolumn+1,yytext());}
{COMA}                          {/*System.out.println(yytext());*/return new Symbol(sym.COMA,yyline+1,yycolumn+1,yytext());}
{MULTIPLICAR}                   {/*System.out.println(yytext());*/return new Symbol(sym.MULTIPLICAR,yyline+1,yycolumn+1,yytext());}
{MENOS}                         {/*System.out.println(yytext());*/return new Symbol(sym.MENOS,yyline+1,yycolumn+1,yytext());}
{DIAGONAL}                      {/*System.out.println(yytext());*/return new Symbol(sym.DIAGONAL,yyline+1,yycolumn+1,yytext());}
{POTENCIA}                      {/*System.out.println(yytext());*/return new Symbol(sym.POTENCIA,yyline+1,yycolumn+1,yytext());}                        
{MAS}                           {/*System.out.println(yytext());*/return new Symbol(sym.MAS,yyline+1,yycolumn+1,yytext());}

//reglas lexicas 
{integer}               {/*System.out.println(yytext());*/return new Symbol(sym.NUMERO,yyline+1,yycolumn+1,yytext());}
{decimal}               {/*System.out.println(yytext());*/return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());}
{id}                    {/*System.out.println(yytext());*/return new Symbol(sym.ID,yyline+1,yycolumn+1,yytext());}
{hexa}                  {/*System.out.println(yytext());*/return new Symbol(sym.HEXADECIMAL,yyline+1,yycolumn+1,yytext());}
{WhiteSpace}            {}

[^]                     {/*return new SYMBOL(sym.ERROR,yyline,yycolumn,yytext());*/}//Expresion regular de error