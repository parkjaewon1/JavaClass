package ch08;

interface Bird {
	void eat();
}
//implements 뒤에는 여러개의 인터페이스 사용가능.
public class Monster extends Person2 implements Fish, Bird {
	public static void main(String[] args) {
		Monster mt = new Monster();
		mt.move();
		mt.swim();
		mt.eat();
		System.out.println("다리갯수 : "+mt.leg);
	}
	
	
	@Override // 항상 인터페이스 상속은 재정의를 해야한다.
	public void swim() {
		System.out.println("물속에서 헤엄친다");

	}

	public void eat() {
		System.out.println("부리로 쪼아먹는다");
	}



}
