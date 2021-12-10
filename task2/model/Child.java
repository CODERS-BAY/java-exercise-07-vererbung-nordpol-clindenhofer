package model;

public class Child extends Person {
	private Presents presents;

	public Presents getPresents() {
		return presents;
	}

	public void setPresents(Presents presents) {
		if (presents == null) {
			return;
		}
		this.presents = presents;
	}

	public String address;

	public Child(String name, String password) {
		super(name, password);
		System.out.println("making Child " + name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executeCommand(String inputString, Santa santa) {// present Computer
		if (inputString.startsWith("present")) {
			String[] intu = inputString.split(" ");
			if (intu.length > 1) {
				this.presents = new Presents(intu[1]);
			}
		}

		if (inputString.startsWith("address")) {
			String[] intu = inputString.split(" ");
			if (intu.length > 1) {
				this.address = (intu[1]);
			}
		}

		else
			super.executeCommand(inputString, santa);
	}

	public void print() {
		System.out.println("Name " + nameString);
		System.out.println("\tpassword " + password);
		System.out.println("\taddress " + address);
		if (presents == null) {

			System.out.println("\tno present wish");
		} else {
			System.out.println("\tpresent " + presents.name);
			System.out.println("\tpacked " + presents.packed);
		}
	}

}
