package ch09;
import java.util.Random;
public class Random1 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("0���� 100���� ���� : " + ran.nextInt(101));
		System.out.println("��ü �����߿��� ���� : " + ran.nextInt());
		System.out.println("float ���� : " + ran.nextFloat());
		System.out.println("double ���� : " + ran.nextDouble());
		System.out.println("long ���� : " + ran.nextLong());
		System.out.println("boolean ���� : " + ran.nextBoolean());
	}
}