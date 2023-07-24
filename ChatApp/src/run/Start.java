package run;
import gui.*;

import java.io.*;
import java.util.ArrayList;

import app.*;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactsData updateContactsList = new ContactsData();
		
		Panel guiPanel = new Panel(updateContactsList.getContactsFile());
		guiPanel.open();
	}

}

