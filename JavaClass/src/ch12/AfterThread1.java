package ch12;
import java.util.ArrayList;
public class AfterThread1 extends Thread{
	public AfterThread1(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName()+"����");
		ArrayList<String> carList = JoinTest.carList;
		for(String str : carList) 
			System.out.println(str);
	}
}