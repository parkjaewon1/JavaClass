package ch19;
import java.util.Arrays;
public class LoopingEx1 {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5};
		System.out.println();
		// �������� ���� : peek�߰� �ܰ�
		Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n));
		// sum()�� ���� �ܰ�
		int total = Arrays.stream(intArr).filter(a->a%2==0)
				.peek(n->System.out.println(n)).sum();
		System.out.println("�հ� : "+total);
		// forEach() ���� �ܰ�
		Arrays.stream(intArr).filter(a->a%2==0).forEach(n->System.out.println(n));
	}
}