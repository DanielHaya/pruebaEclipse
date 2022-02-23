package Ejercicio3;

public abstract class Cuerpo {
	
	protected float superficie;
	protected float volumen;
	protected Color color;
	
	
	
	public Cuerpo(Color color) {
		this.color = color;
	}

	public Cuerpo(float superficie, float volumen, Color color) {
		this.superficie = superficie;
		this.volumen = volumen;
		this.color = color;
	}

	public abstract void calcularSuperficie ();
	
	public abstract void calcularVolumen ();

	@Override
	public String toString() {
		return "Cuerpo [superficie=" + superficie + ", volumen=" + volumen + ", color=" + color;
	}
	
	
	
}
