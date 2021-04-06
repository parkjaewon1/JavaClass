package ch09;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regular1 {
	public static void main(String[] args) {
		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", 
				"c.", "c0", "car", "combat", "count", "date",	"disc" };
//		                             c�ν����ϰ� ���� ���ڰ� �� �ҹ��� a ~ z 
		Pattern p = Pattern.compile("c[.0-9A-z]*"); // �˻� ����
		// c�� �����ϴ� �ҹ��ڿ��ܾ�
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if (m.matches()) {  // �˻� ���ǿ� ������
				System.out.print(data[i] + ",");
			}
		}
	}
}