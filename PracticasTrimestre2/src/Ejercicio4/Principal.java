package Ejercicio4;

public class Principal {

	public static void main(String[] args) {
		
		Trabajador Manolo = new Trabajador("Manolo","Encargado","Avenida Corrida","666666666","123456");
		Empleado Juan = new Empleado("Juan","obrero","Camino de la Barniella","985666666","123456",1800);
		Consultor Ramona = new Consultor("Ramona","Autonoma","Debajo del puente","321987456","98453",21,10);
		
		System.out.println(Manolo.equals(Juan));
		
		System.out.println(Juan.calcularPaga());
		System.out.println(Ramona.calcularPaga());

		System.out.println(Juan);
		System.out.println(Ramona);
	}

}
