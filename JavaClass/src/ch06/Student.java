package ch06;

public class Student {
	private String name;
	private int age;
	private String sno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public void printAll() {
		System.out.println("===========");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("��ȣ : "+sno);
	}
}
