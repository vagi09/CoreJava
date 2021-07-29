package oopsconcepts;

public class EmployeeDataEncapsulation { // 1. make instance variables private

	private int ssn;
	private String empname;
	private int empage;

	public static void main(String[] args) {

		EmployeeDataEncapsulation emp = new EmployeeDataEncapsulation(); // 3. create object of the class EmployeeData

		emp.setEmpage(25); // 4. set values to instance variables
		emp.setSsn(124566);
		emp.setEmpname("Kevin McCallister");

		System.out.println("Employee of the year is: " + emp.getEmpname());
		System.out.println("Employee Social Security Number is: " + emp.getSsn());
		System.out.println("Employee Age is: " + emp.getEmpage());

	}

// 2.Generate getter and setter methods for instance variables
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

}
