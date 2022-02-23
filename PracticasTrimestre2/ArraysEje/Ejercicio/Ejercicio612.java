package Ejercicio;
import java.util.*;
public class Ejercicio612 {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num [] = new int [10];
		
		System.out.println("Introduzca los numero en el array ");
		
		for(int i=0 ; i<10 ; i++) {
			num[i]=teclado.nextInt();
		}
		
		System.out.println("Escriba el numero deseado ");
		
		int busca=teclado.nextInt();
		boolean cr = false;
		int z = 0;
		
		for(int i=0 ; i<10 ; i++) {
			if(busca==num[i]) {
				cr=true;
				z = i;
			}
		}
		
		if(cr) {
			System.out.println("La posicion del valor es "+z);
		}else {
			System.out.println("a");
		}
		
	}
}
