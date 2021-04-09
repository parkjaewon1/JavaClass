package ch13;
import java.awt.*;
public class Text1 extends Frame {
	public Text1() {
		// 한줄 입력창
		TextField tf1 = new TextField("아이디");
		TextField tf2 = new TextField();
		tf2.setEchoChar('*');
		TextArea ta = new TextArea(5, 40); // 5줄 40자
		add(tf1); add(tf2); add(ta);
		setSize(300, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Text1();
	}
}
