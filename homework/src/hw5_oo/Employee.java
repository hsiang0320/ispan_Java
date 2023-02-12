package hw5_oo;

public abstract class Employee {
	private String name;
	private String gender;
	private String startWorkDate;
	private String phone;
	private String email;

	public Employee(String name, String gender, String startWorkDate, String phone, String email) {
		this.name = name;
		this.gender = gender;
		this.startWorkDate = startWorkDate;
		this.phone = phone;
		this.email = email;
	}

	public void printEmployeeData() {
		System.out.println("name:" + name + " gender:" + gender + " startWorkDate:" + startWorkDate + " phone:" + phone
				+ " email:" + email);
	}
	
}
