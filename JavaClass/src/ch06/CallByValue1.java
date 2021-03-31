package ch06;

class C1 {
	public void m1(int x, int y) {
		x += 7;
		y += 7;
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}

public class CallByValue1 {

	public static void main(String[] args) {

		C1 a1 = new C1();
		int x = 10, y = 20;
		a1.m1(x, y);  // a1.m1(10,20)
		System.out.println("x= " + x);
		System.out.println("y= " + y);

	}

}
