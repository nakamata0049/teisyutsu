package chapter5.program1;

public class HumanResource extends Employee {

	public HumanResource(String name, String department) {
		super(name, department);
	}

	public void conductInterview() {
		System.out.println("面接を行い、結果は○○（採用 or 不採用）だった");
	}

	public void calculateSalary() {
		System.out.println("給与計算を行った");
	}

	@Override
	public void displayInfo() {
		System.out.println(name + ":" + department);
	}
}
