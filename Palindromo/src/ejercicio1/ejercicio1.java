package ejercicio1;

import java.util.Scanner;
import java.nio.charset.StandardCharsets;


public class ejercicio1 {

	public static void main(String[] args) {
		String palabra, cadena, cadenaInv, utf8Cadena;
		
		 System.out.print("Introduzca una cadena: ");
		 Scanner input = new Scanner(System.in);
		 palabra = input.nextLine();
		 cadena = palabra.toLowerCase().replace("á", "a").replace("é", "e").replace("i", "i")
				 .replace("ó", "o").replace("ú", "u").replace(" ", "")
				 .replace(".", "").replace(",", "");
		 
		 cadenaInv = new StringBuilder(cadena).reverse().toString();
		 
		 
		 if(cadena.equals(cadenaInv)) 
			 System.out.println("Es palindromo");
		 else 
			 System.out.println("No es palindromo");
		 
		 byte[] bytes = palabra.getBytes(StandardCharsets.UTF_8);
		 utf8Cadena = new String(bytes, StandardCharsets.UTF_8);
		 
		 System.out.println(utf8Cadena  +" - UTF8");
		 

	}

}
