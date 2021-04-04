package ch08;

interface A1{ // 객체 생성불가
	int K = 7; // 멤버변수 public static final
	void m1(); // 모든 메소드 public abstract가 생략
	void m2();
}
class A2 implements A1{ // implements 구현하다
	public void m1() {
		System.out.println("금요일");
	}
	public void m2() {
		System.out.println("곧 퇴실시간");
	}
}

public class Inter1Ex {
	public static void main(String[] args) {
		A1 a1 = new A2(); // 생성은 안되지만 선언은 가능.
		A2 a2 = new A2();
		a1.m1();
		a2.m2();
	//	a1.K =12 ; 변경금지. 4줄에는 final이 생략되어 있기 때문에
		System.out.println("K = "+a1.K);
		System.out.println("K = "+A1.K);
	}
}
