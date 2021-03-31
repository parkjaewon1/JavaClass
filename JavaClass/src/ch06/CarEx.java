package ch06;

class Car{
	String kind;
	int displacement;
	String color;
	
	public Car() {}
	public Car(String kind,int displacement,String color){
		this.kind=kind;
		this.displacement=displacement;
		this.color=color;
	}
	void print() {
		System.out.println("�� ���� "+kind+"�̰� ������ "+displacement+"�̰� ������ "+color+"�Դϴ�.");
	}
}

public class CarEx{
	public static void main(String[] args) {
		Car c1 =new Car("�ҳ�Ÿ",1500,"����");
		Car c2 =new Car("����",2000,"�ʷ�");
		Car c3 =new Car("���",1200,"���");
		
		c1.print();
		c2.print();
		c3.print();
	}
}
