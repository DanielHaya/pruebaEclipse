package Ejercicio;
import java.util.Scanner;
public class Ejercicio605 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int nDni = teclado.nextInt();
		
		int rDni = nDni/23;
		
		rDni *= 23;
		
		rDni = nDni-rDni;
		
		char letra = calcularLetra(rDni);
		
		
		
		System.out.print(nDni);
		System.out.println(letra);
	}
	
	public static char calcularLetra(int rDni){
		
		char letra [] = new char [] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		return letra[rDni];
	}
	
}
