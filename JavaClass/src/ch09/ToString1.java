package ch09;
class Card {
	String kind;
	int number;
	public Card(String kind, int number) {
		this.kind = kind;  this.number = number;
	}
//	��ü�� ����� �� ������� ����
	public String toString() {
		return "ī��[����:"+kind+", ��ȣ:"+number+"]";
	}
	public boolean equals(Object obj) {
//		ī�� ������ ������ ���ٰ� ����
//		return kind.equals(((Card)obj).kind);
		return number ==((Card)obj).number;
	}
}

public class ToString1 {
	public static void main(String[] args) {
		Card card1 = new Card("�����̵�" , 10);
		Card card2 = new Card("�����̵�", 7);
		Card card3 = new Card("��Ʈ", 10);
//		�׳� ����ϸ� ��Ű����.Ŭ������@�ؽ��ڵ� : ch09.Card@4926097b
		System.out.println("card1 = " + card1);
		if (card1.equals(card2)) System.out.println("card1�� card2�� ����");
		else  System.out.println("card1�� card2�� �ٸ���");
		if (card1.equals(card3)) System.out.println("card1�� card3�� ����");
		else  System.out.println("card1�� card3�� �ٸ���");
	}
}