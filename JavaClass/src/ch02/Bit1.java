package ch02;

public class Bit1 {
	public static void main(String[] args) {
		int num1 = 10;  // 0000000000001010
		int num2 = 6;   // 0000000000000110
//      &                  0000000000000010 2^0*0+2^1*1 = 2
//      |                  0000000000001110 2^0*0+2^1*1+2^2*1+2^3*1 = 14
//      ^                  0000000000001100	2^0*0+2^1*0+2^2*1+2^3*1 = 12	
//		System.out.println("num1 + num = "+(num1+num2));
		System.out.println("num1 & num = "+(num1&num2));
		System.out.println("num1 | num = "+(num1|num2));
		System.out.println("num1 ^ num = "+(num1^num2));
	}
}
