//to get the  fibonacci number of given number using multiple recursion
import java.util.*;
public class fibonacci {

    static int help(int n){
        if(n<=1) return n;
        int last=help(n-1);
        int slast=help(n-2);
        return last+slast;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(help(n));
    }
}
