import java.util.*;
public class fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//input
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");//printing the row number
            }
            System.out.println();
        }

    }
}

output-

5
  
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
