package ch07;
class Product {
// 1. �Ű����� �ִ� ������ ����, 2.default������ �߰�, 3.�ڽ� ������ super(����)�߰�
	int price; // ��ǰ�� ����
	int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����
//	Product() {}
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}
class Tv extends Product {
	Tv() {		super(100);	}
	public String toString() {
		return "Tv";
	}
}
public class ProductEx {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}