package ch04;
public class Ex04 {
	public static void main(String[] args) {
//		�Ž����� 372000�� 50000, 10000, 5000, 1000¥���� �ٶ� �� ���� �־�� �ϳ�
		int money = 372000;
		int[] unit = {50000, 10000, 5000, 1000};
		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d��¥�� : %d��\n",unit[i],money/unit[i]);
			money %= unit[i];
		}
	}
}