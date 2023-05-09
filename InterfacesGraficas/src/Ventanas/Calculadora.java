package Ventanas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		//pack(); // La ventana toma el tamaño default de lo que hay en su interior
	}
}

class LaminaCalculadora extends JPanel {
	private JPanel body;
	private JButton pantalla;
	private boolean principio;
	
	public LaminaCalculadora () {
		this.principio = true;
		
		// Configuramos el tipo de layout para configurar el display de la calculadora
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		
		//Añadimos el display y lo situamos en el lado norte
		add(pantalla, BorderLayout.NORTH);
		
		// Creamos la lamina donde situaremos el teclado de la calculadora
		this.body = new JPanel();
		body.setLayout(new GridLayout(4,4)); // Hacemos el layout en forma de grid
		
		ActionListener insertarOrden = new InsertaNumero(); // Evento de insertar el numero
		ActionListener accionOrden = new AccionOrden(); // Evento de accionar la orden
		
		//Agregamos los botones junto con su respectiva accion
		ponerBoton("7", insertarOrden);
		ponerBoton("8", insertarOrden);
		ponerBoton("9", insertarOrden);
		ponerBoton("/", accionOrden);
		
		ponerBoton("4", insertarOrden);
		ponerBoton("5", insertarOrden);
		ponerBoton("6", insertarOrden);
		ponerBoton("x", accionOrden);
		
		ponerBoton("1", insertarOrden);
		ponerBoton("2", insertarOrden);
		ponerBoton("3", insertarOrden);
		ponerBoton("-", accionOrden);
		
		ponerBoton("0", insertarOrden);
		ponerBoton(".", insertarOrden);
		ponerBoton("+", accionOrden);
		ponerBoton("=", accionOrden);
		
		//Agregamos la lamina
		add(body);
	}
	
	private void ponerBoton (String title, ActionListener event) {
		JButton boton = new JButton(title);
		body.add(boton);
		boton.addActionListener(event);
	}
	
	private class InsertaNumero implements ActionListener {

		@Override //Funcion que desencadena el evento de Insertar Numero
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String entrada = e.getActionCommand();
			if (principio) {
				pantalla.setText("");
				principio=false;
			}
			pantalla.setText(pantalla.getText() + entrada);
		}
		
	}
	
	private class AccionOrden implements ActionListener {

		private double cache1;
		private String accion;
		private double resultado;
		
		@Override //Funcion que desencadena el evento de accionar la operacion
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String entrada = e.getActionCommand();
			principio = true;
			
			
			if (entrada == "=") { // Si el boton que se oprimió es el igual:
				
				double cache2 = Double.parseDouble(pantalla.getText());
				
				pantalla.setText(cache1 + " " + (accion) + " " + cache2 + " = " + calcular(cache2));
				
				cache1 = 0;
			}else { // Guardar la ultima accion
				accion = entrada;
				cache1 = Double.parseDouble(pantalla.getText());
			}
			
		}
		
		private double calcular (double x) {
			switch (accion) { // Switch de acciones
			case "+": 
				resultado = cache1 + x;
				break;
			case "-": 
				resultado = cache1 - x;
				break;
			case "x": 
				resultado = cache1 * x;
				break;
			case "/": 
				resultado = cache1 / x;
				break;
			default: break;
			}
			return resultado;
				
		}
		
	}
	
}