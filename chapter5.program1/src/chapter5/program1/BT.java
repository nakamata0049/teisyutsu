package chapter5.program1;

import java.util.ArrayList;
import java.util.List;

public class BT {
	private String companyName = "BT/DE";
	private List<Employee> employees = new ArrayList<Employee>();
	private List<String> departments = new ArrayList<String>();

	public BT() {
		departments.add("人事");
		departments.add("営業");
		departments.add("エンジニア");
	}

	public void createEmployee(Employee employee) {
		employees.add(employee);
	}

	public void showEmployeeInfo() {
		for (Employee employee : employees) {
			employee.displayInfo();
		}
	}

	public List<String> getDeoartments() {
		return departments;
	}

	public String getCompanyName() {
		return companyName;
	}

}
