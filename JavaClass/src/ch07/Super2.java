package ch07;
class F1 {
	int x = 1000;
	void display() {	System.out.println("�θ� �޼����Դϴ�");	}
}
class F2 extends F1 {
	int x = 2000;
	void display() {	System.out.println("�ڽ� �޼����Դϴ�");	}
	void print() {
		display();
		super.display();
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
	}
}
public class Super2 {
	public static void main(String[] args) {
		F2 f2 = new F2(); // �̸��� ������ : F2�� ����� �� �� �ڽİ� ���
		System.out.println("x = " + f2.x);
		f2.display();
		f2.print();
	}
}