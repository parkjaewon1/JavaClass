package ch04;

public class Arr3 {

	public static void main(String[] args) {
		int[] ar=new int[5];
		
		for (int i = 0; i < 5; i++) {
			ar[i]=(int)(Math.random()*10)+1;
			
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"] = "+ar[i]);
		
		}
	}

}
