package ch06;

public class Single1Ex {
	public static void main(String[] args) {
		Single1 s1 = new Single1();
		Single1 s2 = new Single1();
		Single1 s3 = new Single1();
//		��ü�� ��� : ��Ű����.Ŭ���ø�@�ؽ��ڵ�
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

//		�̸��� �ٸ����� ���� ��ü �ּҰ� ����
		Single1 p1 = Single1.getInstance();
		Single1 p2 = Single1.getInstance();
		Single1 p3 = Single1.getInstance();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}