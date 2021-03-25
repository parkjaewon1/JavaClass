package ch04;
public class Arr2 {
	public static void main(String[] args) {
		int i1 = 7; // 기본형은 초기화 하지 않으면 에러
		System.out.println("i1 = " + i1);
		int[] i2 = new int[5]; // 숫자는 0으로 초기화
		i2[0] = 7; i2[1] = 27; i2[2] = 782; i2[3] =4; i2[4] = 999;
		for (int j = 0; j < i2.length; j++) {
			System.out.println("i2["+j+"] = "+i2[j]); // 출력 변수명[인덱스]
		}
	}
}