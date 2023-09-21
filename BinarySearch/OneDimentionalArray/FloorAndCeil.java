//finding floor and ceil of given element x in array
public class floorAndCeil {
    public static int ceil(int [] arr,int n,int x)
    {
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=x)
            {
                ans=arr[mid];
                high=mid-1;//eliminating right part
            }
            else
            {
                low=mid+1;//eliminating left part
            }

        }
        return ans;

    }
     public static int floor(int[] arr, int n, int x)
    {
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<=x)
            {
                ans=arr[mid];
                low=mid+1;//eliminating left part
            }
            else
            {
                high=mid-1;//eliminating righ part
            }

        }
        return ans;

    }




    public static void main(String[] args) {
        //array must be sorted
        int [] arr={10,20,30,40,50,60};
        int n=arr.length;
        int x=25;

        int f=floor(arr,n,x);
        int c=ceil(arr,n,x);
        System.out.println("Floor and ceil of "+x+" is:"+f+" "+c);
    }

}
//output
Floor and ceil of 25 is:20 30
//TimeComplexity=O(log2N)+O(log2N)
