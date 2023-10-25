package conectarDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Crear conexion
			Connection conexion = DriverManager.getConnection("jdbc:mysql://10.0.0.55:3306/javaTest?useSSL=false", "admin", "esteban123");
			
			// Crear objeto STATEMENT
			
			Statement statement = conexion.createStatement();
			
			// Crear query SQL
			
			String query = "UPDATE productos SET precio=400+precio WHERE nombre='Pescueso de pato'";
			
			// Ejecutar SQL
			
			statement.executeUpdate(query);
			
			System.out.println("Datos actualizados");
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
