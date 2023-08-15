public class RecursiveInsertion{
    public static void insertionSort(int [] arr,int i,int n)
    {
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j])
        {
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        insertionSort(arr,i+1,n);


    }
    public static void main(String[] args) {
        int [] arr={10,1,56,21,6,4,9,8,32,45,78};
        int n=arr.length;
        System.out.println("Elements after sort:");
        insertionSort(arr,0,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
