package ch03;

import java.io.IOException;

public class Do7 {

	public static void main(String[] args) throws IOException {
		int num = 0;
		int i = 1;
		do {
			System.out.println("������ ���� �Է�");
			num = System.in.read() - '0';
			System.in.read();  // CR\ró��
			System.in.read();  // LF\nó��
			if (num == 1) System.out.println("������ ���ڰ� �ƴմϴ�.");
			else if (num >=2 && num <=9)
				do {
					System.out.printf("%d * %d = %d\n", num, i, num * i);
					i++;
				} while (i <= 9);
			
			i = 1;
		} while (num != 0);  //0�� �ƴϸ� �ٽ� �����ϰ� 0�̸� ����

		System.out.println("���α׷� ����");

	}
}
