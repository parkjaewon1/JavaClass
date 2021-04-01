package ch06;

public class Single1 {
	private static Single1 Instance = new Single1();
	Single1(){}
	public static Single1 getInstance() {
		return Instance;
		
	}

}
