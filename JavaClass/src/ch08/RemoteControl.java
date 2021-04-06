package ch08;

public interface RemoteControl {
	//상수 public static final 생략
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0 ;
	//추상 메소드 public abstract 생략
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// default 메소드 실행부를 만들 수 있다.
	default void setMute(boolean mute) {
		if(mute) System.out.println("무음 처리합니다");
		else System.out.println("무음 해제합니다");
	}
	// static 메소드도 실행부를 만들 수 있다
	static void changeBattery() {
		System.out.println("건전지를 교환 합니다");
	}
}
