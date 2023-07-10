package Events;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MultipleSoruces {

	public static void main(String[] args) {
		//Instanciamos el objeto de la ventana
		Marco ventana = new Marco();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class Marco extends JFrame {
	public Marco (){
		//Agregamos lo metodos de la clase JFrame que usará nuestra ventana
		setTitle("Prueba acciones multiples");
		setBounds(600, 350, 600, 300);
		
		//Instanciamos el objeto que creará la lamina y despues la agregamos
		PanelAccion lamina = new PanelAccion();
		add(lamina);
		
	}
}

class PanelAccion extends JPanel {
	public PanelAccion() {
		
		//Instanciamos las acciones de nuestros eventos
		ActionColor accionAmarillo = new ActionColor("Amarillo", new ImageIcon("src/graficos/image.png"), Color.YELLOW);
		ActionColor accionAzul = new ActionColor("Azul", new ImageIcon("src/graficos/image.png"), Color.BLUE);
		ActionColor accionRojo = new ActionColor("Rojo", new ImageIcon("src/graficos/image.png"), Color.RED);
		
		// Creamos los botones con las acciones añadidas
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		
		//Creamos un Input Map para las teclas
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		
		ActionMap mapaAccion = getActionMap();
		
		// Agregamos las acciones con las keys
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_rojo", accionRojo);
		mapaAccion.put("fondo_azul", accionAzul);
		
	
		
	}
	
	//Objeto encargado de las acciones del evento
	class ActionColor extends AbstractAction {

		//Constructor que inserta los datos
		public ActionColor (String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			putValue("color_de_fondo", color_boton);
		}
		// Metodo que se ejecuta al activarse el evento
		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color) getValue("color_de_fondo");
			setBackground(c);
			
			System.out.println("Nombre: " + getValue(Action.NAME) + "Descripción: " + Action.SHORT_DESCRIPTION);
		}
		
	}
}

