package ch07;
public class FruitBuyer2 {
	String name;
	int numOfApple;
	int money;
	public FruitBuyer2(String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
	void buyFruit(FruitSeller2 fs, int amt) {
		int num = fs.saleApple(amt); // ������ ��� ����
		money -= amt;
		numOfApple += num;
	}
	void print() {
		System.out.println(name +" ������� : " + numOfApple);
		System.out.println(name +" �����ܾ� : " + money);
		System.out.println("=================");
	}
}