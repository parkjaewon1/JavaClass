package ch02;

public class Ex01 {

	public static void main(String[] args) {
		int numOfApples = 123; //사과 갯수
		int sizeOfBucket = 10; // 바구니의 크기
		
		int result = numOfApples % sizeOfBucket==0?
				     numOfApples / sizeOfBucket:
				     numOfApples / sizeOfBucket +1;
		System.out.println("int result="
		+result);

	}

}
