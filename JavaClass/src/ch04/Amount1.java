package ch04;

public class Amount1 {

	public static void main(String[] args) {
		String subject = "������Ȳ";
		String[] title = { "��ǰ��", "1��", "2��", "3��", "4��", "�հ�", "���" };
		int len = 54, sum = 0;
		String[] name = { "�����", "�׷���", "û�ұ�" };
		int[][] amt = { { 250, 170, 300, 780 }, { 170, 120, 150, 220 }, { 450, 230, 400, 250 } };
		int[] tot = new int[amt[0].length];

		System.out.println(subject);
		System.out.println("=============");

		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < len; i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < amt.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < amt[i].length; j++) {
				System.out.print(amt[i][j] + "\t");
				sum += amt[i][j];
				tot[j] += amt[i][j];
			}
			System.out.println(sum + "\t" + sum / amt[i].length);
			sum = 0;
		}
		for (int i = 0; i < len; i++) {
			System.out.print("-");
		}
		System.out.print("\n�Ѱ�\t");
		for (int j = 0; j < tot.length; j++) {
			System.out.print(tot[j] + "\t");
			sum += tot[j];
		}
		System.out.println(sum + "\t" + sum / tot.length + "(" + sum / tot.length / name.length + ")");

	}
}
