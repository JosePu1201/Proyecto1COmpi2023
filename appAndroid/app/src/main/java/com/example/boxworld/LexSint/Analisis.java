package com.example.boxworld.LexSint;
import java.io.Reader;
import java.io.StringReader;

public class Analisis extends Thread{
    private String entrada;
    private LexerCliente lexico;
    private parser parser;
    public Analisis(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public void run(){
        System.out.println("entra a clase o no xD ");

        Reader adentro = new StringReader(entrada);
        lexico = new LexerCliente(adentro);
        parser = new parser(lexico);
        try{
            System.out.println("inicia parser");
            parser.parse();
            System.out.println("Termina parser");
        }
        catch(Exception e){

        }

    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public LexerCliente getLexico() {
        return lexico;
    }

    public void setLexico(LexerCliente lexico) {
        this.lexico = lexico;
    }

    public com.example.boxworld.LexSint.parser getParser() {
        return parser;
    }

    public void setParser(com.example.boxworld.LexSint.parser parser) {
        this.parser = parser;
    }
}
