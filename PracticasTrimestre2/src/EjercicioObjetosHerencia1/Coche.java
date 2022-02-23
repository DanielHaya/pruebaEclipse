package EjercicioObjetosHerencia1;

public class Coche extends Vehículo {
	
	private int numeroDePuertas;


	public Coche(String matricula, String color, int numeroRuedas, int cilindrada, int potencia, int numeroDePuertas) {
		super(matricula, color, numeroRuedas, cilindrada, potencia);
		this.numeroDePuertas=numeroDePuertas;
		// TODO Auto-generated constructor stub
	}

	
	
	public String toString() {
		return "coche "+super.toString()+" numero de puertas: "+numeroDePuertas;
	}


	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}
	
	
	
}
