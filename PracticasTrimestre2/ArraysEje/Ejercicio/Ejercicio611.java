package Ejercicio;
import java.util.*;
public class Ejercicio611 {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int c = 10;
		
		int num [] = new int [c];
		
		System.out.println("Introduzca los numero en el array ");
		
		for(int i=0 ; i<c ; i++) {
			num[i]=teclado.nextInt();
		}
		
		System.out.println("Escriba la posicion deseada ");
		
		System.out.println("El numero del array es "+num[teclado.nextInt()-1]);
		
		
		
	}
	
	
}
