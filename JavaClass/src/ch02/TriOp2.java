package ch02;
public class TriOp2 {
	public static void main(String[] args) {
//		���������� 10�� ������ ����
//		247�����̸� �� �������� �ʿ��Ѱ��� 
		int cnt = 240, page;
		int cntPerPage = 10;
//		page = cnt / cntPerPage + 1; // ���� / ������ �ϸ� ����� ����
		page = cnt % cntPerPage == 0 ? cnt/cntPerPage : cnt / cntPerPage + 1;
		System.out.println("�� ������ �� : " + page);
	}
}