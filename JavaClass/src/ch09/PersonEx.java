package ch09;
public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person(1111, "��ö��", 35);
		Person p2 = new Person(1111, "ȫ�⵿", 42);
		Person p3 = new Person(2222, "��ö��", 35);
//		== �ּұ��� ����
		if (p1 == p2) System.out.println("p1�� p2�� ����");
		else  System.out.println("p1�� p2�� �ٸ���");
		if (p1 == p3) System.out.println("p1�� p3�� ����");
		else  System.out.println("p1�� p3�� �ٸ���");
		System.out.println("===============");
		System.out.println("p1 = "+p1.hashCode());
		System.out.println("p2 = "+p2.hashCode());
		System.out.println("p3 = "+p3.hashCode());
		if (p1.equals(p2)) System.out.println("p1�� p2�� ����");
		else  System.out.println("p1�� p2�� �ٸ���");
		if (p1.equals(p3)) System.out.println("p1�� p3�� ����");
		else  System.out.println("p1�� p3�� �ٸ���");
		System.out.println("===============");
//		�̸�:~~, �ֹι�ȣ:~~, ����:~~
		System.out.println("p1 = "+p1);
		System.out.println("p2 = "+p2);
		System.out.println("p3 = "+p3);
	}
}