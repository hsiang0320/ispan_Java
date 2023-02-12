package hw5_oo;

public class TemporaryEmployees extends Employee {
	int hourlyWage;
	int workTime;

	public TemporaryEmployees(String name, String gender, String startWorkDate, String phone, String email,
			int hourlyWage, int workTime) {
		super(name, gender, startWorkDate, phone, email);
		this.hourlyWage = hourlyWage;
		this.workTime = workTime;
	}

	public int getSalary() {
		return hourlyWage * workTime;
	}

	public void printSalary() {
		System.out.println("薪資:" + getSalary());
	}

}
