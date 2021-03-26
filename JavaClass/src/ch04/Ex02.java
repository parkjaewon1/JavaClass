package ch04;
public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50};
		int sum = 0;
		for (int ar : arr) {
			System.out.print(ar +"\t");
			sum += ar;
		}
		System.out.println("гу╟Х : "+sum);
	}
}