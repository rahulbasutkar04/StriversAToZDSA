//parameterized way
import java.util.Scanner;
public class SumOfN
{
    static  void  Sumofn(int i,int sum)
    {
        if(i<=0)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }

        Sumofn(i-1,sum+i);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       Sumofn(n,0);


    }
}
//functional recursion
import java.util.Scanner;
public class SumOfN
{
    static  int Sumofn(int sum)
    {
       if(sum==0) return 0;
       return sum + Sumofn(sum-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Sumofn(n));


    }
}
