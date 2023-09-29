public class banana {
    public static  int findmax(int [] arr)
    {
        int n= arr.length;
        int maxl=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            maxl=Math.max(maxl,arr[i]);
        }
        return maxl;
    }
    
    public static int tothou(int [] arr,int h)
    {
        int n=arr.length;
        
        int toth=0;
        for(int i=0;i<n;i++)
        {
            toth= (int) (toth+Math.ceil((double)(arr[i])/(double)(h)));
        }
        return toth;
    }
    public static  int calculateminhour(int [] arr,int hours)
    {
        int maxi=findmax(arr);
        for(int i=1;i<=maxi;i++)
        {
            int totlH=tothou(arr,i);
            if(totlH<=hours)
            {
                return i;
            }
        }
        return  -1;//not posiible
    }
    public static void main(String[] args) {
        int [] arr={7,15,6,3};
        int hour=8;
        int ans=calculateminhour(arr,hour);
        System.out.println("Monkey can eat all bananas in :"+ans+" hours");
    }
}
//output  TC=O(N)
Monkey can eat all bananas in :5 hours
  
