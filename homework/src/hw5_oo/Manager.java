package hw5_oo;

public class Manager extends FullTimeEmployees {
	private static final int t_Allowance=3000;	
	private int performance_Bonus;
	public Manager(String name, String gender, String startWorkDate, String phone, String email, int wage,int performance_Bonus) {
		super(name, gender, startWorkDate, phone, email, wage);
		this.performance_Bonus=performance_Bonus;
	}
	public int getSalary() {
		return (super.getSalary()+t_Allowance+performance_Bonus);
	}
	
}
