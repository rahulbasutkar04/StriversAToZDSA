
public class BinarySearch {
    static int  bs(int [] arr,int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(target>arr[mid]) low=mid+1;
            else high=mid-1;
        }


        return -1;
    }
    public static void main(String[] args) {
        int [] arr={1,6,8,12,15,18,19,20,22,56,77,88,90,100};
        int n=arr.length;
        int target=22;
        int ans=bs(arr,target);
        System.out.println("Target found at positon:"+ans);
    }
} 
//output    time complexity->O(log2N)
Target found at positon:8

  
