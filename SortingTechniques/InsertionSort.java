public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={6,7,1,4,3,2,4,9};
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }

        System.out.println("sorted Array:");
        for (Integer i:arr) {
            System.out.println(i);
        }
    }
}
//TimeComplexity  = worst=O(n^2)  Best=O(n)
