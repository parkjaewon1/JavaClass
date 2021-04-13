package ch17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class URLConn1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("URL�� �Է� �ϼ���");
		String addr = sc.nextLine();
		URL url = new URL(addr); // ���ͳ� �ּ� ����
		URLConnection uc = url.openConnection();  // ���ͳ� ����
		InputStream is = uc.getInputStream();
		// ���پ� �ϰ� ó��, utf-8�ѱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
		String str = null;
		while(true) {
			str = br.readLine();
			if (str == null) break;
			System.out.println(str);
		}
		is.close(); br.close(); sc.close();
	}
}