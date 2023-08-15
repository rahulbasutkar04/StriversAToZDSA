public class recursiveBubble{
    public static void bubbleSort(int [] arr,int n)
    {
        if(n==1) return;
        int flag=0;
        for(int i=0;i<=n-2;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                flag=1;
            }
        }
        if(flag==0)return;
        bubbleSort(arr,n-1);

    }
    public static void main(String[] args) {
        int [] arr={10,1,56,21,6,4,9,8,32,45,78};
        int n=arr.length;
        System.out.println("Elements after sort:");
        bubbleSort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}


output
  Elements after sort:
1	4	6	8	9	10	21	32	45	56	78

  //in recursive approach if u figured out we used only one loop instead of two.
