package ch02;

public class OpSp1 {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		byte b3 = (byte)(b1 + b2); // 연산할 경우 b1,b2가 int형으로 변환된다.
		int b4 = b1 + b2 ;  //int로 저장 시에는 에러없음
		System.out.println("b3="+b3);
		System.out.println("b4="+b4);
		long l1 = 30;
		int i1 = 20;
		int i2 = (int)(l1 + i1); //long형과는 범위차이 떄문에 성립 뿔가이므로 형변환을해야한다.
		long i3 = l1 + i1; // 범위가 작은것만 해당.
	}
}
