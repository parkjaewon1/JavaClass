package ch07;
public class D1 {
	String str1 = "허걱";
	 D1() {	 System.out.println("내가 대장이야");	 }
	 void m1( ) {	 System.out.println("내가 첫번째 메서드");	 }
}
class D2 extends D1 {
	String str2 = "허각";
	D2() {
		System.out.println("내가 중간보스");
	}
	void m2() {
		System.out.println("내가 중간 메서드");
	}
}
class	D3 extends D2 {
	String str3 = "허공";
	D3() {
		System.out.println("내가 막내");
	}
	void m3() {
		System.out.println("막내 메서드");
	}
}
