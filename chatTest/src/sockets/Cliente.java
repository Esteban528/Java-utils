package sockets;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.*;
import java.net.*;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCliente mimarco = new MarcoCliente();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCliente extends JFrame {

	public MarcoCliente() {

		setBounds(600, 300, 280, 350);

		LaminaMarcoCliente milamina = new LaminaMarcoCliente();

		add(milamina);

		setVisible(true);
	}

}

class LaminaMarcoCliente extends JPanel implements Runnable{

	public LaminaMarcoCliente() {
		
		nick = new JTextField(5);
		add(nick);

		JLabel texto = new JLabel("------ CHAT ------");
		add(texto);
		
		ip = new JTextField(7);
		add(ip);
		
		campoChat = new JTextArea(12,20);
		
		add(campoChat);

		campo1 = new JTextField(20);

		add(campo1);

		miboton = new JButton("Enviar");

		EnviaTexto eventoEnviar = new EnviaTexto();
		miboton.addActionListener(eventoEnviar);

		add(miboton);
		
		Thread miHilo = new Thread(this);
		miHilo.start();

	}
	// Creamos una clase privada que se activara con el evento
	private class EnviaTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				// Inicializamos un objeto socket
				Socket miSocket = new Socket("10.0.0.60", 9999);
				
				PaqueteEnvio datos = new PaqueteEnvio();
				
				datos.setNick(nick.getText());
				datos.setIp(ip.getText());
				datos.setMensaje(campo1.getText());
				
				ObjectOutputStream paquete_datos = new ObjectOutputStream(miSocket.getOutputStream());
				paquete_datos.writeObject(datos);
				miSocket.close();
				

			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
		}

	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ServerSocket servidor_cliente = new ServerSocket(9090);
			Socket cliente;
			PaqueteEnvio paqueteRecibido;
			
			while(true) {
				cliente=servidor_cliente.accept();
				ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());
				paqueteRecibido=(PaqueteEnvio) flujoEntrada.readObject();
				
				campoChat.append("\n"+paqueteRecibido.getNick() +": "+paqueteRecibido.getMensaje());
				
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private JTextField campo1, nick, ip;
	
	private JTextArea campoChat;

	private JButton miboton;

}
// Objeto que se va a enviar (Debe estar serializado para poder usarlo)
class PaqueteEnvio implements Serializable{
	private String nick, ip, mensaje;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}