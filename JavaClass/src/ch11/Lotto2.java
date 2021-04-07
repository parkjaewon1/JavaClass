package ch11;
import java.util.Set;
import java.util.TreeSet;
public class Lotto2 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		// 중복을 방지해서 검사 필요없다
		while (lotto.size() < 6 ) {
			int num = (int)(Math.random()*45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}