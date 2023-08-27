//optimal approach

import java.util.ArrayList;
import java.util.Collections;

public class leaderinArray {
    public static void main(String[] args) {
        int [] arr={10,22,12,3,0,6};

        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>maxi)
            {
                ans.add(arr[i]);
            }
            maxi=Math.max(maxi,arr[i]);

        }
        Collections.reverse(ans);
        System.out.println(ans);

    }
}
//output TC=O(N^2) 
[22, 12, 6]
