package ch06;
//this만 있으면 객체 자신, this() 클래스 내에 다른 생성자
//this(매개변수,....) 같은 클래스에 다른 생성자 호출
//this() 생성자명 바로 아래 위치해야한다. 13번째줄 참고


public class Score1 {
	public Score1() {
		System.out.println("매개변수가 없는 생성자");
	}
	public Score1(String name) {
				this();
		System.out.println("매개변수 이름 : "+name);
				//this(); 생성자 내에서 첫째 줄에 있어야한다. 
	}
		public Score1(String name, int kor) {
			this(name); 
			System.out.println("매개변수 이름 : "+name+", 국어 : "+kor);
		}	
		void print() {
			System.out.println("확인");
		}
	
}
