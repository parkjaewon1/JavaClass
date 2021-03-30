package ch05;
class A1 {
	int var1 = 100;
	static int var2 = 200;
	void print() {
		System.out.println("대박 ");
		System.out.println("var1 = "+var1+", var2 = "+var2);
	}
	static void print2() { // 객체를 생성하지 않고 사용 가능, Class명.메서드();
		System.out.println("사건");
//		System.out.println("var1 = "+var1+", var2 = "+var2);
		System.out.println("var2 = "+var2);
	}
}
public class Static1 {
	public static void main(String[] args) {
		A1.var2 = 300;
		A1.print2();
		A1 a1 = new A1();
		a1.var1 = 400;
		a1.print();
	}
}