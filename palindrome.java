package strings;
import java.util.Scanner;
public class palindrome {
public static void main(String args[]) {
    Scanner in =new Scanner (System.in);
    String str="abcffopnbcba";
  
    System.out.println(palin(str));
    
}
public static Boolean palin(String str) {
 
    
    for(int i=0;i<str.length()/2;i++) {
        char s=str.charAt(i);
        char e=str.charAt(str.length()-1-i);
        if(s!=e) {
            return false;
        }
    
    }
    return true;
    
}
}
