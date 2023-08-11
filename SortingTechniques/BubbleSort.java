import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={3,1,7,8,9,34,21,2};
        int n=arr.length;
        System.out.println("Before Swapping:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        for (int i = n - 1; i >=0; i--) {
            int didswap=0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didswap=1;
                }
            }


            if(didswap==0)
            {
                break;
            }
        }

        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}


//output
//time complexity worst=O(n^2) Best=O(n)  
Before Swapping:
3
1
7
8
9
34
21
2
Sorted array:
1
2
3
7
8
9
21
34
