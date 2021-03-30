package ch05;
public class Car2Ex {
	public static void main(String[] args) {
//     클래스 객체(레퍼런스)명 생성자() 생성자는 클래스 이름이 같고 뒤에 () 붙는다
		Car2 car1 = new Car2();
		Car2 car2 = new Car2();
		car1.name = "소나타"; car1.displacement=1500;
		car2.color = "핑크"; car2.displacement = 3000;
		car1.print();
		car2.print();
	}
}