package strings;

public class string2 {
public static void main(String[] args) {
    String str="the sky is blue";    
    for(int s=0;s<str.length();s++) {
        for(int e=s+1;e<=str.length();e++) {
            System.out.println(str.substring(s,e));
        }

    }
}
}
