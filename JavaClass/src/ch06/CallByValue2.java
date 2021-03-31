package ch06;

class C2 {
	public void m1(int x, int y) {
		// 데이터 교환
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}

public class CallByValue2 {

	public static void main(String[] args) {

		C2 a1 = new C2();
		int x = 10, y = 20;
		a1.m1(x, y);  // a1.m1(10,20); 함수 m1을 호출 할때 값을 전달
		System.out.println("x= " + x);
		System.out.println("y= " + y);

	}

}