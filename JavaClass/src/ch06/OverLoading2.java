package ch06;

class Box{
	int volume(int x,int y,int z) {
		return x * y * z;
	}
	double volume(double x,double y,double z) {
		return x * y * z;
	}
}

public class OverLoading2 {

	public static void main(String[] args) {
			Box box = new Box();
			System.out.println("정수박스 부피:"+box.volume(12,12,15));
			System.out.println("정수박스 부피:"+box.volume(1.2,1.2,1.5));
			System.out.println("정수실수박스 부피:"+box.volume(1.2,12,15)); 
			//이 경우 더블로간다.(정수는 실수에 포함되기때문에)
	}

}
