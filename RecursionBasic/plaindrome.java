//recursive method to check if string is palindrome or not
import java.util.*;
public class palindrome {
    static  boolean check(int i,String s)
    {
        if(i>=s.length()/2) return  true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return check(i+1,s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.next();
        System.out.println(check(0,s));
    }
}
