package Ventanas;

import javax.swing.*;

public class Menus {
	public static void main(String[] args) {
		new MenuFrame();
	}
}

class MenuFrame extends JFrame {
	public MenuFrame () {
		setBounds(500, 300, 550, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MenuLamina miLamina = new MenuLamina ();
		setVisible(true);
		add(miLamina);
		
	}
}
class MenuLamina extends JPanel {
	public MenuLamina () {
		JMenuBar mibarra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu ("Opciones");
		
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardar_como = new JMenuItem("Guardar Cómo");
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem generales = new JMenuItem("generales");
		JMenuItem opcion1 = new JMenuItem("1");
		JMenuItem opcion2 = new JMenuItem("2");
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		opciones.addSeparator();
			
		archivo.add(guardar);
		archivo.add(guardar_como);

		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(opciones);
		
		herramientas.add(generales);
		archivo.add(guardar_como);
		
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		add(mibarra);
	}
}