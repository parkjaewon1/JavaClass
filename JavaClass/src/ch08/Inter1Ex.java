package ch08;

interface A1{ // ��ü �����Ұ�
	int K = 7; // ������� public static final
	void m1(); // ��� �޼ҵ� public abstract�� ����
	void m2();
}
class A2 implements A1{ // implements �����ϴ�
	public void m1() {
		System.out.println("�ݿ���");
	}
	public void m2() {
		System.out.println("�� ��ǽð�");
	}
}

public class Inter1Ex {
	public static void main(String[] args) {
		A1 a1 = new A2(); // ������ �ȵ����� ������ ����.
		A2 a2 = new A2();
		a1.m1();
		a2.m2();
	//	a1.K =12 ; �������. 4�ٿ��� final�� �����Ǿ� �ֱ� ������
		System.out.println("K = "+a1.K);
		System.out.println("K = "+A1.K);
	}
}
