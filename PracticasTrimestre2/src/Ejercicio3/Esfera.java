package Ejercicio3;
import java.math.*;
public class Esfera extends Cuerpo {
	
	private float radio;
	
	public Esfera(float radio, Color color) {
		super(color);
		this.radio=radio;
	}

	@Override
	public void calcularSuperficie() {
		super.superficie = (float) (4 * Math.PI * Math.pow (radio,2));
	}

	@Override
	public void calcularVolumen() {
		super.volumen = (float) ((4/3)*Math.PI*Math.pow(radio,3));
	}

	@Override
	public String toString() {
		return super.toString() +" radio=" + radio + "]";
	}

	
	
}
