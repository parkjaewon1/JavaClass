package ch08;

public class Shape {
	void draw() {
		
	}
}
class Circle extends Shape{
	void draw() {	//오버라이딩 , 부모의 메소드 내용을 재정의(변경)
		System.out.println("원을 그린다.");
	}
}
class Triangle extends Shape{
	void draw() {   //오버라이딩
		System.out.println("삼각형을 그린다.");
	}
}
class Retangle extends Shape{
	void draw() {	//오버라이딩
		System.out.println("사각형을 그린다.");
	}
}