package ch12;

public class AccountEx {
	public static void main(String[] args) {
		Account act = new Account(10000); // ���� ����
		AccountUser[] au = new AccountUser[5]; // 5���� ���� ����
		au[0] = new AccountUser(act, "����");
		au[1] = new AccountUser(act, "����");
		au[2] = new AccountUser(act, "����");
		au[3] = new AccountUser(act, "�ϴ�");
		au[4] = new AccountUser(act, "���ٴϿ�");
		
		for (AccountUser a :au ) {
			a.start();
		}
	}
}