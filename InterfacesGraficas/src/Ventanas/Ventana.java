package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Ventana {
	public static void main(String[] args) {
		Frame ventana = new Frame();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Frame extends JFrame {
	public Frame () {
		setTitle("Prueba varios");
		setBounds(1300, 100, 300, 200);
		setVisible(true);
		
		Panel lamina = new Panel();
		
		add(lamina);
	}
}

class Panel extends JPanel {
	JButton boton_cerrar;
	
	public Panel () {
		JButton boton_nuevo = new JButton("Nuevo");
		
		boton_cerrar = new JButton("Cerrar todo");
		
		add(boton_nuevo);
		add(boton_cerrar);
		
		OyenteNuevo oyente = new OyenteNuevo();
		
		boton_nuevo.addActionListener(oyente);
	}
	
	private class OyenteNuevo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			
			marco.setVisible(true);
		}
		
	}
}

class Marco_Emergente extends JFrame {
	private static int contador = 0;
	
	

	public Marco_Emergente (JButton botonCerrar) {
		
		setTitle("Ventana " + ++contador);
		setBounds(40*contador, 40*contador, 300, 150);
		
		CerrarTodos oyenteCerrar = new CerrarTodos();
		botonCerrar.addActionListener(oyenteCerrar);
	}
	
	public static void setContador(int contador) {
		Marco_Emergente.contador = contador;
	}
	
	private class CerrarTodos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
			setContador(0);
		}
		
	}
}