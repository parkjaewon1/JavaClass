package ch09;

import java.util.*;

public class Cal1 {
	public static void main(String[] args) {
		Calendar cal =  Calendar.getInstance();
			System.out.printf("오늘은 %d년 %d월 %d일 입니다\n",
					cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE));
			System.out.println(cal.get(Calendar.DAY_OF_MONTH));
			System.out.println(cal.get(Calendar.DAY_OF_YEAR));
			
			Date date = new Date();
			System.out.println(date);
	}

}
