package ch08;
// �޼��� �߿� �ϳ��� �߻� �޼��尡 ������ �߻�Ŭ�������� �Ѵ�
public abstract class Shape2 {
	void print() { // �Ϲ� �޼���  �����
		System.out.println("��� ���"); // ������
	}
	abstract void computeArea(); // ����θ� �ְ� �����ΰ� ���� �޼���
}
class Circle2 extends Shape2 {
	void computeArea() { // �߻�޼��� �ݵ�� ������ �ؾ��Ѵ�
		System.out.println("���� ���� : 3.14 * ������ * ������");
	}	
}
class Rectangle2 extends Shape2 {
	void computeArea() {
		System.out.println("�簢����  ���� : ���� * ����");		
	}	
}
class Triangle2 extends Shape2 {
	void computeArea() {
		System.out.println("�ﰢ����  ���� : ���� * ���� / 2");		
	}	
}