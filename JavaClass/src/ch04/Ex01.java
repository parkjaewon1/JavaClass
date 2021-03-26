package ch04;
public class Ex01 {
	public static void main(String[] args) {
		int[] score = {76, 45, 35, 89, 100, 50, 90, 92};
		// 합계sum, 평균avg, 최고점max, 최소점 min
		// 최대값은 작은 값, 최소값은 큰값으로 초기화,
		// 범위를 벗어나는 큰 값이 최대값이면 안됨, 최소값 범위를 벗어나는 작은 값으로 초기화 하면 안됨 
		int sum = 0, max = score[0], min = score[0];
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if (score[i] > max) max = score[i];
			if (score[i] < min) min = score[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/score.length);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("=====================");
		sum = 0;
		max = score[0];
		min = score[0];
		// 확장 for
		for(int sc :score) {
			sum += sc;
			if (sc > max) max = sc;
			if (sc < min) min = sc;
		}
		float avg = (float)sum/score.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("=====================");
	}
}