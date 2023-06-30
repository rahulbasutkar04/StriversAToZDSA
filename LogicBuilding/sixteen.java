import java.util.*;
public class fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input

        for(int i=0;i<n;i++)//row
        {
            char ch= (char) ('A'+ i);
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+"");
            }

            System.out.println();

        }

    }
}

//logic



output-
        5
        A
        BB
        CCC
        DDDD
        EEEEE
