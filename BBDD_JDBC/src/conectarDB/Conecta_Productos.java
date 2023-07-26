package conectarDB;
import java.sql.*;


//DriverManager class
public class Conecta_Productos {
	public static void main(String[] args) {
		try {
			// Crear conexion
			Connection conexion = DriverManager.getConnection("jdbc:mysql://10.0.0.55:3306/javaTest", "admin", "esteban123");
			
			// Crear objeto STATEMENT
			
			Statement statement = conexion.createStatement();
			
			// Crear query SQL
			
			String query = "SELECT * FROM productos";
			
			// Ejecutar SQL
			
			ResultSet resultset = statement.executeQuery(query);
			
			// Leer el ResultSet
			
			while (resultset.next()) {
				System.out.println(resultset.getString("nombre") +" "+ resultset.getString("precio")+" "+resultset.getString("pais"));
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
