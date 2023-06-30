import java.util.*;
public class fourteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input

        for(int i=0;i<n;i++)//row
        {
            for(char ch='A'; ch<='A'+i;ch++)
            {
                System.out.print(ch+"");
            }

            System.out.println();

        }

    }
}

output-
5
A
AB
ABC
ABCD
ABCDE
