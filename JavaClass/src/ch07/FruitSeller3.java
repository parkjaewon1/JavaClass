package ch07;
public class FruitSeller3 {
	String name;  	int numOfApple;	int money;
	final int PRICEPERAPPLE = 1000; // ���ܺ���, �� ���� ����, �ܰ�
	public FruitSeller3(String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
	int saleApple(int amt) { // amt ��� ��� ����� �ִ� ��		
		int num = amt / PRICEPERAPPLE; // �Ǹż���
		if (numOfApple >= num) {
			numOfApple -= num; // ��� ������ ����
			money += amt;  // ���� ����
			System.out.printf("%s %d�� �Ǹ�, ���� %d��\n", name,num,amt);
		} else {
			System.out.println("����� �����ؼ� �� �� �����ϴ�");
			num = 0;
		}		
		return num;
	}
	void print() {
		System.out.println(name +" ������� : " + numOfApple);
		System.out.println(name +" �����ܾ� : " + money);
	}
}