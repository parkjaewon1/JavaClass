package ch03;

public class Continue2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("�ȳ� :" + j);
				if (j > 3)
					continue;
				System.out.println("��� :" + i);
			}
			System.out.println("�ٱ�");
		}

	}

}
