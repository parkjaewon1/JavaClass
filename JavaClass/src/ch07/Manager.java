package ch07;

public class Manager extends Person {
	private String part;
	public Manager(String name, int age, String part) {
		setName(name);
		setAge(age);
		this.part= part;
		
	}
	public String getSubject() {
		return part;
	}


	public void setSubject(String subject) {
		this.part = subject;
	}


	void printMg() {
		print();
		System.out.println("�μ� : "+part);
	}
}
