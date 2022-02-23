package Ejercicio4;

public class Trabajador {
	
	protected String nombre;
	protected String puesto;
	protected String direccion;
	protected String telefono;
	protected String NSS;
	
	
	public Trabajador(String nombre, String puesto, String direccion, String telefono, String nSS) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.NSS = nSS;
	}

	public boolean equals(Object Trabajador) {
		return this.NSS == ((Trabajador)Trabajador).NSS;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", direccion=" + direccion + ", telefono="
				+ telefono + ", NSS=" + NSS + "]";
	}
	
	
	
	
}
