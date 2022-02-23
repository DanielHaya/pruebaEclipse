package EjercicioObjetosHerencia2;

public class Vivienda {
	
	protected TipoVivienda tipo;
	protected int numHabitaciones;
	protected double metrosCuadrados;
	protected double precio;
	protected String ciudad;
	protected String zona;
	
	//Constructores
	
	public Vivienda () {	
	}
	
	public Vivienda (TipoVivienda tipoVivienda,int numHabitaciones,double metrosCuadrados,double precio,String ciudad,String zona) {
		this.tipo=tipoVivienda;
		this.numHabitaciones=numHabitaciones;
		this.metrosCuadrados=metrosCuadrados;
		this.precio=precio;
		this.ciudad=ciudad;
		this.zona=zona;
	}
	
	//Metodos
	
	public double comision() {
		
		double n = (precio*3)/100;
		return n;
	}
	

	public String toString() {
		return "Vivienda [tipoVivienda=" + tipo + ", numHabitaciones=" + numHabitaciones + ", metrosCuadrados="
				+ metrosCuadrados + ", precio=" + precio + ", ciudad=" + ciudad + ", zona=" + zona;
	}
	
	
	//Set and Get


	public TipoVivienda getTipo() {
		return tipo;
	}

	public void setTipo(TipoVivienda tipoVivienda) {
		this.tipo = tipoVivienda;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	
	
}
