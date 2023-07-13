import java.util.*;
public class twentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input
        for(int i=0;i<2*n-1;i++) {

            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 1) - j;
                int down = (2 * n - 1) - i;

                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }


            System.out.println();


        }

        }
    }
    
 //   5
            555555555
            544444444
            543333334
            543222234
            543211234
            543211234
            543222234
            543333334
            544444444

