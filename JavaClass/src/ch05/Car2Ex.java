package ch05;
public class Car2Ex {
	public static void main(String[] args) {
//     Ŭ���� ��ü(���۷���)�� ������() �����ڴ� Ŭ���� �̸��� ���� �ڿ� () �ٴ´�
		Car2 car1 = new Car2();
		Car2 car2 = new Car2();
		car1.name = "�ҳ�Ÿ"; car1.displacement=1500;
		car2.color = "��ũ"; car2.displacement = 3000;
		car1.print();
		car2.print();
	}
}