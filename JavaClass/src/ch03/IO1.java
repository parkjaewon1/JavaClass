package ch03;

import java.io.IOException;

public class IO1 {

	public static void main(String[] args) throws IOException {
		System.out.println("���� ���ڸ��� �Է��ϼ���");
		int num = System.in.read() -'0'; // �Է°��� �ƽ�Ű�ڵ�� ��µǹǷ� '0'(48)�� �ؾ���.
		System.out.println("�Է��� ����:"+num);

	}

}
