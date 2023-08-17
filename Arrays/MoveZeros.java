//move zeros to the end
public class MoveZero {
    public static void main(String[] args) {
        int [] arr={1,0,2,3,2,0,0,4,5,1};
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1)
        {
            System.out.println("No zeros present in the array");

        }

        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
    }
}
//output     time complexity=O(N)
1	2	3	2	4	5	1	0	0	0
