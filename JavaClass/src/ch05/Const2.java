package ch05;
// 생성자 클래스와 이름이 같음, 생성자를 여러개 인 경우는 매개변수 갯수가 다르거나 데이터 형이 달라야 한다
class A3 {  // 생성자는 반환형이 없음
	public A3() { 	System.out.println("매개변수가 없는 생성자");	}
	A3(int x) {	System.out.println("매개변수가 숫자 : "+x);	}
	A3(String a) {	System.out.println("매개변수가 문자 : "+a);	}
	A3(int x, int y) {	System.out.println("매개변수가 숫자 2개 x="+x+", y="+y); 	}
	void print() {
		System.out.println("대박 사건");
	}
}
public class Const2 {
	public static void main(String[] args) {
		A3 a1 = new A3();
		A3 a2 = new A3(10);
		A3 a3 = new A3("허걱");
		A3 a4 = new A3(10, 20);
		a1.print(); a2.print(); a3.print(); a4.print();
	}
}