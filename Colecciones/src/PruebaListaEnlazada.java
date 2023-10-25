import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {
	public static void main(String[] args) {
		LinkedList<String> paises = new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		
		LinkedList<String> capitales = new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("CDMX");
		capitales.add("Lima");
		
		//System.out.println(paises);
		//System.out.println(capitales);
		
		ListIterator<String> iterA = paises.listIterator();
		ListIterator<String> iterB = capitales.listIterator();
		
		while(iterB.hasNext() || iterA.hasNext()) {
			iterA.next();
			iterA.add(iterB.next());
		}
		
		System.out.println(paises);
		
		iterB = capitales.listIterator();
		
		while(iterB.hasNext()) {
			iterB.next();
			if (iterB.hasNext()) {
				iterB.next();
				iterB.remove();
			}
		}
		
		System.out.println(capitales);
		paises.removeAll(capitales);
		System.out.println(paises);
	}
}
