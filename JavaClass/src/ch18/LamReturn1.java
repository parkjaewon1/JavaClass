package ch18;
@FunctionalInterface
interface MyInter3 {
	int methid(int x, int y);
}
public class LamReturn1 {
	public static void main(String[] args) {
		MyInter3 mi;
		mi = (x,y)-> {
			int result = x + y;
			return result;
		};
		System.out.println("결과 : "+mi.methid(12,7));
		mi = (x,y)-> { return x + y; };
		System.out.println("결과 : "+mi.methid(12,11));
		mi = (x,y)->  x + y;
		System.out.println("결과 : "+mi.methid(21,11));
	}
}