package Ventanas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ProcesadorDeTextos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuProcesador();
	}
	
}

class MenuProcesador extends JFrame {
	public MenuProcesador () {
		setBounds(500, 300, 550, 400);
		LaminaProcesador milamina = new LaminaProcesador();
		add(milamina);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class LaminaProcesador extends JPanel {
	private JMenu fuente, estilo, tamaño;
	private String fontName;
	private int fontType, fontSize;
	private Font font;
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	

	public LaminaProcesador () {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel(); 
		JMenuBar mibarra = new JMenuBar();
		
		fontName = "Monospaced";
		fontType = Font.PLAIN;
		fontSize = 12;
		
		
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamaño = new JMenu("Tamaño");
		//----------------------------------------
		new Gestiona_menus (fuente, "Monospaced", "fuente", "monospaced");
		new Gestiona_menus (fuente, "Courier", "fuente", "Courier");
		new Gestiona_menus (fuente, "Verdana", "fuente", "Verdana");

		//
		
		new Gestiona_menus (estilo, "Normal", "estilo", Integer.toString(Font.PLAIN));
		new Gestiona_menus (estilo, "Negrita", "estilo", Integer.toString(Font.BOLD));
		new Gestiona_menus (estilo, "Cursiva", "estilo", Integer.toString(Font.ITALIC));
		
		//
		
		new Gestiona_menus (tamaño, "12", "tamaño", Integer.toString(12));
		new Gestiona_menus (tamaño, "16", "tamaño", Integer.toString(16));
		new Gestiona_menus (tamaño, "24", "tamaño", Integer.toString(24));
		new Gestiona_menus (tamaño, "28", "tamaño", Integer.toString(28));
		
		//---------------------------------------
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamaño);
			
		laminaMenu.add(mibarra);
		add(laminaMenu, BorderLayout.NORTH);
		
		miArea = new JTextPane();
		font = new Font(fontName, fontType, fontSize);
		miArea.setFont(font);
		add(miArea);
		
		// Indicador de texto
		label1 = new JLabel("");
		add(label1, BorderLayout.EAST);
		label2 = new JLabel("");
		add(label2, BorderLayout.EAST);
		label3 = new JLabel("");
		add(label3, BorderLayout.EAST);
		updateLabel();
	}
	
	private class Gestiona_menus implements ActionListener {
		private JMenu menu;
		private String accion;
		private String value;
		
		public Gestiona_menus (JMenu menu, String nombre, String accion, String value) {
			this.menu = menu;
			this.accion = accion;
			this.value = value;
			
			JMenuItem item = new JMenuItem(nombre);
			menu.add(item);
			item.addActionListener(this);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			switch (this.accion) {
				case "fuente":
					fontName = this.value;
					break;
				case "estilo": 
					fontType = Integer.parseInt(this.value) + font.getStyle();
					break;
				case "tamaño": 
					fontSize = Integer.parseInt(this.value);
					break;
			}
			//System.out.println(this.value);
			font = new Font(fontName, fontType, fontSize);
			miArea.setFont(font);
			updateLabel ();
		}
		
	}
	
	public void updateLabel () {
		label1.setText("Fuente: "+fontName);
		label2.setText("Tipo: "+fontType);
		label3.setText("Tamaño: "+fontSize);
	}
	
	private JTextPane miArea;
}