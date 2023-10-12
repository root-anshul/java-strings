package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequence_of_string {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "abc";
		ArrayList<String> res = gss(str);
		System.out.println(res); 
	}
	
//bc -> [--, -c, b-, bc]
// abc -> [---,--c, -b-, -bc, a--, a-c, ab-, abc]
	
	public static ArrayList<String> gss(String str){
		if(str.length()==0) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		char ch=str.charAt(0);//a
		String ros=str.substring(1);//bc
		ArrayList<String> res= gss(ros); 
		
		ArrayList<String> mres=new ArrayList<>();
		
		for(String r:res) {
			mres.add(ch+r);
			
		}
		for(String r:res) {
			mres.add(""+r);
			
		}
		return mres;
	}
}
