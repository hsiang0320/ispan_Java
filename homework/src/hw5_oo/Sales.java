package hw5_oo;

public class Sales extends FullTimeEmployees {
	private int salesBonus;

	public Sales(String name, String gender, String startWorkDate, String phone, String email, int wage,
			int salesBonus) {
		super(name, gender, startWorkDate, phone, email, wage);
		this.salesBonus = salesBonus;
	}

	public int getSalary() {
		return (super.getSalary() + salesBonus);
	}

	
}
