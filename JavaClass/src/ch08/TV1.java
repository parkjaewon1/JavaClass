package ch08;

public  class TV1 implements RemoteControl{
	public void turnOn() {
		System.out.println("tv�� �մϴ�");
	}
	public void turnOff() {
		System.out.println("tv�� ���ϴ�");
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
class Radio1 implements RemoteControl{
	public void turnOn() {
		System.out.println("������ �մϴ�");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�");
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
}
