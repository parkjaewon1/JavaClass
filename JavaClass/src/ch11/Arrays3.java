package ch11;

import java.util.Arrays;

public class Arrays3 {

	public static void main(String[] args) {
		int[] scores = {99,48,68};
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε��� : "+index);
		
		String[] names = {"ȫ�浿","�ڹ���","��ö��"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε��� : "+index);
		
		Member1[] members = new Member1[3];
		members[0] = new Member1("ȫ�浿");
		members[1] = new Member1("�ڹ���");
		members[2] = new Member1("��ö��");
		
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}

}
