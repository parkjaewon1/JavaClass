package ch05;
public class Car { // 클래스 헤더, 선언부
	String color;     // 멤버변수, 필드, 속성
	int displacement; //   "  는 초기화하지 않으면 숫자는 0, 문자는 null로 초기화
	String name;
	void speedUp() {  // void(반환형) 메서드명() , 메서드 헤더, 메섣 선언부
		System.out.println("속도를 내고 달린다"); // 구현부
	}
	void stop() {
		System.out.println("차를 멈춘다");
	}
}