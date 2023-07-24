package app;

import java.util.ArrayList;

public class Contacts {
	private ArrayList<User> contactsArray;
	
	public Contacts () {
		this.contactsArray = new ArrayList<User>();
		contactsArray.add(new User("Esteban", "estebangonza2005@gmail.com", "10.0.0.12"));
		contactsArray.add(new User("Cris", "estebangonza2005@gmail.com", "10.0.0.12"));
		contactsArray.add(new User("Marlon", "estebangonza2005@gmail.com", "10.0.0.12"));
		contactsArray.add(new User("Pelusa", "estebangonza2005@gmail.com", "10.0.0.12"));
	}

	public ArrayList<User> getContactsArray() {
		return contactsArray;
	}

	public void setContactsArray(ArrayList<User> contactsArray) {
		this.contactsArray = contactsArray;
	}

	public void addContact(User user) {
		this.contactsArray.add(user);
	}
		
}
