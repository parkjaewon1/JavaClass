package ch16;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileWriter1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("���ϸ��� �Է��ϼ���");
		String fileName = br.readLine();
		System.out.println("������ ������ �Է��ϼ���");
		String content = br.readLine();
		FileWriter fw = new FileWriter(fileName);
		fw.write(content);
		br.close();
		fw.close();
		System.out.println("���α׷� ����");
	}
}