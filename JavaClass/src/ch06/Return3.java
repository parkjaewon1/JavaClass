package ch06;

public class Return3 {

	public static void main(String[] args) {
		String name[] = {"����","����","��","����"};
		for(String n: name) {
			String msg = call(n);
			System.out.println(msg);
		}

	}
	static String call(String n) {
		return n+"�� �ȳ��ϼ���";
	}

}
