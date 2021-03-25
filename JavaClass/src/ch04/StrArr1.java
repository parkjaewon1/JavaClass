package ch04;
public class StrArr1 {
	public static void main(String[] args) {
		for (String str:args) {
			System.out.println(str);
		}
		System.out.println("===============");
		for (int i =0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}