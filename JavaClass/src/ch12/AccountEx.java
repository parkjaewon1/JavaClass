package ch12;

public class AccountEx {
	public static void main(String[] args) {
		Account act = new Account(10000); // 통장 개설
		AccountUser[] au = new AccountUser[5]; // 5명이 통장 공유
		au[0] = new AccountUser(act, "공유");
		au[1] = new AccountUser(act, "세정");
		au[2] = new AccountUser(act, "원빈");
		au[3] = new AccountUser(act, "하니");
		au[4] = new AccountUser(act, "강다니엘");
		
		for (AccountUser a :au ) {
			a.start();
		}
	}
}