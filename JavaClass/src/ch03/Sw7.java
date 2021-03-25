package ch03;

public class Sw7 {

	public static void main(String[] args) {
		int salary =Integer.parseInt(args[0]);
		String grade;
		
		switch(salary/1000000) {
		case 0: case 1: grade ="F"; break;
		case 2: case 3: grade ="E"; break;
		case 4: case 5: grade ="D"; break;
		case 6: case 7: grade ="C"; break;
		case 8: case 9: grade ="B"; break;
		default: grade ="A";
		}
		System.out.println("급여는"+salary+"이고 등급은"+grade+"입니다.");
	}

}
