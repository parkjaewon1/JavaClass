package ch02;
public class Oper2 {
	public static void main(String[] args) {
		int i1 = 7, i2 = 8, i3 = 6;
		float f1 = 3.7254f;
		boolean b1 = i1 > i2; // 비교 연산자의 결과는 boolean형
		boolean b2 = i2 > i3;
		int i4 = (int)f1;     // 소숫점 이하는 절사
		String s1 = "" + 2 + 0 + 2 + 1 + "대박";
		// 20201대박으로 출력 하려면 어떻게 ?
		// b1, b2, i4, s1출력
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("i4 = " + i4);
		System.out.println("s1 = " + s1);
	}
}