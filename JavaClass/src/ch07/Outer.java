package ch07;
public class Outer {
	private int height;
	private int width;
	public Outer(int height, int width) {
		this.height = height;  this.width = width;
	}
	public Inner getInner() {
		return new Inner();
	}
	// Inner class�� �ܺ� Ŭ������ �������. �޼��带 �ڱ�� ó�� ��� ����
	class Inner { // Ŭ���� �ȿ� �ִ� Ŭ����
		private float rate = 0.5f;
		public float volume() {
			return rate * height  * width;
		}
	}
}