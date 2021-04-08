package ch11;
import java.util.Arrays;
import java.util.Collections;
public class ArraysMember2 {
	public static void main(String[] args) {
		Member2 m1 = new Member2("Çý¸®", 21);
		Member2 m2 = new Member2("Àç¼®", 48);
		Member2 m3 = new Member2("¿øºó", 35);
		Member2 m4 = new Member2("ÇÏ´Ï", 27);
		Member2 m5 = new Member2("°æ±Ô", 60);
		Member2[] members = {m1, m2, m3, m4, m5};
		System.out.println(Arrays.toString(members));
		Arrays.sort(members);	
		System.out.println(Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());	
		System.out.println(Arrays.toString(members));
	}
}
