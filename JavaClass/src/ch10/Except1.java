package ch10;
public class Except1 {
	public static void main(String[] args) {
		int number = 100, result = 0;
		for (int i = 0; i < 10; i++) {
			//                      0 ~ 9
			try {
				result = number /(int)(Math.random()* 10);
			}catch (ArithmeticException e) {
				System.out.println("0�� ������" + e.getMessage());
			}
			System.out.println("������ ��� : " + result);
		}
	}
}