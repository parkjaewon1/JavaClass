package ch09;

public class String3 {
	public static void main(String[] args) {
		String[] str = {"insert", "update", "delete", "select"};
		for (String s : str) {
			if (s.startsWith("s")) System.out.println("s�� ����:"+s);
			if (s.endsWith("e")) System.out.println("e�� ��:"+s);
			if (s.contains("l")) System.out.println("l�� �־�:"+s);
		}
	}
}