package ch18;
interface MyFunction1 {
	public void method();
}
class MyFun1Class implements MyFunction1 {
	public void method() {
		System.out.println("�� �������� Ŭ����");		
	}	
}
public class Lamda1Ex {
	public static void main(String[] args) {
		MyFunction1 mc1 = new MyFun1Class();
		mc1.method();
		mc1 = new MyFunction1() {  // ����(�͸�) Ŭ����
			public void method() {
				System.out.println("�� �������̽� ���� ������");				
			}			
		};
		mc1.method();
		mc1 = ()-> {System.out.println("�� ���ٷ� ó���� �޼���");};
		mc1.method();
	}
}