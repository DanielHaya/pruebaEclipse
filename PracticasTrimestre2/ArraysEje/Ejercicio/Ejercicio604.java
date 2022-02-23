package Ejercicio;
import java.util.Scanner;
public class Ejercicio604 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int nota [] = new int [30];
		int aprobados = 0, suspensos = 0;
		int media = 0;
		
		for (int i=0 ; i<30 ; i++) {
			do {
				
				nota[i]=teclado.nextInt();
				
				if (nota[i] <= 10 && nota[i] >= 0) {
					System.out.println("numero valido");
					if(nota[i]>=5) {
						aprobados++;
					}else {
						suspensos++;
					}
				}else{
					System.out.println("numero no valido");	
				}
				
			}while (nota[i]>10 && nota[i]<0); 
		}
		
		for (int i=0 ; i<30 ; i++) {
			media += nota[i];
		}
		
		System.out.println("La media es: "+media/30);
		System.out.println("Aprobados: "+aprobados);
		System.out.println("Suspensos: "+suspensos);
		
		for (int n=0; n<=10; n++) {
			int cont = 0;
			for (int i=0 ; i<30 ; i++) {
				if(nota[i] == n) {
					cont++;
				}
			}
			System.out.println("La nota "+n+" a salido "+cont+" veces");
		}
		
	}
}
