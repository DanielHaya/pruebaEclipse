package atletaa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int opcion=0;
		Atleta atletas = new Atleta();
		
		mostrarMenu();
		
		do {
			Scanner teclado = new Scanner (System.in);
			opcion = teclado.nextInt();
			
			switch (opcion) {
				case 1:
					
					aņadirAtleta(atletas);
					
					break;
				case 2:
					
					
					break;
				case 3:
					
					
					break;
				case 4:
					
					
					break;
			}
			
		}while (opcion !=4);

	}
	
	public static void aņadirAtleta(Atleta atletas) {
		atletas.aņadir(null, null, null, null, null);
	}
	
	public static void mostrarMenu() {
		
	}
	

}
