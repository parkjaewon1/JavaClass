package ch03;
import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0 ;
		do {
			System.out.println("������ �Է��ϼ���");
			num = sc.nextInt();
			System.out.println("�Է��� ���ڴ�"+num+"�Դϴ�.");
		}while(num !=0);
		System.out.println("���α׷� ����");
		sc.close();
	}

}
