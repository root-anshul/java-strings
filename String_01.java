package strings;
import java.util.Scanner;
public class String_01 {
public static void main (String args[]) {
  Scanner in =new Scanner(System.in);
    int t=in.nextInt();
    while(t>0) {
        String str1=in.next();
        String str2=in.next();
        String ans="";
        for(int i =0;i<5;i++) {
            if(str1.charAt(i)==str2.charAt(i)) {
                ans=ans+"G";
            }
            else {
                ans=ans+"B";
            }
        }
        System.out.println(ans);
        t--;
    }
  
    
  
    
}
}
