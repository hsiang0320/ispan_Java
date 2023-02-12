package hw5_EmployeeFile;

public class TemporaryEmployees extends Employee {
	String hourlyWage;
	String workTime;
	public TemporaryEmployees() {
		
	}
	public TemporaryEmployees(String name, String gender, String startWorkDate, String phone, String email,
			String hourlyWage, String workTime) {
		super(name, gender, startWorkDate, phone, email);
		this.hourlyWage = hourlyWage;
		this.workTime = workTime;
	}

	public int getSalary() {
		return Integer.parseInt(hourlyWage) * Integer.parseInt(workTime);
	}

	public void printSalary() {
		System.out.println("薪資:" + getSalary());
	}

}
