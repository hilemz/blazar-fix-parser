package net.openblazar.fixparser.desktop;

import java.io.*;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public class Converter {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream
				(new File("G:\\BlazarSoftware\\OpenBlazar\\blazar-fix-parser\\src\\main\\resources\\FIX50.txt"))))) {
			String currentLine;

			while ((currentLine = reader.readLine()) != null) {
				String[] elements = currentLine.split(" ");
				System.out.println("case "+elements[0]+":");
				System.out.println("return "+elements[1]+";");
			}
		} catch (IOException e) {
			//
		}
	}

}
