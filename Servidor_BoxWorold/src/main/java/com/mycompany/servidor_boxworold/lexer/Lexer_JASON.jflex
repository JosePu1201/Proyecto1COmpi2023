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
    
%{
 
%}
%eofval{
    
%eofval}
%eofclose
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

<YYINITIAL>{
    {integer}   {}
    {decimal} {}
    {id} {}
    {WhiteSpace} {}
    {nombre} {}
    {filas} {}
    {columnas} {}
    {configuracion} {}
    {colorCajas} {}
    {colorCajasObjetivo} {}
    {lugarAlmacen} {}
    {paredColor} {}
    {caminoColor} {}
    {nada} {}
    {jugador} {}
    {tablero} {}
    {posX} {}
    {posY} {}
    {tipo} {}
    {cajas} {}
    {targets} {}
    {player} {}
    {pared} {}
    {pasillo} {}
    {comillasDobles} {}
    {punto} {}
    {puntoComa} {}
    {coma} {}
    {llaveAbierta} {}
    {llaveCerrada} {}
    {corcheteAbierto} {}
    {corcheteCerrado} {}
    {numeral} {}
    {multi} {}
    {div} {}
    {resta} {}
    {suma} {}

}
[^] {    }
