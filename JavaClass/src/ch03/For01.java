package ch03;

public class For01 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 10; i > 0; i--) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=3) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i*=2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int i=1;
		for(; ;) {
			System.out.println(i+"\t");
			if(i>=10) break;
			i++;
		} 
		// for(; ;)은 while(true)와 같다
	}

}
