package strings;

public class reverse_string {
	public static void main(String[]args) {
		String str="the";
		
		System.out.println(str.substring(1));
	//System.out.println(reverseWords(str));	
		
	}
	 public static String reverseWords(String s) {
	       
			
			int i=s.length()-1;
			String ans="";
			while(i>=0) {
				while(i>=0 && s.charAt(i)==' ')i--;
			int j=i;	
			if(i<0) break;
			
			while(i>=0 && s.charAt(i)!=' ')i--;
			if(ans.isEmpty()) {
				ans=ans.concat(s.substring(i+1,j+1));
				System.out.println(ans);
			}
			else {
				ans=ans.concat(" "+ s.substring(i+1,j+1));
			}
			}
		    return ans;
		    }
}
