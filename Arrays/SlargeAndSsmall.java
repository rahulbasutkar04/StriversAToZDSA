//program to find second smallest and second  largest element in array without sorting
public class SlargeAndSsmall {
    public static void main(String[] args) {


        int[] arr = {1, 2, 7, 8, 4, 6, 5, 7, 7, 2};

        int large=arr[0];
        int slarge = -1;
        int small=arr[0];
        int ssmall = Integer.MAX_VALUE;

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if(arr[i]>large)
            {
                slarge=large;
                large=arr[i];
            }
            else if(arr[i]<large && arr[i]>large)
            {
                slarge=arr[i];
            }
            //for second smallest
            else if(arr[i]<small)
            {
                ssmall=small;
                small=arr[i];
            }
            else if(arr[i]!=small && arr[i]<ssmall)
            {
                ssmall=arr[i];

            }

        }
        System.out.println("Second largest is:"+slarge+"\tSecond Smallest is:"+ssmall);

    }
}
//output
Second largest is:7	Second Smallest is:2
  //time complexity=O(N)
