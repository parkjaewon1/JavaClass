package ch06;
public class Person1Ex {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("����"); st1.setAge(25); st1.setSno("1��");
		Student st2 = new Student();
		st2.setName("BTS"); st2.setAge(27); st2.setSno("2��");
		Teacher th1 = new Teacher();
		th1.setName("�浿"); th1.setAge(35); th1.setSubject("�ڹ�");
		Teacher th2 = new Teacher();
		th2.setName("����"); th2.setAge(41); th2.setSubject("�����");
		Manager mg1 = new Manager();
		mg1.setName("ö��"); mg1.setAge(51); mg1.setPart("ȭ��� û��");
		
		System.out.println("�̸� : " + st1.getName()); // st1.name x
		
		st1.printAll(); st2.printAll(); 
		th1.printAll(); th2.printAll();
		mg1.printAll();
	}
}