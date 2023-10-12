package strings;

public class to_uppercase {
public static void main(String []args) {
	String str="First leTTeR of EACH Word";
	
	StringBuilder sb= new StringBuilder("");
//	if(str.length()>2) {
//	char ch=Character.toUpperCase(str.charAt(0));
//	sb.append(ch);
//	}
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' '&& i<str.length()-1) {
			sb.append(str.charAt(i));
			sb.append(Character.toUpperCase(str.charAt(i)));
					
		}else {
			sb.append(Character.toLowerCase(str.charAt(i)));
		}
		
	}
	sb.toString();
	System.out.println(sb);
}
}
