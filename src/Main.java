import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente("Carlos", "Rodriguez",45));
		clientes.add(new Cliente("Pedro", "Fernandez",33));
		
		Integer sumaEdades = 0;
		
		// Esto nos muestra los clientes
		for(Cliente c : clientes) {
			System.out.println(c.toString());
			sumaEdades += c.getEdad();
			System.out.println("Hola, " + c.getNombre() + "!");

		}
		System.out.println("La suma de las edades: " + sumaEdades);

	}

}
