import java.util.*;
public class eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//input
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)//space
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++) //star
            {
                System.out.print("*");
            }
            for(int j=0;j<i;j++)//space
            {
                System.out.print(" ");
            }
            System.out.println();

        }

    }
}
//logic
// spase    start    space
// (i)  2*n-(2*i+1)  (i)
// for()->space
// for()->star
// for() ->space


output-


5
*********
 ******* 
  *****  
   ***   
    *    
