package ch05;
public class Car2 {
	String carNo; // ������ȣ
	int inTime;   // �����ð�
	int outTime;  // �����ð�
	int fee;      // �������
	final int MONEYPERHOUR = 5000; // �ð��� ���, ����
	Car2(String c, int in, int out) {
		carNo = c; inTime = in; outTime = out;
	}
	void calFee() {
		fee = (outTime - inTime) * MONEYPERHOUR;
	}
	void print() {
		System.out.println("================");
		System.out.println("������ȣ : "+ carNo);
		System.out.println("�����ð� : "+inTime);
		System.out.println("�����ð� : "+outTime);
		System.out.println("������� : "+fee);
	}
}