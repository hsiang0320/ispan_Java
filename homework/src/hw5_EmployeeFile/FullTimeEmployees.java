package hw5_EmployeeFile;

public abstract class FullTimeEmployees extends Employee {
	private int wage;
	private static final int lunchAllowance = 2400;
	
	public FullTimeEmployees() {
		
	}
	public FullTimeEmployees(String name, String gender, String startWorkDate, String phone, String email, int wage) {
		super(name, gender, startWorkDate, phone, email);
		this.wage = wage;
	}

	public int getSalary() {
		return wage + lunchAllowance;
	}

	public void printSalary() {
		System.out.println("薪資:"+getSalary());
	}
}
