package java_12_2;

public class Hero extends Character {

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵に10ポイントのダメージをあたえた!");
		m.hp -= 10;
		
	}

	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	

}
