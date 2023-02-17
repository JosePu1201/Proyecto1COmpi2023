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

    // Signos de puntuacion 

    //

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
