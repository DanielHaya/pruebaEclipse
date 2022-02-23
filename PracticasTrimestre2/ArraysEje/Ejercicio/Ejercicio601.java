package Ejercicio;
import java.util.Scanner;

public class Ejercicio601 {
	public static void main (String[]args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] n = new int [10];
		int sp = 0;
		int p = 0;
		int mp = 0;
		
		int sim = 0;
		int im = 0;
		int mim = 0;
		
		for (int i = 0; i < 10 ; i++) {
			n [i] =teclado.nextInt();
			if(n[i]%2==0) {
				sp += n[i];
				p++;
			}else {
				sim += n[i];
				im++;
			}	
		}
		mp = sp/p;
		mim = sim/im;
		System.out.println("Pares: "+mp);
		System.out.println("Impares: "+mim);
		
	}
}
