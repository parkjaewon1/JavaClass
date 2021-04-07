package ch11;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;
public class PropertiesExample {
	public static void main(String[] args) throws  IOException {
		Properties pts = new Properties();
		String path = // database.properties������ ��ġ�� �̸�
				PropertiesExample.class.getResource("database.properties").getPath();
		// utf-8, euc-kr(MS949)
		// path = URLDecoder.decode(path, "utf-8"); // url�ּҸ� ����
		pts.load(new FileReader(path)); // database.properties�� pts�� �Űܶ�
		System.out.println("driver : " + pts.getProperty("driver"));
		System.out.println("url : " + pts.getProperty("url"));
		System.out.println("username : " + pts.getProperty("username"));
		System.out.println("password : " + pts.getProperty("password"));
	}
}