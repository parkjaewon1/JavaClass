package ch03;


import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str ="";
		int num = 0 ;
		do {
			System.out.println("������ �Է��ϼ���");
			num = Integer.parseInt(sc.nextLine());
			System.out.println("�Է��� ���ڴ�"+num+"�Դϴ�.");
			System.out.println("���ڿ��� �Է��ϼ���");
			str = sc.nextLine();
			System.out.println("�Է��� ���ڴ�"+str+"�Դϴ�.");
			if(str.equals("x"))
				break;
		}while(true);
		System.out.println("���α׷� ����");
		sc.close();
	}

}
