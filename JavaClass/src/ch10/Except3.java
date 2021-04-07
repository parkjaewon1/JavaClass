package ch10;

public class Except3 {

	public static void main(String[] args) {
		int[] x = {12, 45, 25, 0, 6};
		for(int i = 0; i <=x.length; i++) {
			try {
			System.out.printf("%d %d = %d\n",100,x[i],100/x[i]);
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위을 벗어났습니다.");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
