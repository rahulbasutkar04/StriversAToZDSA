
import java.util.ArrayList;
import java.util.List;

public class fourSum {
    public static List<List<Integer>>  foursum(int [] arr,int target)
    {
        List<List<Integer>>  ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(i>0 && arr[i]==arr[i-1]) continue;

            for(int j=i+1;j<n;j++)
            {
                if(j>i+1 && arr[j]==arr[j-1])
                {
                    continue;
                }

                int k=j+1;
                int l=n-1;
                while(k<l)
                {
                    int sum=arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==target)
                    {
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);

                        ans.add(temp);
                        k++;
                        l--;

                        while(k<l && arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1]) l--;
                    }

                    else if(sum<target) k++;
                    else l--;
                }
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
           int [] arr={4,3,3,4,4,2,1,2,1,1};
           int target=9;
           List<List<Integer>> ans=foursum(arr,target);

        System.out.println("List of four sum elemtns:"+ans);
    }
}
//output
List of four sum elemtns:[[4, 2, 2, 1], [4, 2, 2, 1]]
