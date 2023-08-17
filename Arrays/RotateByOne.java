//Rotate array left by one element
public class LeftOneRotate {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};

        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

        System.out.println("Array after one left ratation:");
        for (int i:arr
             ) {
            System.out.print(i+"\t");

        }
    }
}
output:
Array after one left ratation:
2	3	4	5	6	7	8	1	
//Rotate array Right by one element
public class RightOneRotate {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};

        int n=arr.length;
        int temp=arr[n-1];
         for(int i=n-1;i>=1;i--)
         {
             arr[i]=arr[i-1];
         }
         arr[0]=temp;

        for (int i:arr
             ) {
            System.out.print(i+"\t");

        }
    }
}
//output
8	1	2	3	4	5	6	7
  
