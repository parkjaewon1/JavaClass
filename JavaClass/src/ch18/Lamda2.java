package ch18;
@FunctionalInterface // �Լ��� �������̽����� üũ
interface MyFun2 {
	void method(int x);
}
public class Lamda2 {
	public static void main(String[] args) {
		MyFun2 mf2;
		mf2 =(x)-> {
			int result = x * 5;
			System.out.println("��� : "+result);
		};
		mf2.method(4);
		mf2=(x)-> {System.out.println("��� : "+x * 7);};
		mf2.method(5);
		mf2=x-> {System.out.println("��� : "+x * 3);}; // �Ű������� 1���� ��� ()����
		mf2.method(3);
		mf2=x-> System.out.println("��� : "+x * 6); // �Ű������� 1���� ��� ()����
		mf2.method(7);
	}
}