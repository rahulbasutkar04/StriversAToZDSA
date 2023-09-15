//lowerBound
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
            if (arr[mid] >target) {
                ans = mid;
                //look for greater index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        int [] arr={2,3,6,7,8,8,11,11,11,12};
        int n=arr.length;
        int target=8;
        int ans=bs(arr,target);
        System.out.println("Upper Bound of targeted values is:"+ans+" "+"And value at that index is:"+arr[ans]);
    }
}
//output
Upper Bound of targeted values is:6 And value at that index is:11
