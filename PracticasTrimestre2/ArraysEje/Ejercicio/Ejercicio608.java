package Ejercicio;
import java.util.Scanner;

public class Ejercicio608 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int a [] [] = new int [5] [5];
		int sCol = 0, sFi = 0;
		
		
		for (int i=0; i<5 ;i++) {
			for(int k=0; k<5 ;k++) {
				a [i] [k] =  (int)(Math.random()*10000)%101-50;
			}
		}
		
		System.out.println();
		
		for (int i=0; i<5 ;i++) {
			sFi = 0;
			for(int k=0; k<5 ;k++) {
				sFi += a [i] [k];
			}
			System.out.println("La fila "+(1+i)+" suma un total de "+sFi);
		}
		
		System.out.println();
		
		for (int k=0; k<5 ;k++) {
			sFi = 0;
			for(int i=0; i<5 ;i++) {
				sFi += a [i] [k];
			}
			System.out.println("La columna "+(k+1)+" suma un total de "+sFi);
		}
		
		System.out.println();
		
		for (int i=0; i<5 ;i++) {
			for(int k=0; k<5 ;k++) {
				System.out.print(a [i] [k]+"  ");
			}
			System.out.println();
		}
		

	}

}
