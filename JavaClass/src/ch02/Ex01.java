package ch02;

public class Ex01 {

	public static void main(String[] args) {
		int numOfApples = 123; //��� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��
		
		int result = numOfApples % sizeOfBucket==0?
				     numOfApples / sizeOfBucket:
				     numOfApples / sizeOfBucket +1;
		System.out.println("int result="
		+result);

	}

}
