package ch04;

public class Arr5 {

	public static void main(String[] args) {
		
		String[] fruit = {"산딸기","판딸기","집딸기","죽은 딸기","알카리 딸기"};
		for (int i = 0; i < fruit.length; i++) { // 갯수는 1부터지만 인덱스는 0부터 시작
			System.out.println("fruits["+i+"] = "+fruit[i]);
		}
		System.out.println("================");
		
		for (int i = fruit.length-1; i >=0; i--) {
			System.out.println("fruits["+i+"] = "+fruit[i]);
		}
		
		System.out.println("================");
		for(String str:fruit) {    // 앞 데이터부터 하나씩 가지고와서 출력
			System.out.println(str);
		}

		int[] arrs = {89,56,97,77,94};
		int sum1=0, sum2=0;
		
		for (int i = 0; i < arrs.length; i++) {
			sum1+=arrs[i];
		}
		for (int ar : arrs) {
			sum2+=ar;
		}
		System.out.println("합계 = "+sum1);
		System.out.println("합계 = "+sum2);
		
		
		}
}
