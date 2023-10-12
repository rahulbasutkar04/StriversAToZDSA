//largestsubarraysum or painters partition(split the into k subarray such that maximum sum of subarray has miminum sum)
import java.util.*;
public class LargestSubarraysum {
    public static  int countpartiton(int [] arr,int maxsum)
    {
        int n=arr.length;
        int subarraysum=0;
        int part=1;
        for(int i=0;i<n;i++)
        {
            if(subarraysum+arr[i]<=maxsum)
            {
                subarraysum+=arr[i];

            }
            else
            {
                part++;
                subarraysum=arr[i];
            }
        }

        return part;

    }
    public static  int partition(int [] arr,int k)
    {
        int n=arr.length;
        int low=arr[0];
        int high=0;
        for(int i=0;i<n;i++)
        {
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }

        while(low<=high)
        {
            int mid=(low+high)/2;
            int partition=countpartiton(arr,mid);
            if(partition>k){
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }

        return  low;
    }
    public static void main(String[] args) {
        int [] arr={10,20,30,40};
        int k=2;//2 partitions
        int ans=partition(arr,k);
        System.out.println("Minimum sum from largest subarray sum:"+ans);
    }
}
