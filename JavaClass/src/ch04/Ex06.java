package ch04;

public class Ex06 {
	
	public static void main(String[] args) {
		int [][] score = {{67,78,98},{78,98,65},{78,56,90}};
		int sum= 0, tot= 0, max= 0, min=100, tmax=0, tmin=100;
		System.out.println("����\t����\t����\t�հ�\t�ִ�\t�ּ�");
		System.out.println("============================================");
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
				tot += score[i][j];
				if(max < score[i][j]) max = score[i][j];
				if(tmax < score[i][j])tmax = score[i][j];
				if(min > score[i][j]) min = score[i][j];
				if(tmin > score[i][j])tmin = score[i][j];
			}
			System.out.print(sum+"\t"+max+"\t"+min+"\t");
			sum =0;		max=0;		min=100;
		}
		System.out.println("==========================================");
		System.out.print("�Ѱ� : "+tot+"\t �ִ� : "+tmax+"\t �ּ� : "+tmin+"\t");
	}
}
