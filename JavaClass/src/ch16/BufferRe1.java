package ch16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferRe1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("�̸��� �Է��ϼ���");
		String name = br.readLine();
		System.out.println("�ּҸ� �Է��ϼ���");
		String addr = br.readLine();
		System.out.println(name+"�� �ݰ�����, "+addr+"�� ��ô� ����");
		br.close();
	}
}