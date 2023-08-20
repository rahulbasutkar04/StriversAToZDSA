//Longest subarray with given sum
//optimal soln
public class longestSubarr {
    public static void main(String[] args) {
        int [] arr={2,3,5,1,9};
        int k=10;
        int n=arr.length;
        int left=0;
        int right=0;
        int maxLength=0;
        int sum=arr[0];
        while(right<n)
        {
            while(left<=right && sum>k)
            {
                sum=sum-arr[left];
                left++;
            }

            if(sum==k)
            {
                maxLength=Math.max(maxLength,(right-left)+1);
            }
            right++;

            if(right<n)
            {
                sum=sum+arr[right];
            }
        }


        System.out.println(maxLength);
    }
}
//output
3

  //time complexity-O(2N)
