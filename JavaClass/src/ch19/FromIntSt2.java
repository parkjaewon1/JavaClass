package ch19;

import java.util.stream.IntStream;

public class FromIntSt2 {
	static int sum = 0;
	public static void main(String[] args) {	
		// 1���� 100����
		IntStream stream = IntStream.range(1, 100);
		stream.forEach(x->sum+=x);
		System.out.println("�հ� : "+sum);
	}
}