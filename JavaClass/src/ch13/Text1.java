package ch13;
import java.awt.*;
public class Text1 extends Frame {
	public Text1() {
		// ���� �Է�â
		TextField tf1 = new TextField("���̵�");
		TextField tf2 = new TextField();
		tf2.setEchoChar('*');
		TextArea ta = new TextArea(5, 40); // 5�� 40��
		add(tf1); add(tf2); add(ta);
		setSize(300, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Text1();
	}
}
