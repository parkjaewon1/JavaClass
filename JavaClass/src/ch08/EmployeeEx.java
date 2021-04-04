package ch08;
public class EmployeeEx {
	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		emps[0] = new SalaryEmployee("����ũ", 2000000);
		emps[1] = new SalaryEmployee("BTS", 5000000);
		emps[2] = new HourlyEmployee("����", 100,800);
		emps[3] = new HourlyEmployee("����", 200,20000);
		emps[4] = new HourlyEmployee("���", 300, 10000);
		
		for(int i =0; i < emps.length; i++) {
			int sal = emps[i].computePay();
			int bonus = emps[i].computrIncentive();
			System.out.println("=== "+emps[i].getName()+"�� �ݿ� �� ====");
			System.out.println("�޿� : " + sal);
			System.out.println("���ʽ� : " + bonus);
		}
	}
}