package ch05;
import java.io.IOException;
public class Final2 {
	public static void main(String[] args) throws IOException {
		final int CIRCLE = 1;
		final int RECTANGLE = 2;
		final int TRIANGLE = 3;
		System.out.println("숫자 1,2,3중에 하나를 입력하세요");
		int num = System.in.read() - '0';
		if (num == CIRCLE) System.out.println("원입니다");
		else if (num == RECTANGLE) System.out.println("사각형 입니다");
		else if (num == TRIANGLE) System.out.println("삼각형 입니다");
		else System.out.println("1 또는 2 또는 3이 아닙니다");
	}
}