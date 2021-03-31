package ch06;
class D1{
	public void m1(int[] num) {   //num 변수 이름을 바꿔도 결과는 같다.
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
		d1.m1(num); //참조형 변수 일때는 주소를 전달.
		for(int i = 0; i<num.length;i++) {
			System.out.println("num["+i+"] ="+num[i]);
		}
	}

}
