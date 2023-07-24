package Ventanas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class CuadrosDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto ventana = new MarcoTexto();

	}

}

class MarcoTexto extends JFrame {
	public MarcoTexto() {
		
		setVisible(true);
		setTitle("Prueba marcos de texto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		LaminaTexto miLamina = new LaminaTexto();
		add(miLamina);

		setBounds(600, 200, 600, 400);
	}
}

class LaminaTexto extends JPanel {
	private JTextField campo1;
	private JLabel mensaje;
	
	public LaminaTexto() {
	//setBounds(0,100,600,400);
		JLabel texto1 = new JLabel("Mail:");
		mensaje = new JLabel("Porfavor inserte un email válido al cual se le enviará el correo", JLabel.CENTER);
		campo1 = new JTextField(20);
		
		add(texto1);
		add(campo1);
		
		JButton boton = new JButton("Print");

		Action evento = new DameTexto();

		boton.addActionListener(evento);
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "imprimir");
		getActionMap().put("imprimir", evento);
		
		add(boton);
		add(mensaje);
	}

	class DameTexto extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int correcto = 0;
			
			String email = campo1.getText().trim();
			
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					correcto++;
				}
			}
			
			if (correcto == 1) {
				mensaje.setText("El Email parece estar correcto");
			} else {
				mensaje.setText("Porfavor compruebe el email");
			}
			
			System.out.println(campo1.getText().trim());
		}
		
	}
}
