package ch09;

public class String1 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		if (str1.equals(str2)) System.out.println("str1과 str2는 같다");
		else  System.out.println("str1과 str2는 다르다");
		if (str2.equals(str3)) System.out.println("str2과 str3는 같다");
		else  System.out.println("str2과 str3는 다르다");
		System.out.println("===================");
		if (str1 == str2) System.out.println("str1과 str2는 같다");
		else  System.out.println("str1과 str2는 다르다");
		if (str2 == str3) System.out.println("str2과 str3는 같다");
		else  System.out.println("str2과 str3는 다르다");
	}
}
