package ch05;
public class Person {
	String name; int age; String hobby;
	Person() {}
	Person(String n) {
		name = n;
	}
	Person(String n, int a) {
		name = n; age = a;
	}
	Person(String n, int a, String h) {
		name = n; age = a; hobby = h;
	}
	void print() {
		System.out.println("===================");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("��� : "+hobby);
	}
}