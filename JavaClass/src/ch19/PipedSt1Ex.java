package ch19;
import java.util.ArrayList;
import java.util.List;
public class PipedSt1Ex {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member("����", 23, Member.FEMALE));
		list.add(new Member("����", 41, Member.MALE));
		list.add(new Member("�ϴ�", 31, Member.FEMALE));
		list.add(new Member("����", 27, Member.MALE));
		list.add(new Member("IU", 29, Member.FEMALE));
		
		double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("��ճ��� : "+avg);
		avg = list.stream().filter(m->m.getGender()==Member.MALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("������ճ��� : "+avg);
		avg = list.stream().filter(m->m.getGender()==Member.FEMALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.printf("������ճ��� : %.2f",avg);
	}
}