//finding how many time s an array is rotated
//simply find the index tat has lowes element and return it
//Bruteforce
public class RotatedCount {
    public static int rcont(int [] arr)
    {
        int ans=-1;
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                ans=i;
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        int [] arr={3,4,5,1,2};
        System.out.println("Array rotated\t"+rcont(arr)+"\ttimes");
    }
}
//output   TC=O(N)
Array rotated	3	times
 //optimal approach

  //finding how many time s an array is rotated
public class RotatedCount {
    public static int rcont(int [] arr)
    {
        int ans=Integer.MAX_VALUE;
        int n=arr.length;
        int low=0;
        int high=n-1;
       int index=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[low]<arr[high])
            {
                if(arr[low]<ans)
                {
                    index=low;
                    ans=arr[low];

                }
                break;
            }

            //if left part is sorted
            if(arr[low]<arr[mid])
            {
                if(arr[low]<ans)
                {
                    index=low;
                    ans=arr[low];
                }
                low=mid+1;//eliminate left half
            }

            else
            {
                if(arr[mid]<arr[high])
                {
                    index=mid;
                    ans=arr[mid];
                }
                high=mid-1; //eliminate right part
            }
        }




        return index;
    }
    public static void main(String[] args) {
        int [] arr={3,4,5,1,2};
        System.out.println("Array rotated\t"+rcont(arr)+"\ttimes");
    }
}
//TC=O(NlogN)
  
  
