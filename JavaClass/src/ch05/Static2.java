package ch05;
class A2 {
	int num1;
	static int num2;
	void print() {
		System.out.println("num1 = " + ++num1+", num2 = " + ++num2);
	}
}
public class Static2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			A2 a2 = new A2();
			a2.print();
		}
	}
}