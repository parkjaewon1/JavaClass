package ch07;
public class Car3Ex {
	public static void main(String[] args) {
//		FireEngine3 fe = new Car3(); // 범위가 작은 곳에 큰 것을 넣을 수 업다
//		부모를 선언  = 자식을 생성 up casting
		Car3 car1 = new FireEngine3();
		Car3 car2 = new Ambulance3();
		Car3 car3 = new Bus3();
//		부모를 선언하고 자식을 대입하면 부모가 가지고 있는 메서드와 멤버변수만 사용 가능
//		실제로 실행되는 메서드는 자식 메서드
		car1.drive(); car2.drive(); car3.drive(); // car1.fire();
		System.out.println("==================");
		Car3[] cars = {car1, car2, car3};
		for (Car3 car : cars) {
			if (car instanceof FireEngine3) { // 인스탄스 실제 불자동차 타입인지 확인
	//			FireEngine3 fe = (FireEngine3)car; // car1은 실행되지만 나머지는 에러
	//			fe.fire();
				((FireEngine3)car).fire();
				System.out.println(car.color);
			}
//			멤버변수는 실제로 실행되는 부모변수 값
			System.out.println(car.color);
			car.drive();
		}
		System.out.println("==================");
		Car3[] car = {car1, car2, car3};
		for (int i = 0; i < car.length;i++) {
			car[i].drive();
		}
	}
}