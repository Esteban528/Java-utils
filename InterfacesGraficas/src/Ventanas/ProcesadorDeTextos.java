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
	public LaminaProcesador () {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel(); 
		
		JMenuBar mibarra = new JMenuBar();
		
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamagno = new JMenu("Tamaño");
		//----------------------------------------
		JMenuItem arial = new JMenuItem("Arial");
		arial.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				miArea.setFont(new Font("Arial", Font.PLAIN, 12));
			}
			
		});
		
		
		JMenuItem courier = new JMenuItem("Courier");
		
		courier.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				miArea.setFont(new Font("courier", Font.PLAIN, 12));
			}
			
		});
		
		JMenuItem verdana = new JMenuItem("verdana");
		verdana.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				miArea.setFont(new Font("verdana", Font.PLAIN, 12));
			}
			
		});
		
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		//----------------------------------------
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		JMenuItem subrayada = new JMenuItem("Subrayada");
		
		estilo.add(negrita);
		estilo.add(cursiva);
		estilo.add(subrayada);
		//----------------------------------------
		JMenuItem tam_12 = new JMenuItem("12");
		JMenuItem tam_16 = new JMenuItem("16");
		JMenuItem tam_20 = new JMenuItem("20");
		JMenuItem tam_24 = new JMenuItem("24");
		
		tamagno.add(tam_12);
		tamagno.add(tam_16);
		tamagno.add(tam_20);
		tamagno.add(tam_24);
		//----------------------------------------
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
			
		laminaMenu.add(mibarra);
		add(laminaMenu, BorderLayout.NORTH);
		
		miArea = new JTextPane();
		add(miArea, BorderLayout.CENTER);
	}
	
	private class Gestiona_menus implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			miArea.setFont(new Font("courier", Font.PLAIN, 12));
		}
		
	}
	private JTextPane miArea;
}