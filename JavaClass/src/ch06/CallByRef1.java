package ch06;
class D1{
	public void m1(int[] num) {   //num ���� �̸��� �ٲ㵵 ����� ����.
		num[0] = 77;
		num[1] = 88;
		for(int i = 0; i<num.length;i++) {
			System.out.println("num["+i+"] ="+num[i]);
		}
	}
}
public class CallByRef1 {

	public static void main(String[] args) {
		int[] num = {12,34};
		D1 d1 = new D1();
		d1.m1(num); //������ ���� �϶��� �ּҸ� ����.
		for(int i = 0; i<num.length;i++) {
			System.out.println("num["+i+"] ="+num[i]);
		}
	}

}
