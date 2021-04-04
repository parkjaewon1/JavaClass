package ch08;
//class 앞에 final하면 상속할 수 있다.
//public final class Parent{

public class Parent {
	int a= 7;
	final int B=8;
	void m1() {
		System.out.println("대박");
	}
	final void m2() {
		System.out.println("난 Final");
	}
}

class Child extends Parent{
	void m1() {   //m2()는 final이라 불가능
		System.out.println("재정의 대박");
	}
}
