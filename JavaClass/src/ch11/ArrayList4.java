package ch11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayList4 {
	public static void main(String[] args) {
		String[] fruits = {"�����", "�ǵ���", "�����", "�λ����"};
		ArrayList<String> list = new ArrayList<>();
		for(String fruit : fruits) {
			list.add(fruit);
		}
		for(String str : list) {
			System.out.println(str);
		}
		list.clear(); // �� �����
		List<String> list2 = Arrays.asList("ö��","�浿","����","�ʴ�");
		for(String a : list2) {
			System.out.println(a);
		}
	}
}
