package ch05;
public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person(); 
		p1.name="������"; p1.age=25; 
		p1.hobby="���ϱ�";
		Person p2 = new Person("��"); 
		p2.age=35; p2.hobby="�޴�ȭ";
		Person p3 = new Person("�մ��",32); 
		p3.hobby="ħ���";
		Person p4 = new Person("����ũ",26, "��");
		
		p1.print();
		p2.print();
		p3.print();
		p4.print();
	}
}