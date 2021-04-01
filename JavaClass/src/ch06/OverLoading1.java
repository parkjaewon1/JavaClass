package ch06;

class E2{
	int add(int x,int y) {
		return x + y;
	}

	double add(double x,double y) {
		return x + y;
	}
	String add(String name) {
		return "¾È³çÇÏ¼¼¿ä " +name+"´Ô";
	}
}

public class OverLoading1 {
	public static void main(String[] args) {
		E2 e = new E2();
		System.out.println(e.add(12,15));
		System.out.println(e.add(3.5,7.2));
		System.out.println(e.add("Ã¶¼ö"));
}
}
