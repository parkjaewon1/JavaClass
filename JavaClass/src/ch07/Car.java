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
    	System.out.println("차 종류 : "+ kind);
    	System.out.println("승차인원 : "+inwon);
    }
}
// Ambulance, Bus, FireEngine
// 환자를 태우고 간다. 많은 손을 싣고 출발한다 불끄기 위해서 출동출동한다