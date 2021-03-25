package ch02;
public class TriOp2 {
	public static void main(String[] args) {
//		한페이지에 10개 문장을 쓴다
//		247문장이면 몇 페이지가 필요한가요 
		int cnt = 240, page;
		int cntPerPage = 10;
//		page = cnt / cntPerPage + 1; // 정수 / 정수를 하면 결과도 정수
		page = cnt % cntPerPage == 0 ? cnt/cntPerPage : cnt / cntPerPage + 1;
		System.out.println("총 페이지 수 : " + page);
	}
}