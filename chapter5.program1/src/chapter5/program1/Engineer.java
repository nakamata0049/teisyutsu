package chapter5.program1;

public class Engineer extends Employee {
	private String programmingLanguage;
	
	public Engineer(String name, String department, String programmingLanguage) {
		super(name, department);
		this.programmingLanguage = programmingLanguage;
	}
	
	public void develop() {
		System.out.println(this.programmingLanguage + "で開発を行った");
	}

	@Override
	public void displayInfo() {
		System.out.println(name + ":" + department +" 使用言語:" + programmingLanguage);

	}

}
