package ch11;

public interface Car {
	void print();
}

class Bus implements Car{
	public void print() {
		System.out.println("����");
	}
	void move() {
		System.out.println("40���� ź��");
	}
}
class Taxi implements Car{
	public void print() {
		System.out.println("�ý�");
	}
}
class FireEngine implements Car{
	public void print() {
		System.out.println("�ҹ���");
	}
}
class Ambulance{
	public void print() {
		System.out.println("�ں深��");
	}
}