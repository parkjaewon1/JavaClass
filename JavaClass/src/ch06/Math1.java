package ch06;
class A1 {
// 반환형 메서드명  매개변수      
	void add(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y,x+y);
	}
//  접근 지정자
	public void prn() { // 선언부
		System.out.println("선거인가"); // 구현부
	}
}
public class Math1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.prn();
		// 여러 번 반복되는 작업을 값을 받아서 처리
		a1.add(12, 5);
		a1.add(10, 2);
		a1.add(25, 6);
	}
}