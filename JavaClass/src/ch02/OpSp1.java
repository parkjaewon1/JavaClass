package ch02;

public class OpSp1 {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		byte b3 = (byte)(b1 + b2); // ������ ��� b1,b2�� int������ ��ȯ�ȴ�.
		int b4 = b1 + b2 ;  //int�� ���� �ÿ��� ��������
		System.out.println("b3="+b3);
		System.out.println("b4="+b4);
		long l1 = 30;
		int i1 = 20;
		int i2 = (int)(l1 + i1); //long������ �������� ������ ���� �԰��̹Ƿ� ����ȯ���ؾ��Ѵ�.
		long i3 = l1 + i1; // ������ �����͸� �ش�.
	}
}
