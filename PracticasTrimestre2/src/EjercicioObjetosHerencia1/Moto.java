package EjercicioObjetosHerencia1;

public class Moto extends Vehículo {
	private int numPlazas;
	
	public Moto(String matricula, String color, int numeroRuedas, int cilindrada, int potencia,int numPlazas) {
		super(matricula,color,numeroRuedas,cilindrada,potencia);
		this.numPlazas=numPlazas;
	}
	
	public String toString() {
		return "moto "+super.toString()+" numeroDePlazas="+numPlazas;
	}
	
	
}
