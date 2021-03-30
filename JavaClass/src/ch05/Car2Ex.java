package ch05;
public class Car2Ex {
	public static void main(String[] args) {
		Car2 car1 = new Car2("°¡ 1234",10,13);
		Car2 car2 = new Car2("³ª 3456",9,18);
		Car2 car3 = new Car2("´Ù 6789",11,16);
		
		car1.calFee();
		car2.calFee();
		car3.calFee();
		
		car1.print();
		car2.print();
		car3.print();
	}
}