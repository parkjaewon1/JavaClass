package ch03;

import java.io.IOException;

public class While3 {

	public static void main(String[] args) throws IOException {
		System.out.println("���ϴ� ������ ��ȣ��?");
		int num = System.in.read()-'0';
		int i=1;
		
		System.out.println("������"+num+"��");
		while(i<10) {
			System.out.println(num+"X"+i+"="+num*i);
			i++;
		}
		

	}

}
