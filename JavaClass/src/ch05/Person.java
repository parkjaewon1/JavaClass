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
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("취미 : "+hobby);
	}
}