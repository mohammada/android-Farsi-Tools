package farsiTools;

public class Tools {

	public static Boolean enable = true;

	public static String fa(String s) {
		if (s == null) {
			return null;
		}

		if (!enable) {
			return s;
		}
		s = s.replace((char) 1740, (char) 1610);
		s = s.replace((char) 1563, (char) 59);
		s = s.replace((char) 1548, (char) 44);
		StringBuffer corrected = new StringBuffer();
		ArabicLigaturizer.shape(s.toCharArray(), corrected, 1);
		return corrected.toString();
	}
	
	//In Function baraye tabdil yek adad (int) englisi be yeh harf (string) farsi dorost shode
	//Morede estefadash tooye sa'at khahad bood, bekhatere hamin ta 59 edame dare
	//***************
	// Example code:
	//String addad25beFarsi = Tools.numtofa(25) 
	// ke dar mesal addad 25 besoorat font farsi ba output String return mishe
	//***************
	
	public static String numtofa(int num){
		
		String Farsi_9 = fa("۹");
		String Farsi_8 = fa("۸");
		String Farsi_7 = fa("۷");
		String Farsi_6 = fa("۶");
		String Farsi_5 = fa("۵");
		String Farsi_4 = fa("۴");
		String Farsi_3 = fa("۳");
		String Farsi_2 = fa("۲");
		String Farsi_1 = fa("۱");
		String Farsi_0 = fa("۰");
		
		String Farsi_number = "-1";
		
		switch (num) {
		case 59:
			Farsi_number = Farsi_5+Farsi_9;
			break;
		case 58:
			Farsi_number = Farsi_5+Farsi_8;
			break;
		case 57:
			Farsi_number = Farsi_5+Farsi_7;
			break;
		case 56:
			Farsi_number = Farsi_5+Farsi_6;
			break;
		case 55:
			Farsi_number = Farsi_5+Farsi_5;
			break;
		case 54:
			Farsi_number = Farsi_5+Farsi_4;
			break;
		case 53:
			Farsi_number = Farsi_5+Farsi_3;
			break;
		case 52:
			Farsi_number = Farsi_5+Farsi_2;
			break;
		case 51:
			Farsi_number = Farsi_5+Farsi_1;
			break;
		case 50:
			Farsi_number = Farsi_5+Farsi_0;
			break;
		case 49:
			Farsi_number = Farsi_4+Farsi_9;
			break;
		case 48:
			Farsi_number = Farsi_4+Farsi_8;
			break;
		case 47:
			Farsi_number = Farsi_4+Farsi_7;
			break;
		case 46:
			Farsi_number = Farsi_4+Farsi_6;
			break;
		case 45:
			Farsi_number = Farsi_4+Farsi_5;
			break;
		case 44:
			Farsi_number = Farsi_4+Farsi_4;
			break;
		case 43:
			Farsi_number = Farsi_4+Farsi_3;
			break;
		case 42:
			Farsi_number = Farsi_4+Farsi_2;
			break;
		case 41:
			Farsi_number = Farsi_4+Farsi_1;
			break;
		case 40:
			Farsi_number = Farsi_4+Farsi_0;
			break;
		case 39:
			Farsi_number = Farsi_3+Farsi_9;
			break;
		case 38:
			Farsi_number = Farsi_3+Farsi_8;
			break;
		case 37:
			Farsi_number = Farsi_3+Farsi_7;
			break;
		case 36:
			Farsi_number = Farsi_3+Farsi_6;
			break;
		case 35:
			Farsi_number = Farsi_3+Farsi_5;
			break;
		case 34:
			Farsi_number = Farsi_3+Farsi_4;
			break;
		case 33:
			Farsi_number = Farsi_3+Farsi_3;
			break;
		case 32:
			Farsi_number = Farsi_3+Farsi_2;
			break;
		case 31:
			Farsi_number = Farsi_3+Farsi_1;
			break;
		case 30:
			Farsi_number = Farsi_3+Farsi_0;
			break;
		case 29:
			Farsi_number = Farsi_2+Farsi_9;
			break;
		case 28:
			Farsi_number = Farsi_2+Farsi_8;
			break;
		case 27:
			Farsi_number = Farsi_2+Farsi_7;
			break;
		case 26:
			Farsi_number = Farsi_2+Farsi_6;
			break;
		case 25:
			Farsi_number = Farsi_2+Farsi_5;
			break;
		case 24:
			Farsi_number = Farsi_2+Farsi_4;
			break;
		case 23:
			Farsi_number = Farsi_2+Farsi_3;
			break;
		case 22:
			Farsi_number = Farsi_2+Farsi_2;
			break;
		case 21:
			Farsi_number = Farsi_2+Farsi_1;
			break;
		case 20:
			Farsi_number = Farsi_2+Farsi_0;
			break;
		case 19:
			Farsi_number = Farsi_1+Farsi_9;
			break;
		case 18:
			Farsi_number = Farsi_1+Farsi_8;
			break;
		case 17:
			Farsi_number = Farsi_1+Farsi_7;
			break;
		case 16:
			Farsi_number = Farsi_1+Farsi_6;
			break;
		case 15:
			Farsi_number = Farsi_1+Farsi_5;
			break;
		case 14:
			Farsi_number = Farsi_1+Farsi_4;
			break;
		case 13:
			Farsi_number = Farsi_1+Farsi_3;
			break;
		case 12:
			Farsi_number = Farsi_1+Farsi_2;
			break;
		case 11:
			Farsi_number = Farsi_1+Farsi_1;
			break;
		case 10:
			Farsi_number = Farsi_1+Farsi_0;
			break;
		case 9:
			Farsi_number = Farsi_9;
			break;
		case 8:
			Farsi_number = Farsi_8;
			break;
		case 7:
			Farsi_number = Farsi_7;
			break;
		case 6:
			Farsi_number = Farsi_6;
			break;
		case 5:
			Farsi_number = Farsi_5;
			break;
		case 4:
			Farsi_number = Farsi_4;
			break;
		case 3:
			Farsi_number = Farsi_3;
			break;
		case 2:
			Farsi_number = Farsi_2;
			break;
		case 1:
			Farsi_number = Farsi_1;
			break;
		case 0:
			Farsi_number = Farsi_0;
			break;
		}
		
		return Farsi_number;
	}

}
