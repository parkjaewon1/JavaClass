package ch17;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class Url1 {
	public static void main(String[] args) throws MalformedURLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("URL�� �Է��ϼ���");
		String str = sc.nextLine();
		URL url = new URL(str);
		System.out.println("�������� : "+url.getProtocol());
		System.out.println("ȣ��Ʈ : "+url.getHost());
		System.out.println("��Ʈ : "+url.getPort());
		System.out.println("���ϰ�� : "+url.getFile());
		sc.close();
	}
}
