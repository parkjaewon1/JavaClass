package ch12;
import javax.swing.JOptionPane;
public class Input1 {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			Thread.sleep(300);
		}
		String str = JOptionPane.showInputDialog("�ƹ��ų� �Է���");
		System.out.println("��� �Է��� �� : "+str);
	}
}