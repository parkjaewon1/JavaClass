package ch03;

public class Sw2 {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		
		switch(num) {
		case 1: System.out.println("�ȳ��ϼ���"); break;
		case 2: System.out.println("�ݰ����ϴ�"); break;
		case 3: System.out.println("ó�� �˰ڽ��ϴ�"); break;
		default: System.out.println("��������");
		}
	}
}
