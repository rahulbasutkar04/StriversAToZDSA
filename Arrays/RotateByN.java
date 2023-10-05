//Rotate left by N elemnts

//brute force approach
public class RotateByN {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int d=3;
        d=d%n;
        int [] temp=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }

        for(int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++)
        {
            arr[i]=temp[i-(n-d)];
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }

    }
}
//output
5	6	7	8	1	2	3  4
  //Time complexity O(N+d)

  //optimal approach

  public class RotateByN {
    public static void reverse(int [] arr,int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int d=3;
        d=d%n;
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }

    }
}
//output
5	6	7	1	2	3  4
  //time complexity O(2N)
  
