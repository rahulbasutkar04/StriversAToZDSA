//returns count of original numbers
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4};
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }

        System.out.println(i+1);
    }

}
