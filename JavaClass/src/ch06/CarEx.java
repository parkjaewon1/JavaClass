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
		System.out.println("차 종은 "+kind+"이고 가격은 "+displacement+"이고 색상은 "+color+"입니다.");
	}
}

public class CarEx{
	public static void main(String[] args) {
		Car c1 =new Car("소나타",1500,"빨강");
		Car c2 =new Car("벤츠",2000,"초록");
		Car c3 =new Car("모닝",1200,"노랑");
		
		c1.print();
		c2.print();
		c3.print();
	}
}
