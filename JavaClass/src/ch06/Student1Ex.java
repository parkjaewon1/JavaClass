package ch06;

public class Student1Ex {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		
		s1.name="홍길동";
		s1.kor=100; s1.eng=60; s1.math =76;
		s1.print();
		
		Student1 s2 = new Student1("박재원",90,40,60);
		s2.print();


	}

}
