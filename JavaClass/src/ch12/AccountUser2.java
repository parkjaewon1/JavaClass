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
		// false/true번갈아 사용하여 : 입금과 출금을 교대로 5번 실행 
		for (int i = 0; i < 5; i++) {
			//  계좌를 동시에 사용하는 금지
			synchronized (act) {
				int amt = (int)(Math.random()*10000) + 1;
				if (flag) act.depoist(amt, name); // true 입금
				else act.withdraw(amt, name);     // false는 출금
			}			
			flag = !flag; // true면 false, false면 true
			act.print();
		}
	}
}