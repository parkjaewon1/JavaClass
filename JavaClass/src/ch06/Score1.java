package ch06;
//this�� ������ ��ü �ڽ�, this() Ŭ���� ���� �ٸ� ������
//this(�Ű�����,....) ���� Ŭ������ �ٸ� ������ ȣ��
//this() �����ڸ� �ٷ� �Ʒ� ��ġ�ؾ��Ѵ�. 13��°�� ����


public class Score1 {
	public Score1() {
		System.out.println("�Ű������� ���� ������");
	}
	public Score1(String name) {
				this();
		System.out.println("�Ű����� �̸� : "+name);
				//this(); ������ ������ ù° �ٿ� �־���Ѵ�. 
	}
		public Score1(String name, int kor) {
			this(name); 
			System.out.println("�Ű����� �̸� : "+name+", ���� : "+kor);
		}	
		void print() {
			System.out.println("Ȯ��");
		}
	
}
