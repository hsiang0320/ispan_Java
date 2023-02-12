package hw5_EmployeeFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// File file = new File("D:\\JAVA\\workspace\\homework\\res\\test.txt"); 絕對路徑
		File file = new File("res/test.txt");// 相對路徑 根目錄為homework
		List<Employee> list = new ArrayList<>();
		FileReader fileReader;
		BufferedReader buffReader;
		Employee manager = new Manager();
		Employee sales = new Sales();
		Employee generalEmployee = new GeneralEmployee();
		Employee temporaryEmployees = new TemporaryEmployees();
		try {
			fileReader = new FileReader(file);
			buffReader = new BufferedReader(fileReader);
			while (buffReader.ready()) {
				String[] str = buffReader.readLine().split(",");
				if (str.length == 1) {
					continue;
				} else {
					switch (str[5]) {
					case "Manager":
						manager = new Manager(str[0], str[1], str[2], str[3], str[4], Integer.parseInt(str[6]),
								Integer.parseInt(str[7]));
						list.add(manager);
						break;
					case "Sales":
						sales = new Sales(str[0], str[1], str[2], str[3], str[4], Integer.parseInt(str[6]),
								Integer.parseInt(str[7]));
						list.add(sales);
						break;
					case "GeneralEmployee":
						generalEmployee = new GeneralEmployee(str[0], str[1], str[2], str[3], str[4],
								Integer.parseInt(str[6]));
						list.add(generalEmployee);
						break;
					case "TemporaryEmployees":
						temporaryEmployees = new TemporaryEmployees(str[0], str[1], str[2], str[3], str[4],
								str[6], str[7]);
						list.add(temporaryEmployees);
						break;
					default:
						break;
					}
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Employee employee : list) {
			System.out.print(employee.getName() + "\t");
			System.out.print(employee.getGender() + "\t");
			System.out.print(employee.getStartWorkDate() + "\t");
			System.out.print(employee.getPhone() + "\t");
			System.out.print(employee.getEmail() + "\t");
			if (employee instanceof Manager) {
				System.out.print("職位:" + "Manager" + "\t");
			} else if (employee instanceof Sales) {
				System.out.print("職位:" + "Sales" + "\t");
			} else if (employee instanceof TemporaryEmployees) {
				System.out.print("職位:" + "TemporaryEmp" + "\t");
			} else if (employee instanceof GeneralEmployee) {
				System.out.print("職位:" + "GeneralEmp" + "\t");
			}
			System.out.print("薪資:" + employee.getSalary() + "\n");
		}

	}

}
