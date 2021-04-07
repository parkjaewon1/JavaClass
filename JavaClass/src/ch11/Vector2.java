package ch11;
import java.util.Vector;
public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>(5); // �뷮(capacity)�� 5�� ��ü ����
		vec.add("1"); vec.add("2"); vec.add("3"); print(vec);
		vec.trimToSize();  print(vec); // ������ ���� ������ ���� (�뷮�� ũ�Ⱑ ��������)
		vec.ensureCapacity(6); print(vec); // �뷮�� 6���� �÷���
// �뷮�� �ʰ��ؼ� �����Ͱ� �þ�� �뷮�� 2��� Ȯ��, setSize ���ڴ� 0���� ���ڴ� null�� �߰�
		vec.setSize(7);   print(vec); // ������ ������ 7���� �÷���
		vec.clear();      print(vec); // ������ ����
	}
	private static void print(Vector<String> vec) {		
//		for(String st : vec) {
//			System.out.print(st+"\t");
//		}
		System.out.println(vec);
		System.out.println("���� : "+vec.size());     // ���� ������ �Ǽ�
		System.out.println("�뷮 : "+vec.capacity()); // ���� ����
	}
}