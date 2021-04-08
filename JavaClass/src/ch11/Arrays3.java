package ch11;

import java.util.Arrays;

public class Arrays3 {

	public static void main(String[] args) {
		int[] scores = {99,48,68};
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("Ã£Àº ÀÎµ¦½º : "+index);
		
		String[] names = {"È«±æµ¿","¹Ú¹®¼ö","±èÃ¶¼ö"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "È«±æµ¿");
		System.out.println("Ã£Àº ÀÎµ¦½º : "+index);
		
		Member1[] members = new Member1[3];
		members[0] = new Member1("È«±æµ¿");
		members[1] = new Member1("¹Ú¹®¼ö");
		members[2] = new Member1("±èÃ¶¼ö");
		
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}

}
