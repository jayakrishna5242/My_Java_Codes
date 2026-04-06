package com.oops;

public class SettersAndGetters {

	// setters and getters are the part of enczpsulation which are used to restrict
	// the direct access for a class members
	// they provide restricted access to the outside classes
	// These do no contains any main method
	String sname;
	int sid;
	String branch;
	int yop;

	// setters do no return anything so must keep void
	void setName(String sname) {
		this.sname = sname;
	}

	void setId(int sid) {
		this.sid = sid;
	}

	void setBranch(String branch) {
		this.branch = branch;
	}

	void setYop(int yop) {
		this.yop = yop;
	}

	// getters must and should return some values that are set by the setters

	String getName() {
		return sname;
	}

	int getId() {
		return sid;
	}

	int getYop() {
		return yop;
	}

	String getBranch() {
		return branch;
	}
}
