package ch05;
class Car4 {
	String color;	int displacement;	String kind;
// �����ڰ� �ϳ��� ������ compile�� �� �ڵ����� default�����ڸ� ����� �ش�
// default ������ : �Ű������� �ϳ��� ���� ������
	Car4() {	 } // ������
	Car4(String c, int d, String k) {
		color = c; displacement = d; kind = k;
	}
	void print() {
		System.out.println("=====================");
		System.out.println("���� : "+kind);
		System.out.println("��ⷮ : "+displacement);
		System.out.println("���� : "+color);
	}
}
public class Const1 {
	public static void main(String[] args) {
		Car4 c1 = new Car4(); 
		c1.color = "�Ķ�"; c1.displacement=1000; c1.kind="���";	c1.print();
		Car4 c2 = new Car4("���",2000,"�ҳ�Ÿ");
		c2.print();
	}
}