package ch12;

public class AccountEx2 {
	public static void main(String[] args) {
		Account2 act = new Account2(10000); // ���� ����
		AccountUser2[] au = new AccountUser2[5]; // 5���� ���� ����
		au[0] = new AccountUser2(act, "����");
		au[1] = new AccountUser2(act, "����");
		au[2] = new AccountUser2(act, "����");
		au[3] = new AccountUser2(act, "�ϴ�");
		au[4] = new AccountUser2(act, "���ٴϿ�");
		
		for (AccountUser2 a :au ) {
			a.start();
		}
	}
}