package antesDeExamen;
import java.util.*;
public class E1 {
	static Scanner tcl = new Scanner(System.in);
	static int indice = 0;
	
	public static void main(String[] args) {
		
		int num [] = new int [10];
		
		System.out.println("Escriba los 8 numeros");
		
		escribir1(num);
		
		for (int i=0 ; i<2 ; i++) {
			System.out.println("Escriba la posicion ");
			int p = tcl.nextInt();
			System.out.println("Escriba el numero ");
			int n = tcl.nextInt();
			escribir2(num, p, n);
			indice++;
		}
		System.out.println();
		for (int i=0 ; i<10 ; i++) {
			System.out.print(num[i]+"  ");
			
		}
		System.out.println();
		
	}
	
	public static void escribir1 (int num []) {
		for (int i=0 ; i<8 ; i++) {
			num [i] = tcl.nextInt();
			indice++;
		}
		for (int i=0 ; i<8 ; i++) {
			System.out.print(num[i]+"  ");
		}
		System.out.println();
	}
	
	public static void escribir2 (int num [], int p, int n) {

		int movido [] = new int [10];
		
		for(int j=0 ; j<(p-1) ; j++) {
			movido[j]=num[j];
		}
		
		movido[p-1]=n;
		
		for(int i=p-1,l=p ; i<indice ; i++,l++) {
			movido[l]=num[i];
		}
		
		for(int j=(p-1) ; j<indice+1 ; j++) {
			num[j]=movido[j];
		}
		
	}
}
