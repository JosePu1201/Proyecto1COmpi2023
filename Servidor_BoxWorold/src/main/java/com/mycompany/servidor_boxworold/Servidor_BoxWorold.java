/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.servidor_boxworold;

import com.mycompany.servidor_boxworold.lexer.Lexer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author jose
 */
public class Servidor_BoxWorold {

	public static void main(String[] args) {
		Scanner entrada = null;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(fileChooser);
		String algo = "";
		try {
			String ruta = fileChooser.getSelectedFile().getAbsolutePath();
			File f = new File(ruta);
			entrada = new Scanner(f);
			while (entrada.hasNext()) {
				algo = algo  + entrada.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("No se ha seleccionado ningún fichero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}

		Reader adentro = new StringReader(algo);
		Lexer nuevo = new Lexer(adentro);

	}
}
