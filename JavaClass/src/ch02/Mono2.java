package ch02;

public class Mono2 {
	public static void main(String[] args) {
		int a1 = 5, a2 = 5;
		// a1은 1증가, a2는 1감소
		// ++나 --이 뒤에 있는 경우는 연산 종료 후에 반영
		// c1 = 6 * 3 + (5 + 2) * 3 => 18+21=> 39
		// 위의 계산이 종료한 후에 a2값이 감소
		int c1 = ++a1 * 3 + (a2-- + 2) * 3;
		System.out.println("a1 = "+ a1); 
		System.out.println("a2 = "+ a2);
		System.out.println("c1 = "+ c1);
	}
}
