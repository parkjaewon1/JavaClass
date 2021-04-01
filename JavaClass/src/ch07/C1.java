package ch07;
public class C1 {
	String c1 = "대박";
	C1() {	System.out.println("내가 할아버지 생성자");	}
	void c11( ) {	System.out.println("난 할아버지 메서드");	}
}
class C2 extends C1 {
	int c2 = 56;
	C2() {
		System.out.println("내가 아버지 생성자");
	}
	void c21( ) {
		System.out.println("난 아버지 메서드");
	}
}
class C3 extends C2 {
	int c3 = 77;
	C3() {
		System.out.println("내가 자식 생성자");
	}
	void c31( ) {
		System.out.println("난 자식 메서드");
	}
}