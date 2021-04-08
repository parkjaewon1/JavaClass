package ch11;

import java.util.ArrayList;

public class Gene2 {

	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Bus());
		list.add(new Taxi());
		// list.add(new Ambulance()); Generic 클래스를 사용하면 그 클래스 또는 상속받은 클래스, 구현한 클래스만
		// 사용가능.
		list.add(new FireEngine());
		
		for(Car car:list) {
			car.print();
			if(car instanceof Bus) {
				((Bus)car).move();
			}
		}
	}

}
