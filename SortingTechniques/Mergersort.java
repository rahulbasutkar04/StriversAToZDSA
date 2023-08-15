public class Mergesort{
    public static void MergeSort(int [] arr,int low,int high)
    {
        if(low==high) return;
        int mid=(low+high)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1,high);
        Merge(arr,low,mid,high);

    }
    public static void Merge(int arr[],int low,int mid,int high)
    {
        int [] temp=new int[arr.length];
        int left=low;
        int right=mid+1;
        int cnt=0;
        while(left<=mid && right<=high)
        {
            if(arr[left]<arr[right])
            {
                temp[cnt]=arr[left];
                left++;
                cnt++;
            }
            else
            {
                temp[cnt]=arr[right];
                right++;
                cnt++;
            }
        }

        while(left<=mid)
        {
            temp[cnt]=arr[left];
            left++;
            cnt++;
        }
        while(right<=high)
        {
            temp[cnt]=arr[right];
            right++;
            cnt++;
        }

        for(int i=low;i<=high;i++)
        {
            arr[i]=temp[i-low];
        }
    }
    public static void main(String[] args)
    {
        int [] arr={10,1,56,21,6,4,9,8,32,45,78};
        int n=arr.length;
        MergeSort(arr,0,n-1);
        System.out.println("Array after sorting:");
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
    }
}

//output
Array after sorting:
1	4	6	8	9	10	21	32	45	56	78	
//time complexity O(NlogN)
