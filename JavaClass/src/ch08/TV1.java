package ch08;

public  class TV1 implements RemoteControl{
	public void turnOn() {
		System.out.println("tv를 켭니다");
	}
	public void turnOff() {
		System.out.println("tv를 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
class Radio1 implements RemoteControl{
	public void turnOn() {
		System.out.println("라디오를 켭니다");
	}
	public void turnOff() {
		System.out.println("라디오를 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
}
