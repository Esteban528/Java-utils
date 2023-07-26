package conectarDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Crear conexion
			Connection conexion = DriverManager.getConnection("jdbc:mysql://10.0.0.55:3306/javaTest?useSSL=false", "admin", "esteban123");
			
			// Crear objeto STATEMENT
			
			Statement statement = conexion.createStatement();
			
			// Crear query SQL
			
			String query = "DELETE FROM productos WHERE nombre='Pescueso de pato'";
			
			// Ejecutar SQL
			
			statement.executeUpdate(query);
			
			System.out.println("Datos borrados");
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
