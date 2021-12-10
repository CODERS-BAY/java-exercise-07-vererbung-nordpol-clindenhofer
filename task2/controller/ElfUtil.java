package controller;

import java.util.ArrayList;

import model.Child;

public class ElfUtil {

	public ElfUtil() {
		// TODO Auto-generated constructor stub
	}

	public static void sortbyAdress(ArrayList<Child> childList) {
		childList.sort(
				( c1, c2) -> {
			return c1.address.compareTo(c2.address);
		}
		);
	}
	
private class ChildCompare  {
	int foo(Child c1, Child c2) {
		return c1.address.compareTo(c2.address);
	}
}

	/*
	 * sledge should be prepared here
	 */
}
