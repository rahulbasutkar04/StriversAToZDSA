//print n times name using recursion
import java.util.*;
public class printNnum {
    static void printName(int i,int n)
    {
        if(i>n) return;  //base condition

        System.out.println("Rahul");
        printName(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        printName(1,n);


    }
}
