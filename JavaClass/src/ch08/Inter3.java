package ch08;

interface C1{
	String str = "¸¶Áö¸· ½Ã°£";
	void c1();
}
interface C2 extends C1{
	void c2();
}
interface C3 extends C2{
	void c3();
}
class C4 implements C3{
	public void c4() {
		System.out.println("¹ìµþ±â");
	}

	@Override
	public void c2() {
		System.out.println("ÆÇµþ±â");
		
	}

	@Override
	public void c1() {
		System.out.println("»êµþ±â");
		
	}

	@Override
	public void c3() {
		System.out.println("¾ËÄ«¸®µþ±â");
		
	}
}


public class Inter3 {

	public static void main(String[] args) {
		C4 c4 = new C4();
		c4.c1();
		c4.c2();
		c4.c3();
		c4.c4();
		System.out.println("Áö±ÝÀº "+C4.str);

	}

}
