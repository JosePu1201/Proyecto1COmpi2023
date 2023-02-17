//codigo en java
    package com.example.demo_flex_y_cup;

%%
    //config de jflex
%class Lexer
%unicode
%line
%column
%type Token    
//%standalone
    
%{
    private Token tokenE(TokenType type, Object value){
        return new Token(value.toString(),type,yyline,yycolumn);
    }
        private Token tokenS(TokenType type){
        return new Token(null,type,yyline,yycolumn);
    }

%}
    //Expresiones regulares
    LineTerminator = \n|\r|\n\r 
    WhiteSpace = {LineTerminator}|[ \t\f]
    integer = 0|[1-9][0-9]*
    decimal = {integer}\.\d
    id = [_a-zA-Z][a-zA-Z0-9]*
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

%%

<YYINITIAL>{
    {integer}   {
        return tokenE(TokenType.INTEGER,yytext());
    }
    {decimal}
    {
        return tokenE(TokenType.DECMAL,yytext());
    }
    {id}
    {
        return tokenE(TokenType.ID,yytext());
    }
     {WhiteSpace}
    {
        //return tokenE(TokenType.INTEGER,yytext());
    }
}
