package Ventanas;

import java.awt.*;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco marcoCalculadora = new Marco();
	}

}

class Marco extends JFrame {
	public Marco () {
		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		LaminaCalculadora miLamina = new LaminaCalculadora();
		add(miLamina);
	}
}

class LaminaCalculadora extends JPanel {
	private JPanel body;
	public LaminaCalculadora () {
		setLayout(new BorderLayout());
		
		JButton pantalla = new JButton("0");
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		this.body = new JPanel();
		body.setLayout(new GridLayout(4,4));
		
		ponerBoton("7");
		ponerBoton("8");
		ponerBoton("9");
		ponerBoton("/");
		
		ponerBoton("4");
		ponerBoton("5");
		ponerBoton("6");
		ponerBoton("x");
		
		ponerBoton("1");
		ponerBoton("2");
		ponerBoton("3");
		ponerBoton("-");
		
		ponerBoton("0");
		ponerBoton(".");
		ponerBoton("+");
		ponerBoton("=");
		
		
		add(body);
	}
	
	private void ponerBoton (String title) {
		JButton boton = new JButton(title);
		body.add(boton);
	}
}