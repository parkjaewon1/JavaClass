package ch17;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class ChatServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(7001); // ����� ���� ����
			System.out.println("���� ������");
			while(true) {
				Socket client = ss.accept(); // Ŭ���̾�Ʈ�� ������ ������ ���
//				���� ���� �����͸� ���� �غ�
				DataInputStream dis = new DataInputStream(client.getInputStream());
//				�������� �ѱ�ó���ؼ� ���پ� ���� �غ�
				BufferedReader br = new BufferedReader(new InputStreamReader(dis));
//				                         ���� ip�ּ�              ���� �޼���
				System.out.println(client.getInetAddress()+"=>"+br.readLine());
				dis.close();  br.close();  client.close();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}