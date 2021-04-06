package ch09;

public class Str4 {

	public static void main(String[] args) {
		String str = "우리는 친구였어, 곁에 있으면 든든한 친구";
		String str2 = str.substring(5,10);
		System.out.println(str2);
		
		String strs[] = str.split(" ");
		for(String st : strs) {
			System.out.print(st+"\t");
			
			if(st.endsWith("는")) System.out.println("는으로 끝 : "+st);
			
			if(st.startsWith("든")) System.out.println("든으로 시작 : "+st);
		}
		System.out.println("================================");
		
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println(str.indexOf(',')); //인덱스 위치 출력

	}

}
