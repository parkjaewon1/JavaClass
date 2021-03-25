package ch03;


import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str ="";
		int num = 0 ;
		do {
			System.out.println("정수를 입력하세요");
			num = Integer.parseInt(sc.nextLine());
			System.out.println("입력한 숫자는"+num+"입니다.");
			System.out.println("문자열을 입력하세요");
			str = sc.nextLine();
			System.out.println("입력한 문자는"+str+"입니다.");
			if(str.equals("x"))
				break;
		}while(true);
		System.out.println("프로그램 종료");
		sc.close();
	}

}
