package ch03;

public class Continue2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("¾È³ç :" + j);
				if (j > 3)
					continue;
				System.out.println("´ë¹Ú :" + i);
			}
			System.out.println("¹Ù±ù");
		}

	}

}
