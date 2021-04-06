package ch09;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
public class SImpleDate2 {
	public static void main(String[] args) {
//		2013년 3월 5일 12시 25분 30초 생성
		GregorianCalendar gc = new GregorianCalendar(2013,2,5,12,25,30);
//		년도 2자리 - 월2 - 일 시:분:초
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
//		(요일)년도 4자리/월/일 (오전/오후)시:분:초 
		SimpleDateFormat sdf2 = 
				new SimpleDateFormat("(E)yyyy/MM/dd (a)hh:mm:ss");
		Date date = gc.getTime();
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
	}
}