package ch05;
public class Car2 {
	String carNo; // 차량번호
	int inTime;   // 입차시간
	int outTime;  // 출차시간
	int fee;      // 주차요금
	final int MONEYPERHOUR = 5000; // 시간당 요금, 고정
	Car2(String c, int in, int out) {
		carNo = c; inTime = in; outTime = out;
	}
	void calFee() {
		fee = (outTime - inTime) * MONEYPERHOUR;
	}
	void print() {
		System.out.println("================");
		System.out.println("차량번호 : "+ carNo);
		System.out.println("입차시간 : "+inTime);
		System.out.println("출차시간 : "+outTime);
		System.out.println("주차요금 : "+fee);
	}
}