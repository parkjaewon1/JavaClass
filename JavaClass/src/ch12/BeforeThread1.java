package ch12;
public class BeforeThread1 extends Thread {
	public BeforeThread1(String name) {
		super(name);
	}
	private void addCar() {
		System.out.println("addCar");
		JoinTest.carList.add("�ҳ�Ÿ");
		JoinTest.carList.add("����Ÿ");
		JoinTest.carList.add("����Ÿ");
		JoinTest.carList.add("���̵�Ÿ");
	}
	public void run() {
		System.out.println(getName()+"����");
		try{	Thread.sleep(1000);
		} catch (InterruptedException e) {		}
		addCar();
	}
}