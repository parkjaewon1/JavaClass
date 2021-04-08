package ch12;
// ��Ƽ������ : �ϳ��� ���μ������� �� �۾��� ���ÿ� ����
class Thread2 extends Thread {
	public Thread2(String title) { // Thread ����
		super(title);
	}
	public void run() {
		for(int i =0; i <100;i++) {
			System.out.print(getName()+i+"\t");
			if (i%10 == 9) System.out.println();
			try {		Thread.sleep(200); // 0,5 �����
			} catch (InterruptedException e) {	}
		}
	}
}
public class Thread1Ex2 {
	public static void main(String[] args) { 
		Thread2 th1 = new Thread2("th1");
		Thread2 th2 = new Thread2("th2");
//		th1.start(); th2.start();  // thread�� ����
		th1.run();   th2.run();
		for(int i =0; i <100;i++) {
			System.out.print("����"+i+"\t");
			if (i%10 == 9) System.out.println();
			try {		Thread.sleep(200); // 0,5 �����
			} catch (InterruptedException e) {	}
		}
	}
}