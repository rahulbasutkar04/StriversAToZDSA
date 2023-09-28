//single element in sorted array

//brute force
public class singleElment {
    public static int sl(int [] arr)
    {
        int ans=0;
        int n=arr.length;
        if(n==1) ans=arr[0];
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                if(arr[i]!=arr[i+1]) ans=arr[0];
            }
            else if(i==n-1)
            {
                if(arr[n-1]!=arr[n-2]) {
                    ans = arr[n - 1];
                }
            }
            else
            {
                if((arr[i]!=arr[i+1])&& arr[i]!=arr[i-1])
                {
                    ans=arr[i];
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,3,4,4,5,5,6,7,7,8,8,9,9};
        int ans=sl(arr);
        System.out.println("Single element in sorted array:" +ans);

    }
}
//output  TC=O(N)
Single element in sorted array:6
  //optimal
  //single element in sorted array

//brute force
public class singleElment {
    public static int sl(int [] arr) {

        int n = arr.length;
        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];
        int low = 1;
        int high = n - 2;
        while (low <= high)
        {
            int mid=(low+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            else if((mid%2==1 && arr[mid-1]==arr[mid]) || (mid%2==0 && arr[mid]==arr[mid+1]))
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }



        return -1;
    }
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,3,4,4,5,5,6,7,7,8,8,9,9};
        int ans=sl(arr);
        System.out.println("Single element in sorted array:" +ans);

    }
}
//TC=O(NLogN)
