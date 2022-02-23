package Ejercicio;
import java.util.*;
public class Ejercicio603 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int original [] = new int [10];
		int transpuesto [] = new int [10];
		int rotado [] = new int [10];
		
		for (int i=0; i<10; i++) {	//Original
			original[i] = teclado.nextInt();
		}
		
		for (int i=0; i<10; i++) {	//Transpuesto
			transpuesto[i] = original [9-i];
		}
		
		for (int i=0; i<10; i++) {	//Rotado
			if (i==0) {
				rotado[0]=10;
			}else {
				rotado[i]=original[i-1];
			}
		}
		
		System.out.print("Original: ");
		for (int i=0; i<10; i++) {
			System.out.print(original[i]+" ");	
		}
		System.out.println();
		System.out.print("Transpuesto ");
		for (int i=0; i<10; i++) {
			System.out.print(transpuesto[i]+" ");
			
		}
		System.out.println();
		System.out.print("Rotado ");
		for (int i=0; i<10; i++) {
			System.out.print(rotado[i]+" ");
			
		}
		
	}

}
