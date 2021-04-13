package ch19;
import java.util.Arrays;
import java.util.List;
public class MapAndReduceEx1 {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(new Student1("����", 20),
				new Student1("�浿", 25), new Student1("���ٴϿ�", 22));
		double avg = list.stream().mapToInt(Student1::getAge)
				.average().getAsDouble();
		System.out.printf("��� ���� : %.2f",avg);
	}
}