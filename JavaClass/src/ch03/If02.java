package ch03;

public class If02 {

	public static void main(String[] args) {
		//int i1 = 10 ;
		//int i1 = Integer.parseInt(args[0]); ���ڸ� ������ �ٲٴ°�.
		int i1 = Integer.parseInt(args[0]);
		if(i1>0) {
			System.out.println("����Դϴ�.");
			System.out.println("���ڴ�"+i1+"�Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
			System.out.println("���밪��"+-i1+"�Դϴ�.");
		}
		
	}

}
