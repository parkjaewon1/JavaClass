package ch05;
import java.io.IOException;
public class Final2 {
	public static void main(String[] args) throws IOException {
		final int CIRCLE = 1;
		final int RECTANGLE = 2;
		final int TRIANGLE = 3;
		System.out.println("���� 1,2,3�߿� �ϳ��� �Է��ϼ���");
		int num = System.in.read() - '0';
		if (num == CIRCLE) System.out.println("���Դϴ�");
		else if (num == RECTANGLE) System.out.println("�簢�� �Դϴ�");
		else if (num == TRIANGLE) System.out.println("�ﰢ�� �Դϴ�");
		else System.out.println("1 �Ǵ� 2 �Ǵ� 3�� �ƴմϴ�");
	}
}