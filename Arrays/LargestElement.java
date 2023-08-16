//largest element in array
public class LargestELement {
    public static void main(String[] args) {
        int [] arr={3,2,6,7,17,65,8,2,1,34};
        int n=arr.length;
        int largest=arr[0];
        for(int i=1;i<n;i++)
        {

            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
//Time comlexity O(N)
