package ch02;

public class OpSp4 {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = (char)(c1 +1); //���ڴ� �����ڸ� ������ int �� ����
		System.out.println("c2="+c2);
		
		int c3= c1 + 1;
		System.out.println("c3="+c3);
		
		int c4 = ++c1;
		System.out.println("c4="+c4);
		
		int i1 ='C'-'A';    //�ƽ�Ű �ڵ尪���� ���ȴ�.
		int i2 ='5'-'0';
		System.out.println("i1="+i1);
		System.out.println("i2="+i2);
	}

}
