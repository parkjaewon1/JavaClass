package ch03;

import java.io.IOException;

public class IO1 {

	public static void main(String[] args) throws IOException {
		System.out.println("정수 한자리를 입력하세요");
		int num = System.in.read() -'0'; // 입력값이 아스키코드로 출력되므로 '0'(48)을 해야함.
		System.out.println("입력한 숫자:"+num);

	}

}
