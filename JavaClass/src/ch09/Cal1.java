package ch09;

import java.util.*;

public class Cal1 {
	public static void main(String[] args) {
		Calendar cal =  Calendar.getInstance();
			// ���� 0���� �̹Ƿ� +1�ؾ��Ѵ�.
			System.out.printf("������ %d�� %d�� %d�� �Դϴ�\n",
					cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE));
			System.out.println(cal.get(Calendar.DAY_OF_MONTH));
			// 1�� �߿� ����
			System.out.println(cal.get(Calendar.DAY_OF_YEAR));
			
			Date date = new Date();
			System.out.println(date);
	}

}