import java.util.*;
public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input
        int numb=1;
        for(int i=0;i<=n;i++)//row
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(numb+" ");
                numb++;
            }

            System.out.println();

        }

    }
}

output-
5

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
