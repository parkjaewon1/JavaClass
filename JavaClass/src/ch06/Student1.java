package ch06;

public class Student1 {
	String name;
	int kor,eng,math;
	
	Student1(){ } // 생성자가 하나라도 있으면 default생성자는 생성이 안된다
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
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+getToal());
		System.out.println("평균 : "+getAverage());
	}
}
