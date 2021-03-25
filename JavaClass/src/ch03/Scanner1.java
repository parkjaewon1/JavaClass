package ch03;

import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("문자열을 입력하시오");
			str = sc.nextLine();
			System.out.println("입력한 문자는"+str+"입니다");
		}while(!str.equals("x"));
		sc.close();
	}

}
