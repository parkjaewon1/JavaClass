package ch06;

class E1{
	int x,y;
	void m1(int a1, int a2) {
		a1+=10;
		a2+=10;
		System.out.println("x = "+a1+", y = "+a2);
		
	}
	void m2(E1 e) {
		e.x +=10;
		e.y +=10;
		System.out.println("e.x = "+e.x+", e.y = "+e.y);
	}
}

public class CallTest1 {
	public static void main(String[] args) {	
		E1 e1 = new E1();
		int x= 8, y=12;
		e1.m1(x, y); // CallByValue�� ���� �����ϹǷ� ������ ���� �ٸ� ������ �����Ѵ�.
		System.out.println("x = "+x+", y = "+y);
		
		e1.x =8; e1.y =12;
		e1.m2(e1);  // CallByReference�� �ּҸ� �����ϹǷ� �ּҿ� �ִ� ���� ���� ���� �����Ѵ�.
		System.out.println("e.x = "+e1.x+", e.y = "+e1.y);
	
		
	}
	
}
