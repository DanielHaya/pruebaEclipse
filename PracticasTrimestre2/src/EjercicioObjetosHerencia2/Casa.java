package EjercicioObjetosHerencia2;

public class Casa extends Vivienda {
	
	private double parcela;
	private boolean piscina;
	
	public Casa (TipoVivienda tipo,int numHabitaciones,double metrosCuadrados,double precio,String ciudad,String zona,double parcela,boolean piscina) {
		super(tipo,numHabitaciones,metrosCuadrados,precio,ciudad,zona);
		this.parcela=parcela;
		this.piscina=piscina;
	}
	
	public String toString() {
		return super.toString()+" parcela="+parcela+" piscina="+piscina+"]";
	}
	
	
	
}
