import java.util.HashSet;
import java.util.*;


public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cl1 = new Cliente("Marlon", "0001", 20000);
		Cliente cl2 = new Cliente("Esteban", "0002", 250000);
		Cliente cl3 = new Cliente("Penelope", "0003", 500000);
		Cliente cl4 = new Cliente("Julio Jaramillo", "0004", 900000);
		
		Set<Cliente> clientesBanco = new HashSet<Cliente>(); // Interfaz HashSet
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		
		
		
		//Iterador -- El iterador es mejor cuando hay que remover un objeto de la colección
		Iterator<Cliente> it = clientesBanco.iterator();
		
		while(it.hasNext()) {
			Cliente obj = it.next();
			System.out.println(obj);
			if(obj.getNombre().equals("Penelope")) {
				System.out.print(" Removido\n");
				it.remove();
			}
			
		}
		// ForEach
		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente);
		}
		
	}

}
  