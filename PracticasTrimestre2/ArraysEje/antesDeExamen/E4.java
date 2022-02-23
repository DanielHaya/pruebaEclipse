package antesDeExamen;

import java.util.Scanner;

public class E4 {
	
	static Scanner tcl = new Scanner(System.in);

	public static void main(String[] args) {
		
		String escrito = tcl.nextLine();
		
		char frase [] = escrito.toCharArray(); 
		for(int i=0 ; i<frase.length ; i++) {
			rotarPalabras(frase);
			System.out.println(frase);
		}
		
		
	}
	
	public static void rotarPalabras(char frase []) {
		
		char primero = frase[0];
		int i;
		
		for(i=0 ; i<frase.length-1 ; i++) {
			frase[i]=frase[i+1];
		}
		
		frase[i]=primero;
		
	}

}
