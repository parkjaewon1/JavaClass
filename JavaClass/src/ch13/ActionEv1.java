package ch13;
import java.awt.*;
import java.awt.event.*;
public class ActionEv1 extends Frame implements ActionListener{
	Button btn;  // �̺�Ʈ ó���� ���۳�Ʈ�� ���� ������ ����
	TextArea ta;
	public ActionEv1() {
		btn = new Button("��ư�� Ŭ�� �ϼ���");
		ta = new TextArea();
		add("North", btn);
		add("Center", ta);
		setSize(300, 300);
		setVisible(true);
		// ActionListener ��ư Ŭ��, List �Ǵ� Choice�� ����,
		btn.addActionListener(this); // ��ư�� �������� üũ
	}
	public static void main(String[] args) {
		new ActionEv1();
	}
	public void actionPerformed(ActionEvent e) {
		ta.append("��ư ������ \n");		
	}
}