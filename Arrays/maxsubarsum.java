//maximum subarray sum using kadane's algorithm
public class maxsubarsum {
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int sum=0;
        int maxl=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(sum>maxl) maxl=sum;
            if(sum<0) sum=0;

        }

        System.out.println("Maximum sum of subarray is:"+maxl);
    }
}
//output     TC=O(N)
Maximum sum of subarray is:6
