package ch08;

interface Bird {
	void eat();
}
//implements �ڿ��� �������� �������̽� ��밡��.
public class Monster extends Person2 implements Fish, Bird {
	public static void main(String[] args) {
		Monster mt = new Monster();
		mt.move();
		mt.swim();
		mt.eat();
		System.out.println("�ٸ����� : "+mt.leg);
	}
	
	
	@Override // �׻� �������̽� ����� �����Ǹ� �ؾ��Ѵ�.
	public void swim() {
		System.out.println("���ӿ��� ���ģ��");

	}

	public void eat() {
		System.out.println("�θ��� �ɾƸԴ´�");
	}



}
