package ch06;
class B1 {
	static void multiply( int x, int y) {
		System.out.printf("%d * %d = %d\n",x,y,x*+y);
	}
}
public class Add1 {
	void add(int x, int y) {
		System.out.printf("%d + %d = %d\n",x,y,x+y);
	}
	static void minus(int x, int y) {
		System.out.printf("%d - %d = %d\n",x,y,x-y);
	}
	public static void main(String[] args) {
		Add1 a1 = new Add1();
		a1.add(10, 20); // main���� ����� ���� �ݵ� ��ü�� �����ϰ� ���
		Add1.minus(12, 4); 
// ����Ϸ��� Ŭ������� main(����)���� �ִ� Ŭ������ ���� ��쿡�� ���� ���� 
		minus(17, 6); 
		B1.multiply(12, 7);
	}
}