package ch19;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
public class SortingEx1 {
	public static void main(String[] args) {
		IntStream intStram = Arrays.stream(new int[] {5,2,4,3,1});
		intStram.sorted().forEach(n->System.out.print(n+","));
		System.out.println();
		List<Student2> list = Arrays.asList(
				new Student2("IU", 90), new Student2("�ϴ�", 76),
				new Student2("ö��", 77), new Student2("����", 88)); 
		list.stream().sorted().forEach(s->System.out.print(s.getScore()+", "));
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder())
			.forEach(s->System.out.print(s.getScore()+", "));
		System.out.println();
	}
}