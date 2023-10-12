package strings;

public class dubli_str {
	public static void main(String[] args) {
		String str="aabbccccdde";
		String s=str.charAt(0)+"";
		StringBuilder sb= new StringBuilder();
		sb.append(str.charAt(0));
		
		for(int i=1;i<str.length();i++) {
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);;
			if(prev!=curr) {
				sb.append(curr);
			}
			
		}
		
		System.out.println(sb);
		compress(str);
		
}

	private static void compress(String str) {
		StringBuilder sb= new StringBuilder();
		int count=1;
		sb.append(str.charAt(0));
		
		for(int i=1;i<str.length();i++) {
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);;
			if(prev==curr) {
				count++;
			}
			
			
			else {
				if(count>1) {
					sb.append(count);
					count=1;
				}
				sb.append(curr);
				}
			
		
		
		}
		if(count>1) {
			sb.append(count);
			count=1;
		}

		System.out.println(sb);
		
	}
	
}