package ch07;
public class Car {
	private String kind;
	private int inwon;	
    public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getInwon() {
		return inwon;
	}
	public void setInwon(int inwon) {
		this.inwon = inwon;
	}
	void print() {
    	System.out.println("=============");
    	System.out.println("�� ���� : "+ kind);
    	System.out.println("�����ο� : "+inwon);
    }
}
// Ambulance, Bus, FireEngine
// ȯ�ڸ� �¿�� ����. ���� ���� �ư� ����Ѵ� �Ҳ��� ���ؼ� �⵿�⵿�Ѵ�