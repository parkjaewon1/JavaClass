package ch03;

public class If04 {

	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		String msg ="";
		if(money > 1000000) msg="����� Ÿ����";
		else if(money > 100000) msg="ktx Ÿ����";
		else if(money > 50000) msg="�ý� Ÿ����";
		else if(money > 10000) msg="���� Ÿ����";
		else msg="�ɾ� ������";
		System.out.println(msg);
	}

}
