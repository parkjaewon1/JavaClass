package ch12;
// Thread��� ���� ���� Runnable�� ���ܤ��Ͻÿ�
//class Thread3 extends Thread {
class Thread3 implements Runnable {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.print('-');
		}
	}
}

public class Ex01 {
	public static void main(String args[]) {
//		Thread3 th1 = new Thread3();
		Thread3 th3 = new Thread3();  // Runnable������ Ŭ���� ��ü�� �����ϰ�
		Thread th1 = new Thread(th3); // ������ ������ �Ű������� ��ü�� ������ �Ŀ� ����
		th1.start();
	}
}