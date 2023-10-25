


import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
			
	}	
}

class MarcoServidor extends JFrame implements Runnable {
	
	public MarcoServidor(){
		
			setBounds(1200,300,280,350);				
				
			JPanel milamina= new JPanel();
			
			milamina.setLayout(new BorderLayout());
			
			areatexto=new JTextArea();
			
			milamina.add(areatexto,BorderLayout.CENTER);
			
			add(milamina);
			
			setVisible(true);
			
			// Creamos un hilo para mantener esta tarea en segundo plano
			Thread miHilo = new Thread(this);
			miHilo.start();
		
		}
	
	private	JTextArea areatexto;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			// Creamos un socket del servidor
			ServerSocket servidor = new ServerSocket(9871); 
			
			while(true) { // Bucle infinito para mantenerlo andando
				// Inicializamos el socket con la conexion aceptada
				Socket miSocket = servidor.accept();
				// Creamos un stream de entrada de datos
				DataInputStream flujo_entrada = new DataInputStream(miSocket.getInputStream());
				// Leemos el stream que llega por el cliente
				String mensaje_texto = flujo_entrada.readUTF();
				
				System.out.println(mensaje_texto);
				
				areatexto.append("\n" + mensaje_texto); 
				
				miSocket.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
