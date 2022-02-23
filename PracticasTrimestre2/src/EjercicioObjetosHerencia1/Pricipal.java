package EjercicioObjetosHerencia1;

public class Pricipal {
	public static void main (String[] args) {
		
		Coche mercedes = new Coche("5643hjg","rojo",4,500,120,3);
		Moto motillo = new Moto("3456kgb","negra",2,500,70,2);
		
		System.out.println(mercedes);
		System.out.println(motillo);
	}
}
