package ch05;
class Calc {
	int width, height, depth;	
	Calc(int w) {  	width = w;	}
	Calc(int w, int h) {	width = w; height = h;	}
	Calc(int w, int h, int d) {	width = w; height = h;	depth = d; }
	void square() {	
		System.out.println("���簢�� ���� : "+ width*width);	
	}
	void rectange() {	
		System.out.println("���簢�� ���� : "+ width * height);	
	}
	void hexa() {
		System.out.println("�� ����ü ���� : "+width * height * depth);
	}
}
public class CalcEx {
	public static void main(String[] args) {
		Calc c1 = new Calc(10);  		c1.square();
		Calc c2 = new Calc(10, 20);		c2.rectange();
		Calc c3 = new Calc(10, 20, 30);	c3.hexa();
	}
}