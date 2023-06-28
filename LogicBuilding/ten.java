import java.util.*;
public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input

        for(int i=1;i<=2*n-1;i++)//row
        {
            int stars=i;
            if(i>n) stars=2*n-i;//if row greater than n thrn breaking operation
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


ouput-
5
*
**
***
****
*****
****
***
**
*

