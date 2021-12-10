package model;

import java.util.ArrayList;

import javax.print.attribute.standard.PrinterInfo;

public class Santa extends Person{

	public ArrayList<Child> childList = new ArrayList<Child>();

	public Santa(String name, String password){
		super(name,password);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void executeCommand(String inputString, Santa santa) {//create Child Max passwort
		if(inputString.startsWith("print")) {
			print();
		}
	}


	private void print() {
		for(Child child :childList) {
			child.print();
		}
	}

}
