package Streams;
import java.io.*;

public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_Fichero leyendo = new Leer_Fichero();
		leyendo.lee();
		
		Escribir_Fichero escribiendo = new Escribir_Fichero();
		escribiendo.escribir();
	}

}

class Leer_Fichero {
	public void lee (){
		try {
			FileReader entrada = new FileReader("/home/esteban/Projects/test.txt");
			
			BufferedReader miBuffer=new BufferedReader(entrada);
			
			String linea = "";
			
			while (linea!= null) {
				linea = miBuffer.readLine();
				
				if (linea == null) break;
				System.out.println(linea);
			}
			entrada.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

class Escribir_Fichero {
	public void escribir () {
		String frase = "Esto es una prueba de escritura";
		
		try {
			FileWriter escritura = new FileWriter("/home/esteban/Projects/texto_nuevo.txt");
			
			for (int i=0; i<frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}