package ch13;
import java.awt.*;
public class Choice1 extends Frame {
	public Choice1() {
		setLayout(new FlowLayout());
		Label lab = new Label("������ �����ϼ���");
		lab.setBackground(new Color(183, 240, 177));
		Choice choice = new Choice();
		choice.add("�̱�"); choice.add("����"); choice.add("�߱�");
		choice.add("�ѱ�"); choice.add("����"); choice.add("����");
		add(lab); add(choice);
		setSize(200, 200);
		setVisible(true);
	}
 	public static void main(String[] args) {
		new Choice1();
	}
}