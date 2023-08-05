//print 1 to n using backtrack approach
import  java.util.*;
public class BacktrackEx {
    static  void backtrackex(int i,int n)
    {
        if(i<1)
            return;

        backtrackex(i-1,n);
        System.out.println(i+" ");//remeber in backtrack the print stmt is after the funtion call
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     backtrackex(n,n);

        System.out.println("End");
    }
}
