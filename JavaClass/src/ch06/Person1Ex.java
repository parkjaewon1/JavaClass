package ch06;
public class Person1Ex {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("세정"); st1.setAge(25); st1.setSno("1반");
		Student st2 = new Student();
		st2.setName("BTS"); st2.setAge(27); st2.setSno("2반");
		Teacher th1 = new Teacher();
		th1.setName("길동"); th1.setAge(35); th1.setSubject("자바");
		Teacher th2 = new Teacher();
		th2.setName("광수"); th2.setAge(41); th2.setSubject("뭘잡아");
		Manager mg1 = new Manager();
		mg1.setName("철수"); mg1.setAge(51); mg1.setPart("화장실 청소");
		
		System.out.println("이름 : " + st1.getName()); // st1.name x
		
		st1.printAll(); st2.printAll(); 
		th1.printAll(); th2.printAll();
		mg1.printAll();
	}
}