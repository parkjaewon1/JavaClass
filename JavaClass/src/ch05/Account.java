package ch05;
public class Account {
	String accountNo; // ���¹�ȣ
	String name;      // ������
	int balance;      // �ܾ�
	public Account(String acNo, String na, int bal) {
		accountNo = acNo;  name = na; balance = bal;
	}
	void deposit(int money) { // ����
		balance += money;
		System.out.println(name+"�Ա� : " + money);
	}
	void withdraw(int money) { // ���
		if (balance >= money) {
			balance -= money;
			System.out.println(name+"��� : " + money);
		} else System.out.println("���� ! �ܾ��� ���� !!");		
	}
	void disp() {
		System.out.println("== ���¹�ȣ ==="+accountNo);
		System.out.println("������ : "+name);
		System.out.println("�ܾ� : "+balance);
	}
}