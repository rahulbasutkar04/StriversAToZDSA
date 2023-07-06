import java.util.*;
public class eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input

        for(int i=0;i<n;i++)//row
        {

            for(char ch = (char) ('E'-i);ch<='E';ch++)
            {
                System.out.print(ch);
            }



            System.out.println();

        }

    }
}


//output
5
        E
        DE
        CDE
        BCDE
        ABCDE
