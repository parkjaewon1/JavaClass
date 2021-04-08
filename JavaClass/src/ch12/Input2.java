package ch12;
import javax.swing.JOptionPane;
class ThredTest extends Thread {
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			try {		Thread.sleep(300);
			} catch (InterruptedException e) {	}
		}
	}
}

public class Input2 {
	public static void main(String[] args) {
		ThredTest tt = new ThredTest();
		tt.start();
		String str = JOptionPane.showInputDialog("아무거나 입력해");
		System.out.println("입력한 값 : "+str);
	}
}