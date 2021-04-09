package ch12;

public class AccountUser extends Thread {
	boolean flag; // default false
	Account act;
	String name;
	public AccountUser(Account act, String name) {
//		super(name); // Thread�̸�
		this.act = act;  this.name = name;
	}
	@Override
	public void run() {
		// �Աݰ� ����� ����� 5�� ����
		for (int i = 0; i < 5; i++) {
			int amt = (int)(Math.random()*10000) + 1;
			if (flag) act.deposit(amt, name);
			else act.withdraw(amt, name);
			flag = !flag; // true�� false, false�� true
			act.print();
		}
	}
}