//check if array contains the targeted sum
//Bruteforce
public class TwoSum {
    public static void main(String[] args) {
        int [] ans=new int[2];
        int [] arr={2,6,5,8,11};
        int target=14;
        int flag=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    flag=1;
                }

            }
        }
        if(flag==1) {
            System.out.println(ans[0]+" "+ans[1]);
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}

//output
1 3
Yes


  //check if array contains the targeted sum
//Better
import java.util.HashMap;


public class TwoSum {
    public static void main(String[] args) {
        int [] ans=new int[2];
        int [] arr={2,6,5,8,11};
        int n=arr.length;
        int target=14;
        int flag=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int num=arr[i];
            int moreneeded=target-num;
            if(hm.containsKey(moreneeded))
            {
                ans[0]=hm.get(moreneeded);
                ans[1]=i;
                flag=1;
            }
            hm.put(arr[i], i);
        }
        if(flag==1)
        {
            System.out.println("Yes Sum is present at index :"+ans[0]+" and "+ans[1]);
        }
        else
            System.out.println("Not present");

    }
}

//TC=O(nlogn)
