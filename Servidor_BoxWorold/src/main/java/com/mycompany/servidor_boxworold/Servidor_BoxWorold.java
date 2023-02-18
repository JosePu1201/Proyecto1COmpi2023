/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.servidor_boxworold;

import com.mycompany.servidor_boxworold.lexer.Lexer;
import java.io.Reader;
import java.io.StringReader;

/**
 *
 * @author jose
 */
public class Servidor_BoxWorold {

    public static void main(String[] args) {
	String adetnro = " \"name\": \"tatoine\",\n" +
"   \"rows\": \"5 * 5 - 20\",\n" +
"   \"cols\": \"10 / 5 + 2\",\n" +
"   \"config\": {\n" +
"       \"box_color\": \"#ffff00\",\n" +
"       \"box_on_target_color\": \"#fe0002\",\n" +
"       \"target_color\": \"#d6fe0a\",\n" +
"       \"brick_color\": \"#bdbebf\",\n" +
"       \"hall_color\": \"#0001ff\",\n" +
"       \"undefined_color\": \"#303030\",\n" +
"       \"player_color\": \"#ff00f7\"\n" +
"   },\n" +
"   \"board\": [\n" +
"       {\n" +
"           \"posX\": 0,\n" +
"           \"posY\": \"2 - 2\",\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 0,\n" +
"           \"posY\": \"3 / 3\",\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 0,\n" +
"           \"posY\": \"2 * 1\",\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 0,\n" +
"           \"posY\": \"9 / 3 * 1\",\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 0,\n" +
"           \"posY\": \"10 / 2 - 1\",\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": \"2 / 2\",\n" +
"           \"posY\": 0,\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": \"10 - 3 * 3\",\n" +
"           \"posY\": \"3 * 2 - 5\",\n" +
"           \"type\": \"HALL\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 1,\n" +
"           \"posY\": \"2 * 1\",\n" +
"           \"type\": \"HALL\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 1,\n" +
"           \"posY\": \"12 / 4 * 1\",\n" +
"           \"type\": \"HALL\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": \"17 - 4 * 4\",\n" +
"           \"posY\": \"10 / 2 - 1\",\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": \"2 / 2 + 1\",\n" +
"           \"posY\": 0,\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": \"10 - 2 * 4\",\n" +
"           \"posY\": \"3 * 2 - 5\",\n" +
"           \"type\": \"HALL\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 2,\n" +
"           \"posY\": \"2 * 1\",\n" +
"           \"type\": \"HALL\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 2,\n" +
"           \"posY\": \"12 / 4 * 1\",\n" +
"           \"type\": \"HALL\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": \"20 - 6 * 3\",\n" +
"           \"posY\": \"10 / 2 - 1\",\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 3,\n" +
"           \"posY\": 0,\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 3,\n" +
"           \"posY\": \"5 / 5 * 6 - 5\",\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 3,\n" +
"           \"posY\": \"2 * 1\",\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": \"9 / 3\",\n" +
"           \"posY\": \"9 / 3 * 1\",\n" +
"           \"type\": \"BRICK\"\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 3,\n" +
"           \"posY\": \"10 / 2 - 1\",\n" +
"           \"type\": \"BRICK\"\n" +
"       }\n" +
"   ],\n" +
"   \"boxes\": [\n" +
"       {\n" +
"           \"posX\": 2,\n" +
"           \"posY\": 1\n" +
"       },\n" +
"       {\n" +
"           \"posX\": 2,\n" +
"           \"posY\": \"1 + 1\"\n" +
"       }\n" +
"   ],\n" +
"   \"targets\": [\n" +
"       {\n" +
"           \"posX\": \"4 / 2 + 1\",\n" +
"           \"posY\": 1\n" +
"       },\n" +
"       {\n" +
"           \"posX\": \"4 / 2 + 1\",\n" +
"           \"posY\": \"1 * 1 + 1\"\n" +
"       }\n" +
"   ],\n" +
"   \"player\": {\n" +
"       \"posX\": 1,\n" +
"       \"posY\": \"(5 + 2) / (3 + 4)\"\n" +
"   }\n" +
"}";
	Reader entrada = new StringReader(adetnro);
	Lexer  nuevo = new Lexer(entrada);
	
    }
}
