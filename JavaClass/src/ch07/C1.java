package ch07;
public class C1 {
	String c1 = "���";
	C1() {	System.out.println("���� �Ҿƹ��� ������");	}
	void c11( ) {	System.out.println("�� �Ҿƹ��� �޼���");	}
}
class C2 extends C1 {
	int c2 = 56;
	C2() {
		System.out.println("���� �ƹ��� ������");
	}
	void c21( ) {
		System.out.println("�� �ƹ��� �޼���");
	}
}
class C3 extends C2 {
	int c3 = 77;
	C3() {
		System.out.println("���� �ڽ� ������");
	}
	void c31( ) {
		System.out.println("�� �ڽ� �޼���");
	}
}