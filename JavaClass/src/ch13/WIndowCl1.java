package ch13;
import java.awt.*;
import java.awt.event.*;
public class WIndowCl1 extends Frame implements ActionListener{
	TextArea ta; Button btn;  // �̺�Ʈ ó���� ���۳�Ʈ�� ���� ������ ����	
	public WIndowCl1() {
		btn = new Button("��ư�� Ŭ�� �ϼ���");	ta = new TextArea();
		add("North", btn);		add("Center", ta);
		setSize(300, 300);		setVisible(true);
		// ActionListener ��ư Ŭ��, List �Ǵ� Choice�� ����,
		btn.addActionListener(this); // ��ư�� �������� üũ
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { // x�� Ŭ�� ���� ��
				System.exit(0); // ���α׷� ���� ����
			}
		});
	}
	public static void main(String[] args) {
		new WIndowCl1();
	}
	public void actionPerformed(ActionEvent e) {
		// �ؽ�Ʈ�׾�� ���ڸ� ���̰� �� �ٲ�
		ta.append("��ư ������ \n");		
	}
}