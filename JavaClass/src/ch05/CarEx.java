package ch05;
public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car(); // ��ü ����� ���� ����
	//  Ŭ������ ��ü��(���۷�����)	
		Car yourCar; // ��ü ����
		yourCar = new Car(); // ��ü ����
	//  ���� ��ü�� ������ �Ŀ� : ���۷�����.�������;  ���۷���������.�޼����()
		myCar.name = "�ҳ�Ÿ"; myCar.color = "��ũ"; 	myCar.displacement = 1500;
		System.out.println("myCar �̸� : "+myCar.name);
		System.out.println("myCar ���� : "+myCar.color);
		System.out.println("myCar ��ⷮ : "+myCar.displacement);
		myCar.speedUp();
		yourCar.name = "����Ÿ" ;yourCar.color = "����"; 	yourCar.displacement = 3000;
		System.out.println("yourCar �̸� : "+yourCar.name);
		System.out.println("yourCar ���� : "+yourCar.color);
		System.out.println("yourCar ��ⷮ : "+yourCar.displacement);
		yourCar.stop();
	}
}