package ch03;
import java.util.Scanner;
public class For10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("������� �������� ?");
			num = sc.nextInt();
			if (num >= 2 && num <=9) {
				System.out.println("������ "+num+"��");
				for(int i =1; i <=9;i++) {
					System.out.printf("%d * %d = %d\n", num, i, num*i);
				}
			} else System.out.println("������ ���ڰ� �ƴմϴ�");
		}while(num != 0);
		System.out.println("���α׷� ����");
		sc.close();
	}
}