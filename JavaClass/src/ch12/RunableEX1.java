package ch12;
// 다중 상속 등으로 Thread를 상속 받을 수 없을 때 대체로 Runnable을 구현
class Run1 implements Runnable {
	public void run() {
		for(int i= 0; i <10; i++) {
			System.out.println(Thread.currentThread().getName()+i+" ");
			try{	Thread.sleep(100);
			} catch (InterruptedException e) {}
		}		
	}	
}
public class RunableEX1 {
	public static void main(String[] args) {
		Run1 r1 = new Run1();	Run1 r2 = new Run1();	Run1 r3 = new Run1();
		// Runnable경우에는 Thread를 생성해서 사용해야 한다
		Thread th1 = new Thread(r1,"1번"); 
		Thread th2 = new Thread(r2,"2번");
		Thread th3 = new Thread(r3,"3번");
		th1.start();   th2.start();  th3.start();
	}
}