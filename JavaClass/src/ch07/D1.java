package ch07;
public class D1 {
	String str1 = "���";
	 D1() {	 System.out.println("���� �����̾�");	 }
	 void m1( ) {	 System.out.println("���� ù��° �޼���");	 }
}
class D2 extends D1 {
	String str2 = "�㰢";
	D2() {
		System.out.println("���� �߰�����");
	}
	void m2() {
		System.out.println("���� �߰� �޼���");
	}
}
class	D3 extends D2 {
	String str3 = "���";
	D3() {
		System.out.println("���� ����");
	}
	void m3() {
		System.out.println("���� �޼���");
	}
}
