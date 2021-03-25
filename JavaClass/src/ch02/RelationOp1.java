package ch02;
public class RelationOp1 {
	public static void main(String[] args) {
		int i1 = 10, i2 = 20;
		boolean b1 = i1 == i2; // 비교 연산자의 결과는 true or false
		System.out.println("b1 = " + b1);
		b1 = i1 != i2;
		System.out.println("b1 = " + b1);
		b1 = i1 > i2;
		System.out.println("b1 = " + b1);
		b1 = i1 >= i2;
		System.out.println("b1 = " + b1);
		b1 = i1 < i2;
		System.out.println("b1 = " + b1);
		b1 = i1 <= i2;
		System.out.println("b1 = " + b1);
	}
}