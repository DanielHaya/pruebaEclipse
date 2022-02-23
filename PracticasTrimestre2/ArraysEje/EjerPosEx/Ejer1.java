package EjerPosEx;
import java.util.Scanner;
public class Ejer1 {

	public static void main (String[]args) {
		
		Scanner teclado = new Scanner (System.in);
		
		char palabra [];
		String palabraEntera;
		int indice=0;
		
		palabraEntera = teclado.nextLine();
		
		palabra = palabraEntera.toCharArray();
		
		
		for(int Elements : palabra)
            indice++;
		
		
		System.out.println("Su longitud es de "+indice);
		System.out.println("La septima palabra es "+palabra[6]);
		mayusculas(palabra, indice);
		
	}
	
	public static void mayusculas(char palabra [], int indice) {
		
		for(int i=0; i<indice; i++) {
			palabra[i] = palabra.toUpperCase()[i];
		}
	}
}
