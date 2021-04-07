package ch10;

import java.util.Scanner;

public class Except2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		while (true) {
			System.out.println("ù��° ���ڸ� �Է��ϼ���");
			String str = sc.nextLine();
			if (str.equals("x"))
				break;
			// try catch�� ����ó���ϸ� �� ��츦 �����ϰ� ��� �����Ѵ�.
			try {
				num1 = Integer.parseInt(str);
				System.out.println("�ι�° ���ڸ� �Է��ϼ���");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			}catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� ������ �� ���� �����Դϴ�.");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("���α׷�����");
		sc.close();
	}
}