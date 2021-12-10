package model;

import controller.ElfUtil;

public class Elf extends Person{

	public Elf(String name, String password){
		super(name,password);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void executeCommand(String inputString, Santa santa) {//present Computer
		if(inputString.startsWith("sort")) {
			ElfUtil.sortbyAdress(santa.childList);
		}
		
		
		else
			super.executeCommand(inputString, santa);
	}

}
