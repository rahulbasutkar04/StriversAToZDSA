//longest subarray with zero sum

//brute force approach
public class loSubArwithZeroSum {
    public static int zsum(int [] arr)
    {
        int n=arr.length;
        int maxi=0;

        for(int i=0;i<n;i++)
        {
              int sum=0;
              for(int j=i;j<n;j++)
              {
                  sum+=arr[j];
                  if(sum==0)
                  {
                      maxi=Math.max(maxi,j-i+1);
                  }
              }
        }
        return maxi;

    }
    public static void main(String[] args) {
        int [] arr={1,-1,3,2,-2,-8,1,7,10,23};
        System.out.println("length of largest array that gives 0 as sum:"+zsum(arr));

    }
}
//tc=O(n^2)

//optimal soln
//longest subarray with zero sum

import java.util.HashMap;
public class loSubArwithZeroSum {
    public static int zsum(int [] arr)
    {
        int n=arr.length;
        int maxi=0;
        int sum=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<n;i++)
        {
              sum+=arr[i];
              if(sum==0)
              {
                  maxi=i=1;
              }
              else
              {
                  if(ans.get(sum)!=null)
                  {
                      maxi=Math.max(maxi,i-ans.get(sum));
                  }
                  else
                  {
                      ans.put(sum,i);
                  }
              }
        }
        return maxi;

    }
    public static void main(String[] args) {
        int [] arr={1,-1,3,2,-2,-8,1,7,10,23};
        System.out.println("length of largest array that gives 0 as sum:"+zsum(arr));

    }
}
//output
length of largest array that gives 0 as sum:5
//Tc=O(NlogN)
//Sc=O(N)
