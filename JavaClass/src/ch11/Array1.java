package ch11;
import java.util.ArrayList;
import java.util.Iterator;
public class Array1 {
	public static void main(String[] args) {
//		제네릭스(Generics) al1에는 문자열만 저장
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("구렁이"); al1.add("팔렁이"); al1.add("칠렁이"); 
		al1.add("육렁이"); al1.add("구렁이");
		System.out.println("데이터 건수 : "+al1.size());
		for (int i =0; i < al1.size();i++) {
			System.out.println(al1.get(i)); // 해당하는 인덱스 데이터 가져오기
		}
		System.out.println("=================");
		for(String snake :al1) {
			System.out.println(snake);
		}
		System.out.println("=================");
		Iterator<String> its = al1.iterator(); // Iterator형식으로 al1에 있는 데이터 추출하여 저장
		while(its.hasNext()) { // 읽을 데이터를 가지고 있니
			System.out.println(its.next()); // 다음 데이터를 가지고 와서 출력
		}
	}
}