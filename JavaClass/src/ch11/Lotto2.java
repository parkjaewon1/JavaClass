package ch11;
import java.util.Set;
import java.util.TreeSet;
public class Lotto2 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		// �ߺ��� �����ؼ� �˻� �ʿ����
		while (lotto.size() < 6 ) {
			int num = (int)(Math.random()*45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}