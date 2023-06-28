import java.util.*;
public class nine {
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


//combined both code 7th and 8th
5
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *    
