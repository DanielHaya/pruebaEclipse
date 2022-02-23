package Ejercicio;

public class Ejercicio613 {

	public static void main(String[] args) {
		
		int num []=new int [25];
		int orden [] =new int [25];
		
		for(int i=0;i<25;i++) {
			num[i]=(int)(Math.random()*25-1);
		}
		
		ordenar(num, orden);
		
		for(int i=0;i<25;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		for(int i=0;i<25;i++) {
			System.out.print(orden[i]+" ");
		}
		
	}

	public static void ordenar(int num [], int orden[]) {
		int max = 0;
		int indice=-1;
		for(int i=0;i<25;i++) {
			if(i>0) {	//Sabe si es la posicion cero o mayor
				for(int a=0;a<25;a++) {	//Compara todas las posiciones
					
					if(num[a] > max && num[a] < orden[indice]) { 	//compara con el numero mayor y el anterior
						max=num[a];
					}
				}
				
			}else {
				
				for(int a=0;a<25;a++) {	//Compara todas las posiciones
					if(num[a]>max) {	//si el numero es mayor lo sustituye
						max=num[a];
					}
				}
				
			}
			indice++;
			orden[i]=max; //Pone el valor maximo en la posicion
			max=0;
		}
	}
	
}
