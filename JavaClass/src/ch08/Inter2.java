package ch08;

interface B1{
	int K1 = 10;
	void mi();
}
interface B2 extends B1{  //interface ������ implements�� �ƴ� extends
	void m2();
}
interface B3 {
	void m3();
}
interface B4 extends B2,B3{ //interface�� ���߻�� ����.
	void m4();
}
class B5 implements B4{

	public void m2() {
		System.out.println("�̰ǹ���");
	}
	public void mi() {
		System.out.println("��Ǹ��");
	}
	public void m3() {
		System.out.println("�㰢,���,���");
	}
	public void m4() {
		System.out.println("�ֺҷ�");
	}
	
}

public class Inter2 {
	public static void main(String[] args) {
		B5 b5 =new B5();
		b5.mi();
		b5.m2();
		b5.m3();
		b5.m4();
		System.out.println("K1 = "+b5.K1);
	}
}
