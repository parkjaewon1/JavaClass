package ch09;

public class Str4 {

	public static void main(String[] args) {
		String str = "�츮�� ģ������, �翡 ������ ����� ģ��";
		String str2 = str.substring(5,10);
		System.out.println(str2);
		
		String strs[] = str.split(" ");
		for(String st : strs) {
			System.out.print(st+"\t");
			
			if(st.endsWith("��")) System.out.println("������ �� : "+st);
			
			if(st.startsWith("��")) System.out.println("������ ���� : "+st);
		}
		System.out.println("================================");
		
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println(str.indexOf(',')); //�ε��� ��ġ ���

	}

}
