package ch09;

import java.util.GregorianCalendar;

public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();  // Calendar추상 클래스
		// 월은 0월 ... 11월 이므로 1을 추가
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", 
			cal.get(GregorianCalendar.YEAR), cal.get(GregorianCalendar.MONTH)+1,cal.get(GregorianCalendar.DATE));
		System.out.println(cal.get(GregorianCalendar.DAY_OF_MONTH));
		// 31 + 28 + 31 + 6 : 1년 중에 몇 일
		System.out.println(cal.get(GregorianCalendar.DAY_OF_YEAR));
	}
}
