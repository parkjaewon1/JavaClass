package ch04;
public class ArrCpy1 {
	public static void main(String[] args) {
		int[] arr1 = { 34, 56, 67, 88};
		int[] arr2 = arr1; // �ּҸ� ������ �� ��
		arr1[0] = 77; // arr1�� �ٲ�� arr2�� ��� �ɱ�� ? ���� ����
		for(int ar : arr1) {
			System.out.print(ar+"\t");
		}
		System.out.println();
		for(int ar : arr2) {
			System.out.print(ar+"\t");
		}
	}
}