package ch11;
import java.util.LinkedList;
public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("������"); list.add("�ȷ���"); list.add("ĥ����");
		list.add("������"); list.add("������"); print(list);
		// �ε��� 1���� ������ �߰��ϰ� ���
		list.add(1, "������"); print(list);
		// �ε��� 3���� ��������� �����ϰ� ���
		list.set(3, "�����"); print(list);
		// �ε��� 2�� ������ ����� ���
		list.remove(2);      print(list);
		// ������ ����� ���
		list.remove("������"); print(list); // �տ� �ִ� ������ �ϳ��� ����
	}
	private static void print(LinkedList<String> list) {
//		for(String snake : list) {
//			System.out.print(snake+"\t");
//		}
		System.out.println(list);
	}
}