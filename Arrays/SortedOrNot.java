//array is sorted or not
public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 8, 4, 6, 5, 7, 7, 2};
        int n=arr.length;
        int flag=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=arr[i-1])
            {

            }
            else
                flag=1;
        }

        if(flag==1)
        {
            System.out.println("Not sorted");
        }
        else
            System.out.println("Sorted");
    }
}
