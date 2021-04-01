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
	// Inner class는 외부 클래스의 멤버변수. 메서드를 자기것 처럼 사용 가능
	class Inner { // 클래스 안에 있는 클래스
		private float rate = 0.5f;
		public float volume() {
			return rate * height  * width;
		}
	}
}