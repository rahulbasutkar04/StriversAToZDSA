//count number of subarray with xor as k
public class xorsubarraycount {
    public static int xor(int [] arr,int k)
    {
        int n=arr.length;

        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int xor=0;
            for(int j=i;j<n;j++)
            {
                xor=xor^arr[j];

                if(xor==k) cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int [] arr={4,2,2,6,4};
        int k=6;
        System.out.println("no. of subarray:"+xor(arr,k));

    }
}
//output  TC=O(N^2)

//optimal
import java.util.HashMap;

//count number of subarray with xor as k
public class xorsubarraycount {
    public static int xor(int [] arr,int k)
    {
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int xr=0;
        hm.put(xr,1);

        int cnt=0;
        for(int i=0;i<n;i++)
        {
            xr=xr^arr[i];
            int x=xr^k;

            if(hm.containsKey(x)){
                cnt+=hm.get(x);
            }

            if(hm.containsKey(xr))
            {
                hm.put(xr,hm.get(xr)+1);
            }
            else
            {
                hm.put(xr,1);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int [] arr={4,2,2,6,4};
        int k=6;
        System.out.println("no. of subarray:"+xor(arr,k));

    }
}
//TC=O(N)
no. of subarray:4



  
