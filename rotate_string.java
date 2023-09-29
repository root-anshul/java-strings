package strings;

public class rotate_string {
public static void main(String[]args) {
	String s = "abcde", goal = "cdea";
	boolean str=rotateString(s,goal);
	System.out.println(str);
}
public static boolean rotateString(String s, String goal) {
    return (s. length ()==goal. length() && (s+s) . contains (goal));
}
}
