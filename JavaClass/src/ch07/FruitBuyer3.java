package ch07;
public class FruitBuyer3 {
	String name; 	int numOfApple;	int money;
	public FruitBuyer3(String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
	void buyFruit(FruitSeller3 fs, int amt) {
		if (money < amt) System.out.println("�� �������� ���� !");
		else {
			int num = fs.saleApple(amt); // ������ ��� ����
			if (num != 0) { // ��� ����
				money -= amt;
				numOfApple += num;
				System.out.printf("%s ��� ���� %d��, ���� %d��\n", name, num, amt);
			} else System.out.println("����� �� ����ϴ�");
		}
	}
	void print() {
		System.out.println(name +" ������� : " + numOfApple);
		System.out.println(name +" �����ܾ� : " + money);
		System.out.println("=================");
	}
}