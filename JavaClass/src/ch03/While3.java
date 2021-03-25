package ch03;

import java.io.IOException;

public class While3 {

	public static void main(String[] args) throws IOException {
		System.out.println("원하는 구구단 번호는?");
		int num = System.in.read()-'0';
		int i=1;
		
		System.out.println("구구단"+num+"단");
		while(i<10) {
			System.out.println(num+"X"+i+"="+num*i);
			i++;
		}
		

	}

}
