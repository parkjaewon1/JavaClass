package ch11;

public interface Car {
	void print();
}

class Bus implements Car{
	public void print() {
		System.out.println("버스");
	}
	void move() {
		System.out.println("40명이 탄다");
	}
}
class Taxi implements Car{
	public void print() {
		System.out.println("택시");
	}
}
class FireEngine implements Car{
	public void print() {
		System.out.println("소방차");
	}
}
class Ambulance{
	public void print() {
		System.out.println("앰뷸런스");
	}
}