package ch03;
public class IfEx {
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		String msg = "";
		if (value < 10) msg = "10 �̸��� ���Դϴ�";
		else if (value <100) msg = "10�̻� 100 �̸��� �� �Դϴ�";
		else if(value < 1000) msg = "100�̻� 1000 �̸��� ���Դϴ�";
		else msg = "1000 �̻��� ���Դϴ�";
		System.out.println(msg);
	}
}