package ch09;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
public class SImpleDate2 {
	public static void main(String[] args) {
//		2013�� 3�� 5�� 12�� 25�� 30�� ����
		GregorianCalendar gc = new GregorianCalendar(2013,2,5,12,25,30);
//		�⵵ 2�ڸ� - ��2 - �� ��:��:��
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
//		(����)�⵵ 4�ڸ�/��/�� (����/����)��:��:�� 
		SimpleDateFormat sdf2 = 
				new SimpleDateFormat("(E)yyyy/MM/dd (a)hh:mm:ss");
		Date date = gc.getTime();
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
	}
}