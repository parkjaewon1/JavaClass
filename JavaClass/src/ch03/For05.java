package ch03;



public class For05 {

	public static void main(String[] args) {

		System.out.println("������ ���");

		for(int i = 1; i<=9; i++ ) {
			for(int j =2; j<=9;j++) {
				//System.out.println(j+" * "+i+"= "+j*i);
				System.out.printf("%d * %d = %d\t",j,i,j*i);

			}System.out.println("");
		}

	}
}
