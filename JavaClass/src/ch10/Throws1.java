package ch10;
public class Throws1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			try {
				m1(i);
			} catch (ArithmeticException e) {
				// System.out.println("������ ������");
				// System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
	private static void m1(int i) throws ArithmeticException, NumberFormatException{
		m2(i);		
	}
	// throws�� ���ܰ� �߻��ϸ� �� �޼��带 ȣ���� ������ ���ܷ� ������
	private static void m2(int i) throws ArithmeticException{
		int k = 12;
		System.out.printf("%d / %d = %d\n", k, i, k/i);
	}
}