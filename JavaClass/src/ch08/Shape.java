package ch08;

public class Shape {
	void draw() {
		
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("���� �׸���.");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
}
class Retangle extends Shape{
	void draw() {
		System.out.println("�簢���� �׸���.");
	}
}