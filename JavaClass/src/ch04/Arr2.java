package ch04;
public class Arr2 {
	public static void main(String[] args) {
		int i1 = 7; // �⺻���� �ʱ�ȭ ���� ������ ����
		System.out.println("i1 = " + i1);
		int[] i2 = new int[5]; // ���ڴ� 0���� �ʱ�ȭ
		i2[0] = 7; i2[1] = 27; i2[2] = 782; i2[3] =4; i2[4] = 999;
		for (int j = 0; j < i2.length; j++) {
			System.out.println("i2["+j+"] = "+i2[j]); // ��� ������[�ε���]
		}
	}
}