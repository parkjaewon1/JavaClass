package ch11;
import java.util.ArrayList;
public class Array3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("������"); list.add("�ȷ���"); list.add("ĥ����");
		list.add("������"); list.add("������"); print(list);
		// �ε��� 1���� ������ �߰��ϰ� ���
		list.add(1, "������"); print(list);
		// �ε��� 3���� ��������� �����ϰ� ���
		list.set(3, "�����"); print(list);
		// �ε��� 2�� ������ ����� ���
		list.remove(2);      print(list);
		// ������ ����� ���
		list.remove("������"); print(list);
	}
	private static void print(ArrayList<String> list) {
		for(String snake : list) {
			System.out.print(snake+"\t");
		}
		System.out.println();
	}
}