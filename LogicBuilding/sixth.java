import java.util.*;
public class sixth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//input
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");//printing the row number
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
  
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
