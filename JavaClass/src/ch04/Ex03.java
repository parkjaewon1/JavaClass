package ch04;
public class Ex03 {
	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5}, {10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20}, {30, 30, 30, 30, 30}};
		// 각 행별로 출력하고 합계, 전체 합계
		int sum = 0, tot = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				sum += arr[i][j];
				tot += arr[i][j];
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("합계 : "+sum);
			sum = 0;
		}
		System.out.println("총 계 : "+tot);
	}
}