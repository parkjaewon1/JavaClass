package ch04;
public class ArrCpy3 {
	public static void main(String[] args) {
		String cities[] = {"����","�뱸","��õ","���","����","õ��"};
		String nations[] = new String[]{"���ѹα�","�̱�","����","�Ϻ�","������"};
		String newArray[] = new String[cities.length+nations.length];
		System.arraycopy(cities, 0, newArray, 0, cities.length);
		System.arraycopy(nations, 0, newArray, cities.length, nations.length);
		for (String ar : newArray) {
			System.out.println(ar);
		}
	}
}