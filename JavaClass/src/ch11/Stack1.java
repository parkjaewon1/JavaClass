package ch11;
import java.util.Stack;
public class Stack1 {
	public static void main(String[] args) {
		String[] nations = {"�̱�", "�߱�", "�ѱ�", "����", "����","����"};
		Stack<String> stack = new Stack<>();
		for (String nation : nations) {
			stack.push(nation); // ������ ���� ���
		}
		
		while(!stack.isEmpty()) { // ������ ������ ���� ������ ����
			System.out.println(stack.pop());
		}
	}
}