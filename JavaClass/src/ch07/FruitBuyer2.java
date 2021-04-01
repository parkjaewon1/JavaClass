package ch07;
public class FruitBuyer2 {
	String name;
	int numOfApple;
	int money;
	public FruitBuyer2(String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
	void buyFruit(FruitSeller2 fs, int amt) {
		int num = fs.saleApple(amt); // ±¸¸ÅÇÑ »ç°ú °¹¼ö
		money -= amt;
		numOfApple += num;
	}
	void print() {
		System.out.println(name +" »ç°ú°¹¼ö : " + numOfApple);
		System.out.println(name +" Çö±ÝÀÜ¾× : " + money);
		System.out.println("=================");
	}
}