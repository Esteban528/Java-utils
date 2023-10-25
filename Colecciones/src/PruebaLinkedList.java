import java.util.*;

public class PruebaLinkedList {
	public static void main(String[] args) {
		LinkedList <String> personas = new LinkedList<String>();
		
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Armando");
		personas.add("Laura");
		personas.add("Valentina");
				
		System.out.println(personas.size());
		
		ListIterator<String>it=personas.listIterator();
				
		it.next(); // Posicion 1 de la lista
		
		it.add("Julio");
		
		for (String string : personas) {
			System.out.println(string); 
		}
	}
}
