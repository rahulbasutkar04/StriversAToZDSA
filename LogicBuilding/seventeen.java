import java.util.*;
public class seventeen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input

        for(int i=0;i<n;i++)//row
        {

            for(int j=0;j<n-i-1;j++)//space
            {
                System.out.print(" ");


            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++)//char
            {
                System.out.print(ch);
           if(j<=breakpoint) ch++;
           else ch--;
            }
            for(int j=0;j<n-i-1;j++)//space
            {
                System.out.print(" ");


            }



            System.out.println();

        }

    }
}

//output
5
    A    
   ABA   
  ABCBA  
 ABCDCBA 
ABCDEDCBA

