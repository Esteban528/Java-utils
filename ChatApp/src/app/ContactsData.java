package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ContactsData {
	final String ROUTE_OF_CONTACTSLIST = "files/contact.dat";
	private ArrayList<User> contactsArray;
	
	public ContactsData () {
		File file = new File(ROUTE_OF_CONTACTSLIST);
		if (file.exists()) {
			System.out.println("El file existe");
			FileInputStream fis;
			try {
				fis = new FileInputStream(ROUTE_OF_CONTACTSLIST);
				ObjectInputStream ois = new ObjectInputStream(fis);
				contactsArray = (ArrayList<User>) ois.readObject();
			    ois.close();
			    fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			
		}else {
			System.out.println("El file no existe");
			this.contactsArray = new ArrayList<User>();
			contactsArray.add(new User("Esteban", "estebangonza2005@gmail.com", "10.0.0.12"));
			setContactsFile (contactsArray);
		}
		
	}
	
	public ContactsData (ArrayList<User> contactsArray) {
		setContactsFile (contactsArray);
	}

	private ArrayList<User> extracted(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		return (ArrayList<User>) ois.readObject();
	}
	
	public ArrayList<User> getContactsFile () {
		return contactsArray;
	}
	
	public void setContactsFile (ArrayList<User> contactsArray) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(ROUTE_OF_CONTACTSLIST);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(contactsArray);
			oos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}
}