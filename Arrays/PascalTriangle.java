
import java.util.ArrayList;

public class pasacaltriangle{
    public static int varient1(int n,int r)      //by calculating=n!/r!*(n-r)!
    {
        int res=1;
       for(int i=0;i<r;i++)
       {
           res=res*(n-i);
           res=res/(i+1);
       }
        return res;
    }
    public static void varient2(int n)
    {
        int res=1;
        System.out.print(res+" ");

        for(int i=1;i<n;i++)
        {
            res=res*(n-i);
            res=res/i;

            System.out.print(res+" ");
        }
    }
    public static void  varient3(int row)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int res=1;
        ans.add(1);
        for(int col=1;col<row;col++)
        {
            res=res*(row-col);
            res=res/col;

            ans.add(res);
        }
        System.out.println(ans);

    }

    public static void main(String[] args){

        int r = 5; // row number
        int c = 3; // col number
        int element = varient1(r-1, c-1);
        System.out.println("Result of varient of 1:");
        System.out.println("The element at position (r,c) is: " + element);
        System.out.println("Result of Varient 2:");
        int n=5;
        varient2(n);
        System.out.println("Result of varient 3:");
        int row=5;
        for(int i=1;i<=row;i++) {
            varient3(i);
        }



    }
}
//output
Result of varient of 1:
The element at position (r,c) is: 6

Result of Varient 2:
1 4 6 4 1 

Result of varient 3:
[1]
[1, 1]
[1, 2, 1]
[1, 3, 3, 1]
[1, 4, 6, 4, 1]

