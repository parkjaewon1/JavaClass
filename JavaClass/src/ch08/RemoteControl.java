package ch08;

public interface RemoteControl {
	//��� public static final ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0 ;
	//�߻� �޼ҵ� public abstract ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// default �޼ҵ� ����θ� ���� �� �ִ�.
	default void setMute(boolean mute) {
		if(mute) System.out.println("���� ó���մϴ�");
		else System.out.println("���� �����մϴ�");
	}
	// static �޼ҵ嵵 ����θ� ���� �� �ִ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ �մϴ�");
	}
}
