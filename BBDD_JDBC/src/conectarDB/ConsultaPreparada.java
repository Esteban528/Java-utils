package conectarDB;

import java.sql.*;

public class ConsultaPreparada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Crear conexion
			Connection conexion = DriverManager.getConnection("jdbc:mysql://10.0.0.55:3306/javaTest?useSSL=false", "admin", "esteban123");
			
			// Prepara consulta
			
			String sql = "SELECT id, nombre, precio, pais FROM productos WHERE nombre=? AND pais=?";
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//Establecer parámetros
			
			sentencia.setString(1, "Leche de pulga");
			sentencia.setString(2, "Canadá");
			
			//EJECUTAR consulta
			
			ResultSet resultado = sentencia.executeQuery();
			
			while(resultado.next()) {
				System.out.println(resultado.getString(1)+"|"+resultado.getString(2)+"|"+resultado.getString(3)+"|"+resultado.getString(4));
			}
			
			resultado.close();
		
			System.out.println("-----------------------------------------------------------------");
			// 
			// Reutilizar consulta
			//	
			
			
			//Establecer parámetros
			sentencia.setString(1, "Riñones");
			sentencia.setString(2, "Colombia");
			
			//EJECUTAR consulta
			
			resultado = sentencia.executeQuery();
			
			while(resultado.next()) {
				System.out.println(resultado.getString(1)+"|"+resultado.getString(2)+"|"+resultado.getString(3)+"|"+resultado.getString(4));
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
