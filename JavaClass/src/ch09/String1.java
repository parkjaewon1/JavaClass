package ch09;

public class String1 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		if (str1.equals(str2)) System.out.println("str1�� str2�� ����");
		else  System.out.println("str1�� str2�� �ٸ���");
		if (str2.equals(str3)) System.out.println("str2�� str3�� ����");
		else  System.out.println("str2�� str3�� �ٸ���");
		System.out.println("===================");
		if (str1 == str2) System.out.println("str1�� str2�� ����");
		else  System.out.println("str1�� str2�� �ٸ���");
		if (str2 == str3) System.out.println("str2�� str3�� ����");
		else  System.out.println("str2�� str3�� �ٸ���");
	}
}
