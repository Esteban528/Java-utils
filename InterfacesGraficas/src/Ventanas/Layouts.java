package Ventanas;

import javax.swing.*;
import java.awt.*;

public class Layouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TheFrame();
	}
	

}

class TheFrame extends JFrame {
	public TheFrame () {
		setTitle("Prueba Layouts");
		setBounds(600, 350, 600, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelLayout lamina = new PanelLayout();
		PanelLayout2 lamina2 = new PanelLayout2();
		add(lamina, BorderLayout.NORTH); //Esta lamina aparecerá arriba
		add(lamina2, BorderLayout.SOUTH); //Esta lamina aparecerá abajo 
	}
}

class PanelLayout extends JPanel {
	public PanelLayout () {
		//Ejemplo flowlayout
		setLayout(new FlowLayout(FlowLayout.LEFT)); 
		
		
		add(new JButton("Amarillo"));
		add(new JButton("Azul"));
		
	}
}

class PanelLayout2 extends JPanel {
	public PanelLayout2 () {
		//Ejemplo borderLayout
		setLayout(new BorderLayout());
		
		add(new JButton("Rojo"),  BorderLayout.SOUTH);
		add(new JButton("verde"),  BorderLayout.EAST);
		add(new JButton("Negro"),  BorderLayout.CENTER);
	}
}