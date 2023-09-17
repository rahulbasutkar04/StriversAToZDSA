public class FrsAndLstOccur {
    public static int lb(int [] arr,int x)
    {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+high/2;
            if(arr[mid]>=x)
            {
                  ans=mid;
                  high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
    public static int ub(int [] arr,int x)
    {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
            {
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,8,8,8,9,10,11,11};
        int n=arr.length;
        int x=8;
        int low=lb(arr,x);

        if(low==n || arr[low]!=x) System.out.println("-1 -1");
        System.out.println(low+" "+(ub(arr,x)-1));


    }
}
//output
First and last occurence:6 8
