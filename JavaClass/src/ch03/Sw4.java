package ch03;

public class Sw4 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String msg = "";
		switch(month) {
		case 12:case 1 :case 2 :
			switch(month) {
			case 12: msg = "ÃÊ°Ü¿ï"; break;
			case 1: msg = "°Ü¿ï";    break;
			case 2: msg = "´Ê°Ü¿ï";  
			}     //ÁßÃ¸°¡´É.
			 msg = "°Ü¿ï";
			break;
		case 3:case 4 :case 5: 
		switch(month) {
		case 3: msg = "ÃÊº½"; break;
		case 4: msg = "º½";    break;
		case 5: msg = "´Êº½";  
		}     //ÁßÃ¸°¡´É.
		 msg = "º½";
		break;
		case 6:case 7 :case 8 : 
		switch(month) {
		case 6: msg = "ÃÊ¿©¸§"; break;
		case 7: msg = "¿©¸§";    break;
		case 8: msg = "´Ê¿©¸§";  
		}     //ÁßÃ¸°¡´É.
		msg = "¿©¸§";;
		break;
		case 9:case 10 :case 11 : 
		switch(month) {
		case 9: msg = "ÃÊ°¡À»"; break;
		case 10: msg = "°¡À»";    break;
		case 11: msg = "´Ê°¡À»";  
		}     //ÁßÃ¸°¡´É.
		msg = "°¡À»";
		break;
		default: msg = "¾ø´Â ´Þ"; break;
		}
		System.out.println(msg+"ÀÔ´Ï´Ù");
	}
}
