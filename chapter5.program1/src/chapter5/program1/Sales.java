package chapter5.program1;

public class Sales extends Employee {
	
	public Sales(String name, String department) {
		super(name, department);
	}
	
	public void replyWeeklyReport() {
		System.out.println("週報の返信をした");
	}
	
	public void arrangeMeeting(Engineer engineer) {
		System.out.println(engineer.name + "の面接を組んだ");
	}
	
	public void HaveMeeting() {
		System.out.println("新規の打ち合わせをした");
	}

	@Override
	public void displayInfo() {
		System.out.println(name + ":" + department);
	}
}
