package Ejercicio;
import java.util.Scanner;
public class Ejercicio607 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int a [] [] = new int [2] [4];
		int b [] [] = new int [2] [4];
		int c [] [] = new int [2] [4];
		
		System.out.println("Escriba la matriz a: ");
		
		for (int i=0; i<2 ;i++) {
			for(int k=0; k<4 ;k++) {
				a [i] [k] =  teclado.nextInt();
			}
		}
		
		System.out.println("Escriba la matriz b: ");
		
		for (int i=0; i<2 ;i++) {
			for(int k=0; k<4 ;k++) {
				b [i] [k] =  teclado.nextInt();
			}
		}
		
		for (int i=0; i<2 ;i++) {
			for(int k=0; k<4 ;k++) {
				c [i] [k] = a [i] [k] + b [i] [k] ;
			}
		}
		
		System.out.println("La matriz es: ");
		
		for (int i=0; i<2 ;i++) {
			for(int k=0; k<4 ;k++) {
				System.out.println(c [i] [k]+" ");
			}
		}
		
	}

}
