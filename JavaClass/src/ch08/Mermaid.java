package ch08;

class Person2{
	int leg = 2;
	void move() {
		System.out.println("�� �ٸ��� �ȴ´�");
	}
}
interface Fish{ 
	void swim();
}


public class Mermaid extends Person2 implements Fish { //���� ��� ����
	
	public void swim() {
		System.out.println("�� �ӿ��� ���ģ��");
	}
	public static void main(String[] args) {
		Mermaid mr = new Mermaid();
		mr.move();
		mr.swim();
		System.out.println("�ٸ� ���� : "+mr.leg);
	}
}
