package ch03;

import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("���ڿ��� �Է��Ͻÿ�");
			str = sc.nextLine();
			System.out.println("�Է��� ���ڴ�"+str+"�Դϴ�");
		}while(!str.equals("x"));
		sc.close();
	}

}
