package ch08;
//������ �پ��ϰ� ���, ������ �Ǵ� overriding�� ���Ͽ� �پ��ϰ� ����

public interface Volume {
	void volumeUp();
	void volumeDown();
}

class Radio implements Volume{
	public void volumeUp() {
		System.out.println("���� ������ �÷���");
	}
	public void volumeDown() {
		System.out.println("���� ������ ������");
	}
}
class TV implements Volume{
	public void volumeUp() {
		System.out.println("TV ������ �÷���");
	}
	public void volumeDown() {
		System.out.println("TV ������ ������");
	}
}
class Speaker implements Volume{
	public void volumeUp() {
		System.out.println("����Ŀ ������ �÷���");
	}
	public void volumeDown() {
		System.out.println("����Ŀ ������ ������");
	}
}