package Ventanas;

import javax.swing.JFrame;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.*;

public class ClaseContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContainerFrame ();
	}

}

class ContainerFrame extends JFrame {
	public ContainerFrame () {
		
		setTitle("Prueba con containers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(10, 10,500,400);
		
		ContainerPanel lamina = new ContainerPanel();
		add(lamina);
	}
}

class ContainerPanel extends JPanel {
	public ContainerPanel () {
		setLayout(new EnColumnas());
		
		JLabel nombre = new JLabel("Nombre :");
		JLabel apellido = new JLabel("Apellido :");
		JTextField c_nombre  = new JTextField("Nombre");
		JTextField c_apellido= new JTextField("Apellido");
		
		add(nombre);
		add(c_nombre);
		
		add(apellido);
		add(c_apellido);
	}
}

class EnColumnas implements LayoutManager {

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void layoutContainer(Container parent) {
		// TODO Auto-generated method stub
		int contador=0;
		int n = parent.getComponentCount();
		
		for (int i = 0; i<n;i++) {
			contador++;
			
			Component c = parent.getComponent(i);
			
			c.setBounds(this.x, this.y, 100, 20);
			
			this.x+=100;
			
			if(contador % 2 == 0) {
				this.x = 20;
				this.y+= 100;
			}
		}
		
	}
	
	private int x = 20;
	private int y = 20;
}
