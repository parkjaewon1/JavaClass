package ch02;
public class OPerTest1 {
	public static void main(String[] args) {
		String str="산술, 증감, 감소, 연산자 예제";
		 int x,y;
		 x = 10; y = 5;
		 System.out.println(str);
		 System.out.println("x + y = "+(x + y));
		 System.out.println("x - y = "+(x - y));
		 System.out.println("x * y = "+(x * y));
		 System.out.println("x / y = "+(x / y));
		 System.out.println("x % y = "+(x % y));
		 System.out.println("x++ = "+(x++)); // x는 11이지만 출력은 증가전이므로 10
		 System.out.println("y++ = "+(y++));
		 x=10; y=5;
		 System.out.println("++x = "+(++x));
		 System.out.println("++y = "+(++y)); 
	}
}
