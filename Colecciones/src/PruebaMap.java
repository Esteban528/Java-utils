import java.util.*;

public class PruebaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se crea la lista, esta se le espcifica que tipo de objeto será la key y que tipo de objeto será el valor
		HashMap<String, Empleado> personal= new HashMap<String, Empleado>();
		
		// EL metodo put es para agregar objetos
		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Pedo"));
		personal.put("147", new Empleado("Juana"));
		personal.put("148", new Empleado("Armonio"));
		
		System.out.println(personal);
		
		// El metodo remove solo hay que especificarle la key
		personal.remove("147");
		
		// Cuando se pone un put en la misma key lo que hace es reemplazar
		personal.put("148", new Empleado("Julio Balberde"));
		
		// Retornar una coleccion tipo set para una vista mas general
		System.out.println(personal.entrySet());
		
		// Extrae la lista de manera que se puede leer cada elemento e investigar el key y value
		for (Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			
			String clave=entrada.getKey();
			
			Empleado valor=entrada.getValue();
			
			System.out.println("Clave: "+clave+" valor: "+valor);
		}
	}

}

class Empleado {
	public Empleado (String n) {
		nombre = n;
		sueldo=2000;
	}
	
	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}



	private String nombre;
	private double sueldo;
}
