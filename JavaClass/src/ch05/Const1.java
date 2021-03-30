package ch05;
class Car4 {
	String color;	int displacement;	String kind;
// 생성자가 하나도 없으면 compile할 때 자동으로 default생성자를 만들어 준다
// default 생성자 : 매개변수가 하나도 없는 생성자
	Car4() {	 } // 생성자
	Car4(String c, int d, String k) {
		color = c; displacement = d; kind = k;
	}
	void print() {
		System.out.println("=====================");
		System.out.println("종류 : "+kind);
		System.out.println("배기량 : "+displacement);
		System.out.println("색깔 : "+color);
	}
}
public class Const1 {
	public static void main(String[] args) {
		Car4 c1 = new Car4(); 
		c1.color = "파랑"; c1.displacement=1000; c1.kind="모닝";	c1.print();
		Car4 c2 = new Car4("노랑",2000,"소나타");
		c2.print();
	}
}