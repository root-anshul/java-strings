package strings;

import java.util.Arrays;

public class longest_common_prefix {
	public static void main(String []args) {
		String[] strs={"flower","flow","flight"};
		//System.out.println(strs.length);
		StringBuilder sb=new StringBuilder();
		
		Arrays.sort(strs);
		char[]first=strs[0].toCharArray();
		char[]last=strs[strs.length-1].toCharArray();
		
		for(int i=0;i<first.length;i++) {
			if(first[i]!=last[i]) {
				break;
			}
			sb.append(first[i]);
		}
		System.out.println(sb);
	}
}
