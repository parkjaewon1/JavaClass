package ch03;

import java.io.IOException;

public class Do5 {

	public static void main(String[] args) throws IOException {
		System.out.println("구구단 숫자입력");
		int i = System.in.read() -'0'; 
		int j = 1;
		
		do {
			System.out.printf("%d * %d = %d\n",i,j,i*j);
			j++;
			
		}while(j<=9);
		
		
		

	}

}
