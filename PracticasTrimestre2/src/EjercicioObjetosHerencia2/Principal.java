package EjercicioObjetosHerencia2;

public class Principal {

	public static void main(String[] args) {
		
		Piso v1 = new Piso (TipoVivienda.dúplex,4,7.8,20000,"Gijon","Arena",5.7,false);
		Casa v2 = new Casa (TipoVivienda.chalet,6,20.5,25000,"Gijon","Granda",6.3,false);
		
		System.out.println(v1);
		System.out.println(v2);

	}

}
