package ch09;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		// ���ڿ��� �ĸ��� �����ؼ� ��� ��.										delemiter
		StringTokenizer st = new StringTokenizer("���, �ٳ���, ��, ������, Ű��",",");
		while(st.hasMoreTokens()) { // ��ū�� ������
			//���ʴ�� ���� ��ū�� �����Ͷ�
			System.out.println(st.nextToken());
		}
		

	}

}
