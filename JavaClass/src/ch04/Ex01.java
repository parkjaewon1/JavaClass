package ch04;
public class Ex01 {
	public static void main(String[] args) {
		int[] score = {76, 45, 35, 89, 100, 50, 90, 92};
		// �հ�sum, ���avg, �ְ���max, �ּ��� min
		// �ִ밪�� ���� ��, �ּҰ��� ū������ �ʱ�ȭ,
		// ������ ����� ū ���� �ִ밪�̸� �ȵ�, �ּҰ� ������ ����� ���� ������ �ʱ�ȭ �ϸ� �ȵ� 
		int sum = 0, max = score[0], min = score[0];
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if (score[i] > max) max = score[i];
			if (score[i] < min) min = score[i];
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum/score.length);
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		System.out.println("=====================");
		sum = 0;
		max = score[0];
		min = score[0];
		// Ȯ�� for
		for(int sc :score) {
			sum += sc;
			if (sc > max) max = sc;
			if (sc < min) min = sc;
		}
		float avg = (float)sum/score.length;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		System.out.println("=====================");
	}
}