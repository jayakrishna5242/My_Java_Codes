package com.Java_Practice;

public class DoorAceess {

	String ename;
	boolean hasAcesscard;
	boolean BiometricMatch;
	boolean hasPower;
	boolean hasNotBlacklist;
	boolean power;
	boolean result;

	public DoorAceess(String ename, boolean hasAcesscard, boolean biometricMatch, boolean hasPower,
			boolean hasNotBlacklist, boolean power) {
		this.ename = ename;
		this.hasAcesscard = hasAcesscard;
		BiometricMatch = biometricMatch;
		this.hasPower = hasPower;
		this.hasNotBlacklist = hasNotBlacklist;
		this.power = power;
		// Usng and operator to check all conditions matched
		result = hasAcesscard && BiometricMatch && hasPower && hasNotBlacklist && power;

	}

	void displayResult(boolean result) {
		String res = (result) ? "Acess Granted" : "Acess Denied";
		System.out.println(res);
	}

	public static void main(String[] args) {

		DoorAceess emp1 = new DoorAceess("jaya", true, true, true, true, true);
		emp1.displayResult(emp1.result);

	}

}
