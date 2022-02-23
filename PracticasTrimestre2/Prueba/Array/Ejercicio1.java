package Array;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int n [] = new int [10];
		int imp = 0;
		int par = 0;
		
		
		for (int i = 0; i < 10 ; i++) {
			n [i] = teclado.nextInt();
			if(n[i] % 2 == 0) {
				par++;
			}else {
				imp++;
			}
		}
		
		System.out.println("numeros pares: " + par);
		System.out.println("numeros impares: " + imp);
	}
	
}
