//printt numbers linearly 1,2,3,4....n
import java.util.*;
public class printNumbers {
    static  void pnum(int i,int n)
    {
        if(i>n) {
            System.out.println();
            return;
        }

        System.out.print(i+" ");
        pnum(i+1,n);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pnum(1,n);
        System.out.println("End");

    }
}
