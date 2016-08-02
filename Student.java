package org.student;

public class Student {
	
	String sId;
	String sName;
	String sDept;
	Marks sMarks[];
	
	public Marks[] getsMarks() {
		return sMarks;
	}
	public void setsMarks(Marks[] marks) {
		this.sMarks = marks;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsDept() {
		return sDept;
	}
	public void setsDept(String sDept) {
		this.sDept = sDept;
	}

}
