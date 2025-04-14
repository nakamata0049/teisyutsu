package chapter5.program1;

public class Kadai_ex2 {

	public static void main(String[] args) {
		BT bt = new BT();
		
		//従業員作成
		HumanResource hr = new HumanResource("田中", "人事");
		Sales sales = new Sales("佐藤", "営業");
		Engineer engineer = new Engineer("鈴木", "エンジニア", "Java");

		//従業員をBTに追加
		bt.createEmployee(hr);
		bt.createEmployee(sales);
		bt.createEmployee(engineer);
		
		//従業員情報表示
		bt.showEmployeeInfo();
		
		hr.conductInterview();
		hr.calculateSalary();
		sales.replyWeeklyReport();
		sales.arrangeMeeting(engineer);
		engineer.develop();
	}
}
