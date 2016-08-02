package org.ravi;

public class Employee {

	String eId;
	String eName;
	String eDept;
	Salary eSal;
	
	public Salary geteSal() {
		return eSal;
	}
	public void seteSal(Salary eSal) {
		this.eSal = eSal;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
	
	
}
