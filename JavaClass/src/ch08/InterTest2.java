package ch08;

interface E{
	void b1();
}
class E1 {
	//�������̽��� ���ؼ� ����ϸ� Ŭ���� E2 �Ǵ� E3�� ���� �����ϴ� �޼ҵ尡 �ϳ��� ��������.
	//����Ŭ������ InterTest2�� �����ϴ� E2,E3 �۷����� ���ᷡ �ִ� ���� �������̽� E�̴�.
	// ���յ��� �����ϰ� ���ִ� ����̴�. (loosely coupled)
	void m1(E d) {
		d.b1();
	}
}

class E2 implements E {
	public void b1() {
		System.out.println("���");
	}
}

class E3 implements E{
	public void b1() {
		System.out.println("�ʹ�");
	}
}

public class InterTest2 {
	public static void main(String[] args) {
		E2 d2 = new E2();
		E1 d1 = new E1();
		E3 d3 = new E3();

		d1.m1(d2);


		
	}
}

