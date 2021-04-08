package ch11;
class FruitBox {
	Object item;
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}

public class FruitBox1Ex {
	public static void main(String[] args) {
		FruitBox fb = new FruitBox();
		fb.store(new Orange(10));
		Orange og1 = (Orange)fb.pullOut();
		og1.showSugar();
		fb.store(new Apple(8));		
		// �������� ���� �������� ������ �� ������ �߻�
		Orange og2 = (Orange)fb.pullOut();
		og2.showSugar();
	}
}