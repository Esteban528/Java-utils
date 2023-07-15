

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.*;
import java.net.*;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente(){
	
		JLabel texto=new JLabel("CLIENTE");
		
		add(texto);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto eventoEnviar = new EnviaTexto();
		miboton.addActionListener(eventoEnviar);
		
		add(miboton);	
		
	}
	
	private class EnviaTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				Socket miSocket = new Socket("10.0.0.60", 9871);
				
				DataOutputStream flujo_salida = new DataOutputStream (miSocket.getOutputStream());
				
				flujo_salida.writeUTF(campo1.getText());
				
				flujo_salida.close();
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
		}
		
	}
	
	private JTextField campo1;
	
	private JButton miboton;
	
}