package ch11;
public class Orange {
	int sugarContent;  // ��� �Է�
	public Orange(int sugarContent) {
		this.sugarContent = sugarContent;
	}
	public void showSugar() {
		System.out.println("�絵 : " + sugarContent);
	}
}

class Apple {
	int weight; // ��� ����
	public Apple(int weight) {
		this.weight = weight;
	}
	public void showWeight() {
		System.out.println("���� : " + weight);
	}
}