package sockets;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.*;
import java.net.*;
import java.util.ArrayList;

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
		
		addWindowListener (new EnvioOnline());
	}

}

class EnvioOnline extends WindowAdapter {
	
	@Override
	public void windowOpened(WindowEvent e) {
		try {
			Socket misocket = new Socket("10.0.0.60", 9999);
			
			PaqueteEnvio datos = new PaqueteEnvio();
			datos.setMensaje(" online");
			ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
			paquete_datos.writeObject(datos);
			misocket.close();
			
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}

class LaminaMarcoCliente extends JPanel implements Runnable{

	public LaminaMarcoCliente() {
		String nick_usuario = JOptionPane.showInputDialog("Nick: ");
		
		JLabel n_nick = new JLabel("Nick: ");
		add(n_nick);
		
		nick = new JLabel(nick_usuario);
		add(nick);

		JLabel texto = new JLabel(" - ON - ");
		
		add(texto);
		
		ip = new JComboBox();
		
		/*ip.addItem("Usuario 1");
		ip.addItem("Usuario 2");
		ip.addItem("Usuario 3");
		*/
		
		//ip.addItem("10.0.0.60");
		
		add(ip);
		
		campoChat = new JTextArea(12,20);
		
		add(campoChat);

		campo1 = new JTextField(20);

		add(campo1);

		miboton = new JButton("Enviar");

		EnviaTexto eventoEnviar = new EnviaTexto();
		miboton.addActionListener(eventoEnviar);

		add(miboton);
		
		// Creamos el hilo
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
				datos.setIp(ip.getSelectedItem().toString());
				datos.setMensaje(campo1.getText());
							
				ObjectOutputStream paquete_datos = new ObjectOutputStream(miSocket.getOutputStream());
				paquete_datos.writeObject(datos);
				miSocket.close();
				campoChat.append("\n"+campo1.getText());
				

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
				
				if(!paqueteRecibido.getMensaje().equals(" online")) {
					campoChat.append("\n"+paqueteRecibido.getNick() +": "+paqueteRecibido.getMensaje());
					
				} else {
					ip.removeAllItems();
					ArrayList <String> IpsMenu = new ArrayList<String>();
					IpsMenu=paqueteRecibido.getIps();
					
					for (String z : IpsMenu) {
						ip.addItem(z);
					}
				}
				
				
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private JTextField campo1;
	
	private JComboBox ip;
	
	private JLabel nick;
	
	private JTextArea campoChat;

	private JButton miboton;

}
// Objeto que se va a enviar (Debe estar serializado para poder usarlo)
class PaqueteEnvio implements Serializable{
	private String nick, ip, mensaje;
	private ArrayList <String> Ips;

	public ArrayList<String> getIps() {
		return Ips;
	}

	public void setIps(ArrayList<String> ips) {
		Ips = ips;
	}

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