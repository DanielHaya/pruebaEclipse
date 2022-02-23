package EjercicioObjetosHerencia1;

public class Vehículo {
	
	protected String matricula;
	protected String color;
	protected int numeroRuedas;
	protected int cilindrada;
	protected int potencia;
	
	//constructores
	
	public Vehículo(String matricula, String color, int numeroRuedas, int cilindrada, int potencia) {
		this.matricula = matricula;
		this.color = color;
		this.numeroRuedas=numeroRuedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}

	public Vehículo() {
		
	}
	
	//metodos
	
	public String toString() {
		return "Matricula=" + matricula + ", color=" + color + ", numeroRuedas=" + numeroRuedas
				+ ", cilindrada=" + cilindrada + ", potencia=" + potencia;
	}

	//Set and Get
	
	public String getMatricula() {
		return matricula;
	}

	

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	
}
