//codigo en java
    package com.mycompany.servidor_boxworold.lexer;

%%
    //config de jflex
%class Lexer
%unicode
%line
%column 
%public
%type Token
//%standalone
    
    // Palabras reservadas 
    nombre = "name"
    filas = "rows"
    columnas = "cols"
    configuracion = "config"
    colorCajas = "box_color"
    colorCajasObjetivo = "box_on_target_color"
    lugarAlmacen = "target_color"
    paredColor = "brick_color"
    caminoColor = "hall_color"
    nada = "undfined_color"
    jugador = "player_color"
    tablero = "board"
    posX = "posX"
    posY = "posY"
    tipo = "type"
    cajas = "boxes"
    targets = "targets"
    player = "player"
    pared = "BRICK"
    pasillo = "HALL"
    // Signos de puntuacion 
    comillasDobles = "\""
    dosPuntos = ":"
    puntoComa = ";"
    coma = ","
    punto = "."
    llaveAbierta = "{"
    llaveCerrada = "}"
    corcheteAbierto = "["
    corcheteCerrado = "]"
    numeral = "#" 
    floor = "FLOOR"
    ceil = "CEIL"   
    parentesisAbierto = "("
    parentesisCerrado = ")"
    //operadores
    multi = "*"
    div = "/"
    resta = "-"
    suma = "+"
    //Expresiones regulares
    LineTerminator = \n|\r|\n\r 
    WhiteSpace = {LineTerminator}|[ \t\f]
    integer = 0|[1-9][0-9]*
    decimal = {integer}\.\d
    id = [_a-zA-Z][a-zA-Z0-9]*

%%

{integer}               {System.out.println(yytext()+"entero");}
{decimal}               {System.out.println(yytext());}
{id}                    {System.out.println(yytext());}
{WhiteSpace}            {System.out.println(yytext());}
{nombre}                {System.out.println(yytext());}
{filas}                 {System.out.println(yytext());}
{columnas}              {System.out.println(yytext());}
{configuracion}         {System.out.println(yytext());}
{colorCajas}            {System.out.println(yytext());}
{colorCajasObjetivo}    {System.out.println(yytext());}
{lugarAlmacen}          {System.out.println(yytext());}
{paredColor}            {System.out.println(yytext());}
{caminoColor}           {System.out.println(yytext());}
{nada}                  {System.out.println(yytext());}
{jugador}               {System.out.println(yytext());}
{tablero}               {System.out.println(yytext());}
{posX}                  {System.out.println(yytext());}
{posY}                  {System.out.println(yytext());}
{tipo}                  {System.out.println(yytext());}
{cajas}                 {System.out.println(yytext());}
{targets}               {System.out.println(yytext());}
{player}                {System.out.println(yytext());}
{pared}                 {System.out.println(yytext());}
{pasillo}               {System.out.println(yytext());}
{comillasDobles}        {System.out.println(yytext());}
{punto}                 {System.out.println(yytext());}
{puntoComa}             {System.out.println(yytext());}
{coma}                  {System.out.println(yytext());}
{llaveAbierta}          {System.out.println(yytext());}
{llaveCerrada}          {System.out.println(yytext());}
{corcheteAbierto}       {System.out.println(yytext());}
{corcheteCerrado}       {System.out.println(yytext());}
{numeral}               {System.out.println(yytext());}
{multi}                 {System.out.println(yytext());}
{div}                   {System.out.println(yytext());}
{resta} {               System.out.println(yytext());}
{suma}                  {System.out.println(yytext());}
{dosPuntos}             {System.out.println(yytext());}
{floor}                 {System.out.println(yytext());}
{ceil}                  {System.out.println(yytext());}
{parentesisAbierto}     {System.out.println(yytext());}       
{parentesisCerrado}     {System.out.println(yytext());}
          
[^] {}
