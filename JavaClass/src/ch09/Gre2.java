package ch09;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Gre2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();
		do {
			System.out.println("�⵵ 4�ڸ��� �Է��ϼ���");
			int year = sc.nextInt();
			if (year == 0) break;
			if (gc.isLeapYear(year)) System.out.println("�����Դϴ�");
			else System.out.println("����Դϴ�");
		}while(true);
		System.out.println("���α׷� ����");
		sc.close();
	}
}
