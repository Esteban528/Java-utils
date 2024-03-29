import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet<String> ordenaPersonas = new TreeSet<String>();
		
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		for (String string : ordenaPersonas) {
			System.out.println(string);
		}*/
		
		Articulo primero = new Articulo(1, "Primer articulo");
		Articulo segundo = new Articulo(2, "segundo articulo");
		Articulo tercero = new Articulo(3, "Este es el tercer articulo");
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		ordenaArticulos.add(primero);
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(segundo);
		
		for (Articulo articulo : ordenaArticulos) {
			System.out.println("# "+articulo.getDescripcion());
		}
		
		Articulo comparadorArticulos = new Articulo();
		TreeSet<Articulo> ordenAlfabetico = new TreeSet<Articulo>(comparadorArticulos);
		
		ordenAlfabetico.add(primero);
		ordenAlfabetico.add(tercero);
		ordenAlfabetico.add(segundo);
		
		for (Articulo articulo : ordenAlfabetico) {
			System.out.println(articulo.getDescripcion());
		}
	}

	
}

class Articulo implements Comparable<Articulo>, Comparator<Articulo> {
	private int numero_articulo;
	private String descripcion;
	
	public Articulo () {}
	
	public Articulo (int num, String desc) {
		numero_articulo=num;
		descripcion=desc;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int compareTo(Articulo o) { // Esto ordena los articulos por su propiedad "numero_articulo"
		// TODO Auto-generated method stub
		return numero_articulo - o.numero_articulo;
	}
	public int getNumero_articulo() {
		return numero_articulo;
	}

	public void setNumero_articulo(int numero_articulo) {
		this.numero_articulo = numero_articulo;
	}

	@Override
	public String toString() {
		return "Articulo [numero_articulo=" + numero_articulo + ", descripcion=" + descripcion + "]";
	}
		
	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descripcionA=o1.getDescripcion();
		String descripcionB=o2.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
	}
}