//program to find last occurence(index) of given element in array
public class lastOccurence {
    public static int lo(int [] arr,int n,int x)
    {
       int low=0;
       int high=n-1;
       int ans=-1;
       while(low<=high)
       {
           int mid=(low+high)/2;
           if(arr[mid]==x) {
               ans = mid;
               low=mid+1;//if found at mid then eliminating left part because higher elemts are always at right part
           }
           else if(x<arr[mid])
           {
               high=mid-1;

           }
           else
           {
               low=mid+1;
           }
           }
           return ans;
       }

    public static void main(String[] args) {
        int [] arr={1,2,3,3,4,5,6,8,8,8,9,10};
        int n=arr.length;
        int x=8;
        System.out.println("last occurence of element is at index:"+lo(arr,n,x));
    }
}
//ouput
last occurence of element is at index:9
//TimeComplexity=O(lon2N)
