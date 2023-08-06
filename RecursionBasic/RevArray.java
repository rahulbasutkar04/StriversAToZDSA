//Reverse array using recusrsion
import java.util.*;


public class RevArray {
    static void rev(int i,int arr[],int n)
    {
        if(i>=n/2) return;

        swap(arr, i, n - i - 1);
        rev(i+1,arr,n);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Before reverse:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        rev(0,arr,n);
        System.out.println("After reverse:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");

        }


    }
}
//output
Enter n:
5
Enter elements:
1
2
3
4
5
Before reverse:
1 2 3 4 5 
After reverse:
5 4 3 2 1 
