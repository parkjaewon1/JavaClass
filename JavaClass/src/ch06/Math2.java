package ch06;
class A2 {
	void divide(int x, int y) {
		if (y == 0) System.out.println("0으로는 못 나눠요");
		else System.out.printf("%d / %d = %d\n",x,y,x/y);
	}
}
public class Math2 {
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.divide(10, 2);
		a2.divide(12, 4);
		a2.divide(7, 0);
		a2.divide(16, 4);
	}
}