package ch05;
class B2 {
	static int[] i1 = new int[10];
	static { // Ŭ���� ���� �ʱ�ȭ��, ó�� Ŭ������ ����� �� �ѹ��� ����
		for(int i =0; i < i1.length;i++) {
			i1[i] = (int)(Math.random()*20) + 1;
		}
	}
}
public class StaticInit1 {
	public static void main(String[] args) {
		for (int i = 0; i < B2.i1.length; i++) {
			System.out.println("i1["+i+"] = "+B2.i1[i]);
		}
		System.out.println("=============");
		B2 b1 = new B2();
		for (int i = 0; i < B2.i1.length; i++) {
			System.out.println("i1["+i+"] = "+b1.i1[i]);
		}
		System.out.println("=============");
		B2 b2 = new B2();
		for (int i = 0; i < B2.i1.length; i++) {
			System.out.println("i1["+i+"] = "+b2.i1[i]);
		}
	}
}