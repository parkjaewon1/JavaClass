package ch03;

public class Sw4 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String msg = "";
		switch(month) {
		case 12:case 1 :case 2 :
			switch(month) {
			case 12: msg = "�ʰܿ�"; break;
			case 1: msg = "�ܿ�";    break;
			case 2: msg = "�ʰܿ�";  
			}     //��ø����.
			 msg = "�ܿ�";
			break;
		case 3:case 4 :case 5: 
		switch(month) {
		case 3: msg = "�ʺ�"; break;
		case 4: msg = "��";    break;
		case 5: msg = "�ʺ�";  
		}     //��ø����.
		 msg = "��";
		break;
		case 6:case 7 :case 8 : 
		switch(month) {
		case 6: msg = "�ʿ���"; break;
		case 7: msg = "����";    break;
		case 8: msg = "�ʿ���";  
		}     //��ø����.
		msg = "����";;
		break;
		case 9:case 10 :case 11 : 
		switch(month) {
		case 9: msg = "�ʰ���"; break;
		case 10: msg = "����";    break;
		case 11: msg = "�ʰ���";  
		}     //��ø����.
		msg = "����";
		break;
		default: msg = "���� ��"; break;
		}
		System.out.println(msg+"�Դϴ�");
	}
}
