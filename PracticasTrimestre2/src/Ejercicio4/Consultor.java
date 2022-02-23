package Ejercicio4;

public class Consultor extends Trabajador {
	
	private int horas;
	private float tarifa;
	
	public Consultor(String nombre, String puesto, String direccion, String telefono, String nSS, int horas,
			float tarifa) {
		super(nombre, puesto, direccion, telefono, nSS);
		this.horas = horas;
		this.tarifa = tarifa;
	}
	
	public float calcularPaga() {
		return horas*tarifa;
	}

	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + ", nombre=" + nombre + ", puesto=" + puesto
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", NSS=" + NSS + "]";
	}
	
	
	
	
}
