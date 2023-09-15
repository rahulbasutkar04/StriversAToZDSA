//lowerBound->smallest index such that arr[index]>=target
public class BinarySearch {
    static int  bs(int [] arr,int target)
    {
        int low=0;
        int ans=arr.length;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= target) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        int [] arr={3,5,8,15,19};
        int n=arr.length;
        int target=6;
        int ans=bs(arr,target);
        System.out.println("Lower Bound of targeted values is:"+ans+" "+"And value at that index is:"+arr[ans]);
    }
}
//output

Lower Bound of targeted values is:2 And value at that index is:8
