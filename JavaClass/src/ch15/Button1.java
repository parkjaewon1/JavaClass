package ch15;
import javax.swing.*;
public class Button1 extends JFrame{
	public Button1() {
		ImageIcon i1 = new ImageIcon("logo.gif");
		ImageIcon i2 = new ImageIcon("java.jpg");
		JButton btn1 = new JButton("�ΰ�", i1);
		JButton btn2 = new JButton("�ڹ�", i2);
		btn1.setToolTipText("��� ��������");
		btn2.setToolTipText("�ݿ����̴� ");
		add("North", btn1);  add("South", btn2);
		setSize(300, 300);   setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // windowClosing
	}
	public static void main(String[] args) {
		new Button1();
	}
}
