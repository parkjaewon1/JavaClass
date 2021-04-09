package ch12;

public class AccountUser2 extends Thread {
	boolean flag; // default false
	Account2 act;
	String name;
	public AccountUser2(Account2 act, String name) {
		this.act = act;  this.name = name;
	}
	@Override
	public void run() {
		// false/true������ ����Ͽ� : �Աݰ� ����� ����� 5�� ���� 
		for (int i = 0; i < 5; i++) {
			//  ���¸� ���ÿ� ����ϴ� ����
			synchronized (act) {
				int amt = (int)(Math.random()*10000) + 1;
				if (flag) act.depoist(amt, name); // true �Ա�
				else act.withdraw(amt, name);     // false�� ���
			}			
			flag = !flag; // true�� false, false�� true
			act.print();
		}
	}
}