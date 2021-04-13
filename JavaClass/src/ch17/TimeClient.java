package ch17;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class TimeClient {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ip�� �Է��ϼ���");
		String ip = sc.nextLine();
		Socket client = new Socket(ip, 7000);
		InputStream is = client.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		GregorianCalendar gc = (GregorianCalendar)ois.readObject();
		System.out.printf("���� �ð�: %TF %TT", gc,gc);
		sc.close();
		is.close();  ois.close(); client.close();
	}
}