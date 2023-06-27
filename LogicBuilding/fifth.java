import java.util.*;
public class fifth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//input
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
//login   n-row+1 =5-1+1=5
// 5-2+1=4
//5-3+1=3..


output-
5
  
* * * * * 
* * * * 
* * * 
* * 
* 
