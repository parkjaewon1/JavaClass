package ch07;

public class OuterEx {
	public static void main(String[] args) {
		Outer out = new Outer(10, 15);
		Outer.Inner inner1 = out.new Inner();
		Outer.Inner inner2 = out.getInner();
		
		System.out.println("���� : "+inner1.volume());
		System.out.println("���� : "+inner2.volume());
	}
}