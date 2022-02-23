package atletaa;
import java.util.Scanner;
public class Atleta {
	
	String atleta [] []= new String [5] [10];
	int indice = 0;
	
	
	public void añadir(String nombre, String dorsal, String n2009, String n2010, String n2011) {
		
		if(indice<10 && compararDorsal(dorsal)) { //Si es menor de diez y el comparar devielde true, crea
			atleta[0] [indice] = nombre;
			atleta[1] [indice] = dorsal;
			atleta[2] [indice] = n2009;
			atleta[3] [indice] = n2010;
			atleta[4] [indice] = n2011;
			this.indice++;
		}else {
			System.out.println("Error");
		}
	}
	
	public boolean compararDorsal(String dorsal) {
		boolean validar = true;	
		for(int i=0; i<indice; i++) {	//Compara todos los arrays
			if(atleta[1] [i]==dorsal) { //Compara el array con dorsal
				validar=false;
			}
		}
		return validar;
	}
	
	
		
		
	

	
}
