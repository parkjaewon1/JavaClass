package ch04;
public class SecArr1 {
	public static void main(String[] args) {
		// 4�� 3��
		int sum = 0;
		int[][] arr = {{1, 2,  3}, {3, 4,  6},  {23,56,67}, {12, 4, 6}};
		for(int i = 0; i < arr.length;i++) {
			for (int j = 0; j < arr[i].length ; j++) { // ��ȿ� �ִ� ���� ����
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
			}
			System.out.println("�� : "+sum);
			sum = 0;
		}
		System.out.println("=======================");
		for(int[] ar : arr) {
			for (int a : ar) { 
				System.out.print(a + "\t");
				sum += a;
			}
			System.out.println("�� : "+sum);
			sum = 0;
		}
	}
}