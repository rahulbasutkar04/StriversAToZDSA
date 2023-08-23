//buy stock and sell and return the output as max profit
//dp approach

class stock
  {
    public static void main(String[] args)
    {
      int [] arr={7,1,4,3,6,2};
      int n=arr.length;
      int min=arr[0];
      int maxprofit=0;
      for(int i=0;i<n;i++)
        {
          int cost=arr[i]-min;
          maxprofit=Math.max(maxprofit,cost);
          min=Math.min(min,arr[i]);
        }

      System.out.print("Maximun profit is:"+maxprofit)
    }
  }

//output
Maximum profit is:5
