package gui;

import java.awt.*;
import app.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;

import app.User;

public class Panel extends JFrame implements WindowListener  {
	private boolean notification;
	private String nickname;
	private String ip;
	private ArrayList<User> contactsArray;
	
	public Panel (ArrayList<User> contactsArray) {
		setTitle("JavaChat");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GraphicsDevice[] gs = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
	    GraphicsConfiguration[] gc = gs[0].getConfigurations();
		Rectangle gcBounds = gc[0].getBounds();
		this.contactsArray = contactsArray;
		System.out.println(contactsArray);
		
		int width = gcBounds.width;
		int height = gcBounds.height;

		setBounds(width/4, height/4, width/2, height/2);	
		
		ImageIcon icon = new ImageIcon ("files/PinarChat.png");
		setIconImage(icon.getImage());
		

	}
	
	public void open() {
		Panels panels = new Panels(this.contactsArray);
		add(panels);
		
		
		setVisible(true);	
	}

	public boolean isNotificable () {
		return this.notification;
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		this.notification = false;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		this.notification = true;
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		this.notification = false;
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}

class Panels extends JPanel {
	public Panels (ArrayList<User> contactsArray) {
		setLayout(new BorderLayout());	
		
		add(new MenuBar(), BorderLayout.NORTH);
		add(new ContactsZone(contactsArray), BorderLayout.WEST);
		add(new ChatZone(), BorderLayout.CENTER);
		
	}
}

class MenuBar extends JMenuBar{
	public MenuBar () {
		super();
		
		JMenu userMenu = new JMenu("User");
		userMenu.add(new JMenuItem("Change Name"));
		this.add(userMenu);
	}
}

// Contacts area
class ContactsZone extends JPanel {
	private User contactSelected;	
	private JList<User> contactsList;
	DefaultListModel<User> model = new DefaultListModel<>();
	
	public ContactsZone (ArrayList<User> contactsArray) {
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JPanel contactTitle = new JPanel();
		JButton addContactsButton = new JButton ("Agregar contactos");
		
		addContactsButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nick = JOptionPane.showInputDialog("Nombre del contacto:");
				String email = JOptionPane.showInputDialog("Direccion email");
				User user = new User (nick, email, "0.0.0");
				contactsArray.add(user);
				model.removeAllElements();
				for (User s : contactsArray) {
				      model.addElement(s);
				      System.out.println(s);
				}
				contactsList.setModel(model);
				ContactsData updateContactsList = new ContactsData(contactsArray);
			}
			
		});
		
		contactTitle.add(new JLabel("Contactos"));
		contactTitle.add(addContactsButton);
		panel.add(contactTitle);
		
		// Contacts List 
		
	    for (User s : contactsArray) {
	      model.addElement(s);
	      System.out.println(s);
	    }
	    contactsList = new JList<>(model);
	    JScrollPane scrollPane = new JScrollPane(contactsList);
		
		contactsList.addListSelectionListener(e -> {
		    if (!e.getValueIsAdjusting()) {
		    	this.contactSelected = ((User) contactsList.getSelectedValue());
		        System.out.println("Elemento seleccionado: " + contactSelected);
		    }
		});
		
		Border border = new BasicBorders.ButtonBorder (Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY);
		this.setBorder(border);
		add(panel, BorderLayout.NORTH);
		add(contactsList, BorderLayout.CENTER);
		contactsList.add(scrollPane);
	}

	private JList extracted(ArrayList<User> contactsArray) {
		return new JList(contactsArray.toArray());
	}
	
}

class ChatZone extends JPanel {
	public ChatZone () {
		add(new JButton("chat zone"));
	}
	
}