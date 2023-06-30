import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input

        for(int i=0;i<n;i++)//row
        {
            for(char ch='A'; ch<='A'+(n-i-1);ch++)
            {
                System.out.print(ch+"");
            }

            System.out.println();

        }

    }
}

//logic

5
ABCDE
ABCD
ABC
AB
A


