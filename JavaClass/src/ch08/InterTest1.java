package ch08;

class D1 {
	void m1(E2 d) {
		d.b1();
	}

	void m1(E3 d) {
		d.b1();
	}
}

class D2 {
	void b1() {
		System.out.println("대박");
	}
}

class D3 {
	void b1() {
		System.out.println("쪽박");
	}
}

public class InterTest1 {
	public static void main(String[] args) {
		E2 d2 = new E2();
		E1 d1 = new E1();

		d1.m1(d2);

		E3 d3 = new E3();

		d1.m1(d3);
	}
}
