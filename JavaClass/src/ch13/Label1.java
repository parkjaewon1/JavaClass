package ch13;
import java.awt.*;
public class Label1 extends Frame {
	public Label1() {
		// FlowLayout : Frame�ȿ� �ִ� Componet���� �߾� ������ ��ġ�϶�
		setLayout(new FlowLayout());
		Label lab1 = new Label("��");
		Label lab2 = new Label("����");
		Label lab3 = new Label("����");
		Label lab4 = new Label("�ܿ�");
		// label�� Frame�� �־��
		add(lab1); add(lab2); add(lab3); add(lab4); 
		setSize(300, 300);
		setVisible(true);  // Frame(Container)�� �������
	}
	public static void main(String[] args) {
		new Label1();
	}
}