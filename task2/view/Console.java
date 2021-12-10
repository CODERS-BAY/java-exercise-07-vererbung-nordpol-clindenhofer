package view;

import java.beans.beancontext.BeanContextChildComponentProxy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Child;
import model.Elf;
import model.Person;
import model.Presents;
import model.Santa;
import model.SpecialChild;

public class Console {
	List<Person> loginList = new ArrayList<Person>();
	/*
	 * the console dialog comes here
	 */
	Santa santa;
	
	public Console() {
		santa = new Santa("Santa", "1234");
		loginList.add(santa);
		addChild("Max", "passwort", "Linz");
		addChild("Michi", "passwort", "Wien");
		addChild("Anna", "1234", "Amstetten");
		loginList.add(loginList.size(),new Elf("Kurt", "1234"));
	}
	
	private void addChild(String name, String password, String address) {
		Child child= new SpecialChild(name, password, address, "Handy");
		loginList.add(loginList.size(),child);
		santa.childList.add(child);
	}

	public void dialog() throws IOException {

		String inputString = "";
		Person loggedIn = null;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (!inputString.equals("exit")) {
			System.out.println("Please login with ID:");
			inputString = in.readLine();
			int ID = Integer.parseInt(inputString);
			loggedIn = loginList.get(ID);
			if(loggedIn == null) {

				System.out.println("False ID");
			}

			System.out.println("Please enter password:");
			if(loggedIn != null && loggedIn.password.equals( in.readLine()))
				ID = ID;
			else {
				loggedIn=null;
				System.out.println("False Password");
			}

			while (loggedIn != null) {
				System.out.println("Enter command");
				inputString = in.readLine();

				if (inputString.equals("logout"))
					loggedIn = null;
				else
					loggedIn.executeCommand(inputString, santa);

			}
		}
	}
}
