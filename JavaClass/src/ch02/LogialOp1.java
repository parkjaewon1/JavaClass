package ch02;

public class LogialOp1 {
	public static void main(String[] args) {
		int i = 7;
		boolean b1 = i > 3 && i < 5; // and�� ��� true�� true
		boolean b2 = i > 3 || i < 5; // or�� �ϳ��� true�� true
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		boolean b3 = !b2; // !�� �ݴ� , ture�� false, false�� true
		System.out.println("b3 = " + b3);
		boolean b4 = b1 ^ b2;
		System.out.println("b4 = " + b4);
		boolean b5 = b1 ^ b3;
		System.out.println("b5 = " + b5);
	}
}