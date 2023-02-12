package hw5_oo;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new TemporaryEmployees("TOM", "M", "2022-08-06", "0912123321", "tw0320@gmail.com", 170, 100);
		e1.printEmployeeData();
		((TemporaryEmployees) e1).printSalary();
		System.out.println();
		Employee e2 = new GeneralEmployee("TOM", "M", "2022-08-06", "0912123321", "tw0320@gmail.com",50000);
		e2.printEmployeeData();
		((GeneralEmployee) e2).printSalary();
		System.out.println();
		Employee e3 = new Sales("TOM", "M", "2022-08-06", "0912123321", "tw0320@gmail.com",50000,2000);
		e3.printEmployeeData();
		((Sales) e3).printSalary();
		System.out.println();
		Employee e4 = new Manager("TOM", "M", "2022-08-06", "0912123321", "tw0320@gmail.com",50000,5000);
		e4.printEmployeeData();
		((Manager) e4).printSalary();
		System.out.println();
		GeneralEmployee e5=new GeneralEmployee("TOM", "M", "2022-08-06", "0912123321", "tw0320@gmail.com",50000);
		e5.printEmployeeData();
		e5.printSalary();

	
	}

}
