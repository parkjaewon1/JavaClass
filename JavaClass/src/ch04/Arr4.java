package ch04;
public class Arr4 {
	public static void main(String[] args) {
//		int[] a = new int[] {34, 78, 99, 56, 66};
		int[] a = {34, 78, 99, 56, 66}; // ���� �迭 5���� �����ϰ� �� ����
		for(int i = 0; i < a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("========================");
		// �迭���� �ϳ��� �����Ͽ� ������ �ְ� ���� ���� ���
		for (int i : a) {
			System.out.println(i);
		}
	}
}