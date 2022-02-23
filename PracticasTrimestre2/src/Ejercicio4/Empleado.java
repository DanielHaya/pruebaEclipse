package Ejercicio4;

public class Empleado extends Trabajador {
	
	private float sueldo;
	private float impuesto;

	public Empleado(String nombre, String puesto, String direccion, String telefono, String nSS, float sueldo) {
		super(nombre, puesto, direccion, telefono, nSS);
		this.sueldo=sueldo;
		this.impuesto=sueldo*19/100;
	}
	
	public float calcularPaga() {
		return (sueldo-impuesto)/14;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuesto=" + impuesto + ", nombre=" + nombre + ", puesto=" + puesto
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", NSS=" + NSS + "]";
	}
	
	
	
	
}
