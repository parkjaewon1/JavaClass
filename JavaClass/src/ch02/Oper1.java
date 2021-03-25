package ch02;

public class Oper1 {
	public static void main(String[] args) {
		// %는 나머지 
		int i1 = 7, i2 = 5, i3 = 7;
		int c1 = ((i1+2) * 3) % 6 + (i2++ +2) * 2 + --i3;
		// ((9)*3)%6 + (7)*2 - 6 => 27%6+14+6=> 3 + 14 + 6 => 23
		System.out.println("i1 = " + i1); // 7
		System.out.println("i2 = " + i2); // 6
		System.out.println("i3 = " + i3); // 6
		System.out.println("c1 = " + c1);
	}
}