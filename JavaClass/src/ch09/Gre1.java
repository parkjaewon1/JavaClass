package ch09;

import java.util.GregorianCalendar;

public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();  // Calendar�߻� Ŭ����
		// ���� 0�� ... 11�� �̹Ƿ� 1�� �߰�
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�\n", 
			cal.get(GregorianCalendar.YEAR), cal.get(GregorianCalendar.MONTH)+1,cal.get(GregorianCalendar.DATE));
		System.out.println(cal.get(GregorianCalendar.DAY_OF_MONTH));
		// 31 + 28 + 31 + 6 : 1�� �߿� �� ��
		System.out.println(cal.get(GregorianCalendar.DAY_OF_YEAR));
	}
}
