package ch08;
public abstract class Car {
	abstract void move();
}
class Ambulance extends Car {
	void move() {
		System.out.println("ȯ�ڸ� �ư� �޸���");		
	}	
}
class FireEngine extends Car {
	void move() {
		System.out.println("���̷��� �︮�� �޸���");		
	}
}
class Bus extends Car {
	void move() {
		System.out.println("�°��� �ư� �޸���");		
	}
	void inwon() {
		System.out.println("������ 40���̾�");
	}
}