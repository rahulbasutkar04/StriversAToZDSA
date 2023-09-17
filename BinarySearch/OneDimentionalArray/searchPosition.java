//finding the position of element where it can be inserted
public class InsertPos {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,6};
        int n=arr.length;
        int x=4;
        //exactly same as lowerbound
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=x)
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        System.out.println("Insert position is:"+ans);
    }
}
//output
Insert position is:3
