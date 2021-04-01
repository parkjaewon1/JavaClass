package ch07;

class B {
	int age = 20;
	void b() {
		System.out.println("대박");
	}
}
class B1 extends B{
	String hobby = "놀기";
	void b1() {System.out.println("봄날이야");}
}
class B2 extends B1{
	String part = "청소";
	void b2() {System.out.println("마지막시간");}
}

public class Inher2 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		System.out.println("나이는 : "+b1.age);
		System.out.println("취미는 : "+b1.hobby);
		b1.b(); b1.b1();
		
		B2 b2 =new B2();
		System.out.println("나이는 : "+b2.age);
		System.out.println("취미는 : "+b2.part);
		b2.b(); b2.b2();
	}

}
