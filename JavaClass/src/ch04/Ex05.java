package ch04;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		do {
			System.out.println("4�ڸ� ������ �Է��ϼ���");
			year = sc.nextInt();
			if (year == 0) break;
			else if (year %4 == 0 && year %100 != 0 || year %400 == 0)
				System.out.println(year+"�� �����Դϴ�");
			else System.out.println(year+"�� ����Դϴ�");
		}while(true);
		sc.close();
		System.out.println("���α׷� ����");
	}
}