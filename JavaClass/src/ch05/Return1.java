package ch06;
class B2 {
	int add(int x, int y) {
		return x + y;		
	}
}
public class Return1 {
	public static void main(String[] args) {
		B2 b2 = new B2();
		System.out.println(b2.add(12, 3));   // add한 결과가 현재 호출한 곳에 반환된다
		int k = b2.add(10, 7);
		System.out.println("k = " + k);
	}
}