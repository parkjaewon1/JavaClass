package ch06;

class C2 {
	public void m1(int x, int y) {
		// ������ ��ȯ
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}

public class CallByValue2 {

	public static void main(String[] args) {

		C2 a1 = new C2();
		int x = 10, y = 20;
		a1.m1(x, y);  // a1.m1(10,20); �Լ� m1�� ȣ�� �Ҷ� ���� ����
		System.out.println("x= " + x);
		System.out.println("y= " + y);

	}

}