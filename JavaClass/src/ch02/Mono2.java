package ch02;

public class Mono2 {
	public static void main(String[] args) {
		int a1 = 5, a2 = 5;
		// a1�� 1����, a2�� 1����
		// ++�� --�� �ڿ� �ִ� ���� ���� ���� �Ŀ� �ݿ�
		// c1 = 6 * 3 + (5 + 2) * 3 => 18+21=> 39
		// ���� ����� ������ �Ŀ� a2���� ����
		int c1 = ++a1 * 3 + (a2-- + 2) * 3;
		System.out.println("a1 = "+ a1); 
		System.out.println("a2 = "+ a2);
		System.out.println("c1 = "+ c1);
	}
}
