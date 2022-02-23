package EjercicioObjetosHerencia2;

public class Piso extends Vivienda {
	
	private double comunidad;
	private boolean exterior;
	
	public Piso (TipoVivienda tipo,int numHabitaciones,double metrosCuadrados,double precio,String ciudad,String zona,double comunidad,boolean exterior) {
		super(tipo,numHabitaciones,metrosCuadrados,precio,ciudad,zona);
		this.comunidad=comunidad;
		this.exterior=exterior;
	}
	
	public String toString() {
		return super.toString()+" comunidad="+comunidad+" exterior="+exterior+"]";
	}

}
