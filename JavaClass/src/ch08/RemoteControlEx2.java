package ch08;

public class RemoteControlEx2 {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("스피커를 켭니다");
			}

			public void turnOff() {
				System.out.println("스피커를 끕니다");
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub

			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();

	}
}