//count subarray with given sum
//better approach
public class subarrayWithsum{
    public static void main(String[] args) {
        int [] arr={1,2,3,-3,1,1,1,4,2,-3};
        int n=arr.length;
        int count=0;
        int k=3;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];

                if(sum==k)
                {
                    count++;
                }
            }
        }

        System.out.println("Total count of subarray for the given value:" +count);
    }
}
//output  TC=O(N^2)
Total count of subarray for the given value:8


  
import java.util.HashMap;

//count subarray with given sum
//Optimal approach
public class subarrayWithsum{
    public static void main(String[] args) {
        int [] arr={1,2,3,-3,1,1,1,4,2,-3};
        int n=arr.length;
        int count=0;
        int k=3;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int presum=0;
        for(int i=0;i<n;i++)
        {
            presum=presum+arr[i];
            int remove=presum-k;

            count+=hm.getOrDefault(remove,0);

            hm.put(presum,hm.getOrDefault(presum,0)+1);
        }


        System.out.println("Total count of subarray for the given value:" +count);
    }
}
//TC=O(N) SC=O(N)
Total count of subarray for the given value:8
