package Ventanas;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UsoBox {
	public static void main(String[] args) {
		new MarcoCaja();
	}

}

class MarcoCaja extends JFrame {
	public MarcoCaja () {
		setTitle("Marco en la caja");
		setBounds(600, 350, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Box CajaContenedor = Box.createVerticalBox();
		
		JLabel rotulo1 = new JLabel("Nombre");
		JTextField texto1 = new JTextField(10);
		
		texto1.setMaximumSize(texto1.getPreferredSize());
		
		Box cajaH1 = Box.createHorizontalBox();
		
		cajaH1.add(rotulo1);
		cajaH1.add(Box.createHorizontalStrut(10));
		
		cajaH1.add(texto1);
		CajaContenedor.add(cajaH1);
		
		//-----------------------------------------
		
		JLabel rotulo2 = new JLabel("Contraseña");
		JTextField texto2 = new JTextField(10);
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		Box cajaH2 = Box.createHorizontalBox();
		
		cajaH2.add(rotulo2);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(texto2);
		
		CajaContenedor.add(cajaH2);
		
		JButton boton1 = new JButton("Ok");
		JButton boton2 = new JButton("Cancelar");
		Box cajaH3 = Box.createHorizontalBox();
		cajaH3.add(boton1);
		cajaH3.add(Box.createGlue());
		cajaH3.add(boton2);
		
		CajaContenedor.add(cajaH3);

		
		add(CajaContenedor);
		pack();
	}
}
