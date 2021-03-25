package ch02;

public class OpSp2 {

	public static void main(String[] args) {
		int i1 = 1000000, i2 =2000000;
		long l1 = i1 * i2; // int*int는 int이므로 쓰레기값이 나옴
		l1= (long)i1 *i2; // long * int -> long*long -> long 
		                  // 둘 중 하나만 바꿔도 가능.
		 System.out.println("l1="+l1);
	}

}
