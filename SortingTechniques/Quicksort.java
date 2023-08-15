public class quick {
    public static void qs(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pindex=partition(arr,low,high);
            qs(arr,low,pindex-1);
            qs(arr,pindex+1,high);

        }
    }
    public static int partition(int [] arr,int low,int high)
    {
      int pivot=arr[low];
      int i=low;
      int j=high;
      while(i<j)
      {
          while(arr[i]<=pivot && i<=high-1)
          {
              i++;
          }
          while(arr[j]>pivot && j>=low+1)
          {
              j--;
          }
          if(i<j)
          {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
          }
      }
      int temp=arr[low];
      arr[low]=arr[j];
      arr[j]=temp;
      return j;
    }
    public static void main(String[] args) {
        int [] arr={10,1,56,21,6,4,9,8,32,45,78};
        int n=arr.length;
        qs(arr,0,n-1);
        for (int i:arr
             ) {
            System.out.print(i+"\t");

        }
    }
}


//time complexity O(NlogN)
//space Complexity O(1)
