package ch11;

import java.util.HashSet;

public class Set2 {

	public static void main(String[] args) {
		String[] snakes = {"±∏∑∑¿Ã","∆»∑∑¿Ã","±∏∑∑¿Ã","ƒ•∑∑¿Ã","∆»∑∑¿Ã","¿∞∑∑¿Ã"};
		HashSet<String> hs1 =new HashSet<>();
		HashSet<String> hs2 =new HashSet<>();
		
		for(String snake : snakes) {
			if(!hs1.add(snake)) {
				hs2.add(snake);
			}
		}
		System.out.println(hs1);
		System.out.println(hs2);
		hs1.removeAll(hs2);
		System.out.println(hs1);
		System.out.println(hs2);
		

	}

}
