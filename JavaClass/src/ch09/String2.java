package ch09;
public class String2 {
	public static void main(String[] args) {
		System.out.println(2+0+2+1+"������");
		System.out.println("������"+2+0+2+1);
		String str1 = new String("���");
		String str2 = "�ʹ�";
		char[] ch = {'��','��','��'};
		String str3 = new String(ch);
		System.out.println(str1 + str2 + str3);
		
		String str4 = "������, ������, ��ſ��";
		String[] str5 = str4.split(", ");
		for(int i = 0; i <str5.length;i++) {
			System.out.println(str5[i]);
		}
		String str6 = str4.substring(2, 7);
		System.out.println(str6);
	}
}