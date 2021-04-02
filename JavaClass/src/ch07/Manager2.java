package ch07;

public class Manager2 extends Person2 {
	private String part;
	public Manager2(String name, int age, String part) {
		super(name,age);
		this.part = part;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}
	
	void disp() {
		System.out.println("안녕하세요");
	}

	void print() {
		super.print();
		System.out.println("파트 : "+part);
	}
}