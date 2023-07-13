import java.util.*;
public class ninteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input
        int initialspace=0;
        for(int i=0;i<n;i++)//row
        {

            //starts
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            //space
            for(int j=0;j<initialspace;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }


         initialspace+=2;

            System.out.println();

        }
        int insp=8;
        for(int i=1;i<=n;i++)
        {
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
          //space
            for(int j=0;j<insp;j++)
            {
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            insp-=2;

            System.out.println();



        }

    }
}


//output
5
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *
        **      **
        ***    ***
        ****  ****
        **********
