package ch05;
// ������ Ŭ������ �̸��� ����, �����ڸ� ������ �� ���� �Ű����� ������ �ٸ��ų� ������ ���� �޶�� �Ѵ�
class A3 {  // �����ڴ� ��ȯ���� ����
	public A3() { 	System.out.println("�Ű������� ���� ������");	}
	A3(int x) {	System.out.println("�Ű������� ���� : "+x);	}
	A3(String a) {	System.out.println("�Ű������� ���� : "+a);	}
	A3(int x, int y) {	System.out.println("�Ű������� ���� 2�� x="+x+", y="+y); 	}
	void print() {
		System.out.println("��� ���");
	}
}
public class Const2 {
	public static void main(String[] args) {
		A3 a1 = new A3();
		A3 a2 = new A3(10);
		A3 a3 = new A3("���");
		A3 a4 = new A3(10, 20);
		a1.print(); a2.print(); a3.print(); a4.print();
	}
}