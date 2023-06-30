import java.util.*;
public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input
        int space =2*(n-1);
        for(int i=0;i<=n;i++)//row
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            space-=2;

        }

    }
}

//logic 
//number space number
// declare space=2*n-1       
// first inner loop will be for(j=1;<=i;j++)
// second inner loop for space for(j=1;j<=space;j++)
// third inner loop for number i.e reverse of first inner loop for(j=1;j>=1;j--)
//     update space to space -2 every time

output-
  6
          
1        1
12      21
123    321
1234  4321
1234554321
12345665432



