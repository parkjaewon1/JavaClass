package ch11;
public class Member2 implements Comparable<Member2>{
	String name;
	int age;
	public Member2(String name, int age) {
		this.name = name; this.age = age;
	}
	public int compareTo(Member2 o) {
		return name.compareTo(o.name);
	}
	public String toString() {
		return name+"("+age+")";
	}
}