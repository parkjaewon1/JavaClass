package ch02;
public class Oper2 {
	public static void main(String[] args) {
		int i1 = 7, i2 = 8, i3 = 6;
		float f1 = 3.7254f;
		boolean b1 = i1 > i2; // �� �������� ����� boolean��
		boolean b2 = i2 > i3;
		int i4 = (int)f1;     // �Ҽ��� ���ϴ� ����
		String s1 = "" + 2 + 0 + 2 + 1 + "���";
		// 20201������� ��� �Ϸ��� ��� ?
		// b1, b2, i4, s1���
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("i4 = " + i4);
		System.out.println("s1 = " + s1);
	}
}