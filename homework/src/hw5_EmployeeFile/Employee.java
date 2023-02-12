package hw5_EmployeeFile;

public abstract class Employee {
	private String name;
	private String gender;
	private String startWorkDate;
	private String phone;
	private String email;

	public Employee() {

	}

	public Employee(String name, String gender, String startWorkDate, String phone, String email) {
		this.name = name;
		this.gender = gender;
		this.startWorkDate = startWorkDate;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getStartWorkDate() {
		return startWorkDate;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public void printEmployeeData() {
		System.out.println("name:" + name + " gender:" + gender + " startWorkDate:" + startWorkDate + " phone:" + phone
				+ " email:" + email);
	}

	public abstract int getSalary();

}
