import java.util.*;
public class seven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//input
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)//space
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++) //star
            {
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++)//space
            {
                System.out.print(" ");
            }
            System.out.println();

        }

    }
}
//logic
// spase    start    space
// (n-i-1)  (2*i+1)  (n-i-1)
// (5-0-1)  (2*0+1)  (5-0-1)
//  4       1        4
//           *
//          ***     ...
// for()->space
// for()->star
// for() ->space

output-

5
  
    *    
   ***   
  *****  
 ******* 
*********
