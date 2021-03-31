package ch06;
public class Add2 {	
	public static void main(String[] args) {
		int result = add(10, 20);
		System.out.println("결과 : "+ result);
		System.out.println("결과 : " + add(10.5, 7.3));
	}
	private static double add(double d, double e) {
		return d + e;
	}
	private static int add(int i, int j) {
		return i + j;
	}
}