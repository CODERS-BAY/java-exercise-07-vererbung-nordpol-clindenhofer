package model;

public class SpecialChild extends Child{

	public SpecialChild(String name, String password, String address, String presentString) {
		super(name, password);
		this.address=address;
		this.setPresents(new Presents(presentString));
		System.out.println("making special Child"+name);
	}

}
