package ch11;

import java.util.ArrayList;

public class Gene1 {

	public static void main(String[] args) {
		// ���ʸ� ������ �� ������ ���� ����
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add("���");
		list.add(3);
		list.add(4);
		list.add("���");
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		//list2.add("���");
		list2.add(3);
		list2.add(4);
		//list2.add("���");
		System.out.println(list2);
		

	}

}
