import java.util.*;
public class selectionSort {
    static  void selectionsort(int [] arr,int n)
    {
        for(int i=0;i<=n-2;i++)
        {
            int min=i;
            for(int j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements before sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);

        }
        System.out.println();
         selectionsort(arr,n);
        System.out.println("Elements after sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);

        }



    }
}
//output
//TimeComplexity:O(n^2)
Enter n:
5
1
4
7
11
0
Elements before sorting:
 1 4 7 11 0
Elements after sorting:
 0 1 4 7 11
Process finished with exit code 0
