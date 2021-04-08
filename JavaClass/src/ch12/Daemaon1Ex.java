package ch12;
class DaeMon1 extends  Thread {
	public void run() {
		while(true) {
			System.out.println("µ¥¸ó");
			try {Thread.sleep(300);	} catch (InterruptedException e) {	}
		}
	}
}

public class Daemaon1Ex {
	public static void main(String[] args) {
		DaeMon1 dm = new DaeMon1();
		dm.setDaemon(true);
		dm.start();
		for(int i = 1; i < 20; i++) {
			System.out.println(i);
			try {Thread.sleep(300);	} catch (InterruptedException e) {	}
		}
	}
}