package ch05;
class B1 {
	int[] i1 = new int[10];
	int i2;
	{ // 초기화 블럭 안에서 실행문을 작성할 수 있음
		for(int i = 0; i < i1.length; i++) {
			i1[i] = (int)(Math.random()* 20) + 1;
		}	
		i2 = 15;
	}
}
public class InstanceInit1 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		System.out.println("i2 = "+b1.i2);
		for (int i = 0; i < b1.i1.length; i++) {
			System.out.println("i1["+i+"] = "+b1.i1[i]);
		}
	}
}