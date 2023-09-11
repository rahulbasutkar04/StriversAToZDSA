//merge two sorted array without using extra space
//here in this bruteforce approach we have used the extra space to store the elements in sorted form  
public class sortedArray {
     public  static void merge(int [] arr1,int [] arr2)
     {
         int left=0;
         int right=0;
         int index=0;
         int n=arr1.length;
         int m=arr2.length;
         int [] arr3=new int[m+n];
         while(left<n && right<m) {
             if (arr1[left] <= arr2[right]) {
                 arr3[index] = arr1[left];
                 index++;
                 left++;
             } else
             {
                 arr3[index]=arr2[right];
                 index++;
                 right++;
             }


         }
         while(left<n)
         {
             arr3[index]=arr1[left];
             left++;
             index++;
         }
         while(right<m)
         {
             arr3[index]=arr2[right];
             index++;
             right++;
         }


         //putting back to original arrays
        for(int i=0;i<m+n;i++)
        {
            if(i<n)
            {
                arr1[i]=arr3[i];
            }
            else
            {
                arr2[i-n]=arr3[i];
            }
        }


     }

    public static void main(String[] args) {
                   int [] arr1={1,3,5,7};
                   int [] arr2={0,2,6,8,9};
                   merge(arr1,arr2);
                   int n=arr1.length;
                   int m=arr2.length;
        System.out.println("Sorted arrays are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]);
        }
        System.out.println();
        for(int j=0;j<m;j++)
        {
            System.out.print(arr2[j]);
        }

    }
}
//output   Tc=O(m+n)+O(m+n)   Sc=(m+n)
Sorted arrays are:
0123
56789

//optimal approach
  
import java.util.Arrays;
//merge two sorted array without using extra space
public class sortedArray {
     public  static void merge(int [] arr1,int [] arr2,int n,int m)
     {
         int left=n-1;
         int right=0;
         while(left>=0 && right<m)
         {
             if(arr1[left]>arr2[right])
             {
                 int temp=arr2[right];
                 arr2[right]=arr1[left];
                 arr1[left]=temp;
                 left--;
                 right++;
             }
             else
             {
                 break;
             }
         }

         Arrays.sort(arr1);
         Arrays.sort(arr2);

     }

    public static void main(String[] args) {
                   int [] arr1={1,3,5,7};
                   int [] arr2={0,2,6,8,9};

                   int n=arr1.length;
                   int m=arr2.length;
        merge(arr1,arr2,n,m);
        System.out.println("Sorted arrays are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]);
        }
        System.out.println();
        for(int j=0;j<m;j++)
        {
            System.out.print(arr2[j]);
        }

    }
}
