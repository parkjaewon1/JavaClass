package ch08;

public class RemoteControlEx1 {
	public static void main(String[] args) {
		RemoteControl[] rc = new RemoteControl[2];
		rc[0] = new TV1();
		rc[1] = new Radio1();
		
		for (int i = 0; i < rc.length; i++) {
			rc[i].turnOn();
			rc[i].turnOff();
			rc[i].setMute(false);
			RemoteControl.changeBattery();
			System.out.println("�ִ뺼�� : "+RemoteControl.MAX_VOLUME);
			System.out.println("�ּҺ��� : "+RemoteControl.MIN_VOLUME);
		}
		
	}
}
