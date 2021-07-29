package oopsconcepts;

public class EmpDataInhertitance extends EmployeeDataEncapsulation { // class EmpDataInhertitance inherited properties
																		// from class EmployeeDataEncapsulation

	public static void main(String[] args) {

		EmployeeDataEncapsulation employee = new EmployeeDataEncapsulation();

		employee.setEmpname("Chandler Bing");
		employee.setSsn(125896);
		employee.setEmpage(45);

		System.out.println("name: " + employee.getEmpname());
		System.out.println("Age: " + employee.getEmpage());
		System.out.println("ssn: " + employee.getSsn());

	}

}
