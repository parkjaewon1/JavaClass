package ch06;

public class Student1 {
	String name;
	int kor,eng,math;
	
	Student1(){ } // �����ڰ� �ϳ��� ������ default�����ڴ� ������ �ȵȴ�
	public Student1(String n, int k, int e, int m) {
		name = n; kor= k; eng = e; math = m;
	}
	
	int getToal() {
		return kor+eng+math;
	}
	float getAverage() {
		float avg = getToal()/3.0f;
		return avg;
	}
	void print() {
		System.out.println("==============================");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
		System.out.println("���� : "+getToal());
		System.out.println("��� : "+getAverage());
	}
}
