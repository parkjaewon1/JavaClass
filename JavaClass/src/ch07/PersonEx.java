package ch07;

public class PersonEx {

	public static void main(String[] args) {
		Student st1 = new Student("����",28,"1��");
		Student st2 = new Student("��",27,"2��");
		Teacher th1 = new Teacher("���缮",51,"�ڹ�");
		Teacher th2 = new Teacher("��ȿ��",40,"jsp");
		Manager mg1 = new Manager("����",52,"ȭ��� û��");
		
		st1.print();
		st2.print();
		th1.print();
		th2.print();
		mg1.print();
	}

}
