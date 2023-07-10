package Ventanas;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Password {
	public static void main(String[] args) {
		new VentanaApp();
	}
}

class VentanaApp extends JFrame {
	public VentanaApp () {
		setBounds(400,300, 550, 400);
		
		LaminaPass lamina = new LaminaPass();
		add(lamina);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Panel login");
	}
}

class LaminaPass extends JPanel {
	private JTextField usuario;
	JPasswordField password;
	
	public LaminaPass () {
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior = new JPanel();
		
		laminaSuperior.setLayout(new GridLayout(2,2));
		
		add(laminaSuperior, BorderLayout.NORTH);
		JLabel etiqueta1 = new JLabel("Usuario:");
		JLabel etiqueda2 = new JLabel("Contraseña");
		
		usuario = new JTextField(15);
		password = new JPasswordField(15);
		
		password.getDocument().addDocumentListener(new CompruebaPassword());
		
		laminaSuperior.add(etiqueta1);
		laminaSuperior.add(usuario);
		laminaSuperior.add(etiqueda2);
		laminaSuperior.add(password);
		
		JButton enviar = new JButton("Enviar");
		
		add(enviar, BorderLayout.SOUTH);

	}
	
	private class CompruebaPassword implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] passwordArray;
			passwordArray = password.getPassword();
			
			if (passwordArray.length < 8 || passwordArray.length > 15) {
				password.setBackground(Color.RED);
			} else {
				password.setBackground(Color.GREEN);
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] passwordArray;
			passwordArray = password.getPassword();
			
			
			
			if (passwordArray.length < 1) {
				password.setBackground(Color.WHITE);
			}else if (passwordArray.length < 8 || passwordArray.length > 15) {
				password.setBackground(Color.RED);
			} 
			else {
				password.setBackground(Color.GREEN);
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}




