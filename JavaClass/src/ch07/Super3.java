package ch07;
class G1 {
  String msg = "���"; 
  G1() {   System.out.println("�Ű������� ����");  }
  G1(String str) {  this(); 	  System.out.println("�Ű����� �ϳ� : "+ str);  }
  void g1() {	  System.out.println("�θ� �޼���");  }
}   
class G2 extends G1 {
	String msg = "�ʹ�";
	G2(String str) {	super(str);		System.out.println("�� �ڽ� ������");	}
	void g1() { 	System.out.println("�ڽĸ޼���");	}
	void print() {
		System.out.println("super.msg = "+super.msg);
		System.out.println("msg = "+msg);
		super.g1();		g1();
	}
}
public class Super3 {
	public static void main(String[] args) {
		G2 g2 = new G2("�� ~ "); 
		System.out.println("msg = "+g2.msg);
		g2.g1();   g2.print();
	}	
}