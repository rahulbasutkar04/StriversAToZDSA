//find peek element  from the given array  arr[i-1]<arr[i]>arr[i+1]
public class findPeek {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,5,1};
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if((i==0 || arr[i-1]<arr[i]) && ((i==n-1)|| arr[i]>arr[i+1]))
                System.out.println(arr[i]);
        }
    }
}
//output  tc=O(N)
8
  //optimal
  //find peek element  from the given array  arr[i-1]<arr[i]>arr[i+1]
public class findPeek {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,5,1};
        int n=arr.length;
        if(n==1) System.out.println(arr[0]);
        if(arr[0]>arr[1]) System.out.println(arr[0]);
        if(arr[n-1]>arr[n-2]) System.out.println(arr[n-1]);

        int left=1;
        int right=n-2;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid]>arr[mid-1])
            {
                left=mid+1;
            }
            else if(arr[mid]<arr[mid+1]) right=mid-1;
            else right=mid-1;


        }

    }
}
//TC=O(NlogN)
  
