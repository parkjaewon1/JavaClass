package ch08;
class SCV extends GroundUnit implements Repairable{
	SCV() { 	super(60);	hitPoint = MAX_HP;	}
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println( u.toString() + "�� ������ �������ϴ�.");
		}
	}
}
public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank); // SCV�� Tank�� �����ϵ��� �Ѵ�.
		scv.repair(dropship);
//		scv.repair(marine); // Reparable �������� ���ؼ� ���� �߻�		
	}
}