//sorting 0,1,and 2 using dutch nation flag algorithm(optimal solution)
public class sort01and2 {
    public static void main(String[] args) {
        int [] arr={1,1,0,0,0,2,2,1,0,2,1,0,0,1,2,1,1};
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;

                mid++;
                low++;
            }
            else if(arr[mid]==1) mid++;

            else {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
//output  TC=O(N)
0	0	0	0	0	0	1	1	1	1	1	1	1	2	2	2	2	
