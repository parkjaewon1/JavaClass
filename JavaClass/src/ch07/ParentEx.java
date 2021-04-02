package ch07;

class Parent {
	int x = 100;  //200

	Parent() { //4   (3)�� ���� �����Ƿ� 
		this(200); //  5  Parent(int x)�� ȣ��
	}
	Parent(int x) {    //6
		this.x = x;
	}
	int getX() {   
		return x;
	}
}
class Child extends Parent {
	int x = 3000;  //1000
	Child() { // 2 new Child() <-- �ƹ��͵� �����Ƿ�
		this(1000); // Child(int x)�� ȣ��
	}
	Child(int x) { // 3
		System.out.println("c 1 x ="+this.x);
		System.out.println("c 1 x ="+super.x);
		this.x = x; // 7
		System.out.println("c 2 x ="+this.x);
		System.out.println("c 2 x ="+super.x);
	}
	int getX() {    //��ġ������ ���� �ٸ��� ���´�. (������� ���� return)
		return x;
	}
}

public class ParentEx {
	public static void main(String[] args) {
		Child c = new Child(); // 1
		System.out.println("x=" + c.getX());
	}
}