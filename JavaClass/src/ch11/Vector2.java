package ch11;
import java.util.Vector;
public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>(5); // 용량(capacity)이 5인 객체 생성
		vec.add("1"); vec.add("2"); vec.add("3"); print(vec);
		vec.trimToSize();  print(vec); // 데이터 없는 공간을 삭제 (용량과 크기가 같아진다)
		vec.ensureCapacity(6); print(vec); // 용량을 6으로 늘려라
// 용량을 초과해서 데이터가 늘어나면 용량을 2배로 확대, setSize 숫자는 0으로 문자는 null로 추가
		vec.setSize(7);   print(vec); // 데이터 갯수를 7개로 늘려라
		vec.clear();      print(vec); // 데이터 삭제
	}
	private static void print(Vector<String> vec) {		
//		for(String st : vec) {
//			System.out.print(st+"\t");
//		}
		System.out.println(vec);
		System.out.println("갯수 : "+vec.size());     // 실제 데이터 건수
		System.out.println("용량 : "+vec.capacity()); // 저장 공간
	}
}