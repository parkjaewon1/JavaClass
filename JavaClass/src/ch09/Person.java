package ch09;
public class Person {
	int jumin;
	String name;
	int age;
	public Person(int jumin, String name, int age) {
		this.jumin = jumin; this.name = name; this.age = age;
	}
	// �ܺο��� ���� ��ü�� Person���� ���� ��ü�� �ֹι�ȣ�� ������ ���ٰ� �����ϰ�
	// �ƴϸ� �ٸ��ٰ� ����
	// eqauls ���ٴ� ������ ���� �� ���
	public boolean equals(Object obj) {
		// ���ڸ� ���� ���� ==, ���ڸ� ���� ���� equals
//		if (obj != null && obj instanceof Person) {
//			return jumin == ((Person)obj).jumin; 
//		} else return false;
		if (obj != null && obj instanceof Person) {
			return name.equals(((Person)obj).name); 
		} else return false;
	}
	public String toString() {
		return "�̸�:"+name+", �ֹι�ȣ:"+jumin+", ����:"+age;
	}
}