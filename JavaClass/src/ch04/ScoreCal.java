package ch04;
public class ScoreCal {
	public static void main(String[] args) {
		// ���� ����
		int kim = 80, choi = 95, park = 88, kang = 94, lee = 60;
		// �հ�� ����
		int tot = kim + choi + park + kang + lee;
		System.out.println("�հ� : " + tot+", ��� : " + tot/5);
		int[] score = {80, 95, 88, 94, 60};
		int sum = 0;
		for (int i =0; i< score.length;i++) {
			sum += score[i];
		}
		System.out.println("�հ� : " + sum+", ��� : " + sum/score.length);
	}
}