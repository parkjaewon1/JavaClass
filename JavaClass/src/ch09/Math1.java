package ch09;
public class Math1 {
	public static void main(String[] args) {
//  round : 반올림 : 5이상이면 올리고 4이하면 버림
//  ceil  : 올림 : 현재의 숫자 이상인 정수 중에서 가장 작은 정수
//  floor : 내림 : 현재의 숫자 이하인 정수 중에서 가장 큰 정수
		float f1 = 4.1f, f2 = 4.7f, f3 = -4.1f, f4 = -4.7f;
		System.out.println("f1 = " + Math.round(f1));
		System.out.println("f1 = " + Math.ceil(f1));
		System.out.println("f1 = " + Math.floor(f1));
		System.out.println("f2 = " + Math.round(f2));
		System.out.println("f2 = " + Math.ceil(f2));
		System.out.println("f2 = " + Math.floor(f2));
		System.out.println("f3 = " + Math.round(f3));
		System.out.println("f3 = " + Math.ceil(f3));
		System.out.println("f3 = " + Math.floor(f3));
		System.out.println("f4 = " + Math.round(f4));
		System.out.println("f4 = " + Math.ceil(f4));
		System.out.println("f4 = " + Math.floor(f4));
	}
}