package ch04;

public class Arr5 {

	public static void main(String[] args) {
		
		String[] fruit = {"�����","�ǵ���","������","���� ����","��ī�� ����"};
		for (int i = 0; i < fruit.length; i++) { // ������ 1�������� �ε����� 0���� ����
			System.out.println("fruits["+i+"] = "+fruit[i]);
		}
		System.out.println("================");
		
		for (int i = fruit.length-1; i >=0; i--) {
			System.out.println("fruits["+i+"] = "+fruit[i]);
		}
		
		System.out.println("================");
		for(String str:fruit) {    // �� �����ͺ��� �ϳ��� ������ͼ� ���
			System.out.println(str);
		}

		int[] arrs = {89,56,97,77,94};
		int sum1=0, sum2=0;
		
		for (int i = 0; i < arrs.length; i++) {
			sum1+=arrs[i];
		}
		for (int ar : arrs) {
			sum2+=ar;
		}
		System.out.println("�հ� = "+sum1);
		System.out.println("�հ� = "+sum2);
		
		
		}
}
