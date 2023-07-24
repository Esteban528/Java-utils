package sockets;

import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoServidor mimarco = new MarcoServidor();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoServidor extends JFrame implements Runnable {

	public MarcoServidor() {

		setBounds(1200, 300, 280, 350);

		JPanel milamina = new JPanel();

		milamina.setLayout(new BorderLayout());

		areatexto = new JTextArea();

		milamina.add(areatexto, BorderLayout.CENTER);

		add(milamina);

		setVisible(true);

		// Creamos un hilo para mantener esta tarea en segundo plano
		Thread miHilo = new Thread(this);
		miHilo.start();

	}

	private JTextArea areatexto;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			// Creamos un socket del servidor
			ServerSocket servidor = new ServerSocket(9999);

			String nick, ip, mensaje;

			PaqueteEnvio paquete_recibido;
			
			ArrayList<String> listaIp = new ArrayList<String>();
					

			while (true) { // Bucle infinito para mantenerlo andando
				// Inicializamos el socket con la conexion aceptada
				Socket miSocket = servidor.accept();
					
				ObjectInputStream paquete_datos = new ObjectInputStream(miSocket.getInputStream());
				paquete_recibido = (PaqueteEnvio) paquete_datos.readObject();

				nick = paquete_recibido.getNick();
				ip = paquete_recibido.getIp();
				mensaje = paquete_recibido.getMensaje();
				
				if (!mensaje.equals(" online")) {

					areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);

					Socket enviaDestinatario = new Socket(ip, 9090);

					ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
					paqueteReenvio.writeObject(paquete_recibido);

					// Cerrar Streams y sockets
					paqueteReenvio.close();

					enviaDestinatario.close();

					miSocket.close();
				} else {
					// DETECTA ONLINE --
					InetAddress localizacion = miSocket.getInetAddress();

					String ipRemota = localizacion.getHostAddress();

					System.out.println("Online " + ipRemota);
					
					listaIp.add(ipRemota);
					
					paquete_recibido.setIps(listaIp);
					
					for (String string : listaIp) {
						
						System.out.println("Ips: "+string);
						
						Socket enviaDestinatario = new Socket(ip, 9090);

						ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
						paqueteReenvio.writeObject(paquete_recibido);

						// Cerrar Streams y sockets
						paqueteReenvio.close();

						enviaDestinatario.close();

						miSocket.close();
						
					}

					// --
				}
			}

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
