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
			System.out.println("�����ڽ� ����:"+box.volume(12,12,15));
			System.out.println("�����ڽ� ����:"+box.volume(1.2,1.2,1.5));
			System.out.println("�����Ǽ��ڽ� ����:"+box.volume(1.2,12,15)); 
			//�� ��� ����ΰ���.(������ �Ǽ��� ���ԵǱ⶧����)
	}

}
