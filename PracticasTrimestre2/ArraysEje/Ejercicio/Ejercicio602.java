package Ejercicio;
import java.util.*;
public class Ejercicio602 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int a [] = new int [10];
		int m = 0; //El mayor
		int c = 0; //Contador
		int n = 0; //indicador
		
		for (int i=0; i<10; i++) {
			a[i]=teclado.nextInt();
		}
		
		for (int i=0; i<10; i++) {
			if(a[i] == m) {
				c++;
			}else {
				if(a[i]>m) {
					n = i;
					c=1;
					m=a[i];
				}
			}
			
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("Posicion "+i+" es "+a[i]);
		}
		
		System.out.println("El numero mayor es "+m);
		System.out.println("aparece en "+n);
		System.out.println("Se repite "+c);

	}

}
