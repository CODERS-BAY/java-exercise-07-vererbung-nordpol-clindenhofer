package model;

public class Person {
	String nameString;
	public String password;
	
	Person(String name, String password){
		this.nameString = name;
		this.password=password;
		System.out.println("making Person "+name);
	}

	public void executeCommand(String inputString, Santa santa) {
		System.out.println("Command \""+inputString+"\" is not defined");
	}

}
