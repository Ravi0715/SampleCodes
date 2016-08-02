package org.ravi;

public class FinalEmployeeData {

	public static void main(String[] args) {

		Employee employee = new Employee();
		
		Salary salary = new Salary();
		
		employee.seteId("101");
		employee.seteDept("Coding");
		employee.seteName("Ravi");
		salary.seteBs(5000.00);
		salary.seteDa(2000.00);
		salary.seteHra(100.00);
		employee.seteSal(salary);
		System.out.println(employee.geteDept());
		System.out.println(employee.geteId());
		System.out.println(employee.geteName());
		System.out.println(employee.geteSal().geteBs());
		System.out.println(employee.geteSal().geteDa());
		System.out.println(employee.geteSal().geteHra());
		

	}

}
