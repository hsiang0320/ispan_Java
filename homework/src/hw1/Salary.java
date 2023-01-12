package hw1;

public class Salary {

	public static void main(String[] args) {
		int workingHours = 60;
		int salary;
		int hourlyWage = 150;
		if (workingHours > 60 && workingHours <= 80) {// 工時介於60~80之間
			salary = hourlyWage * 60;
			salary = (int) (salary + (workingHours - 60) * hourlyWage * 1.25);
			System.out.println(salary);
		} else if (workingHours > 80) {// 工時>80
			salary = hourlyWage * 60;// 前60小時的工資
			salary = (int) (salary + 20 * hourlyWage * 1.25);// 60~80的工資
			salary = (int) (salary + (workingHours - 80) * hourlyWage * 1.5);// 超過80小時的工資
			System.out.println(salary);
		} else if (workingHours >= 0) { // 工時<60
			salary = hourlyWage * workingHours;
			System.out.println(salary);
		} else {
			System.out.println("錯誤");
		}
		
	}

}
