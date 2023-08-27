//Brute force approach
public class longestConsecutive {
    static boolean ls(int [] arr,int num)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                return true;
            }
        }
        return false;
    }
    static  int longestconse(int [] arr)
    {
        int longest=1;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int x=arr[i];
            int cnt=1;
            while(ls(arr,x+1)==true)
            {
                x += 1;
                cnt += 1;

            }

            longest=Math.max(longest,cnt);

        }
        return longest;
    }
    public static void main(String[] args) {
     int [] arr={100,4,100,1,101,3,2,1,1};
        System.out.println("Longest consecutive sequence length is:"+longestconse(arr));

    }
}
//output TC=O(N^2)   SC=O(1)
Longest consecutive sequence length is:4

//Better force approach  
import java.util.Arrays;
public class longestConsecutive {

    static  int longestconse(int [] arr)
    {
       int n=arr.length;
       int longest=1;
       int lastSmaller=Integer.MIN_VALUE;
       int cnt=0;
       Arrays.sort(arr);
       if(n==0) return 0;

       for(int i=0;i<n;i++)
       {
           if(arr[i]-1==lastSmaller)
           {
               cnt=cnt+1;
               lastSmaller=arr[i];
           }
           else if(lastSmaller!=arr[i])
           {
               cnt=1;
               lastSmaller=arr[i];
           }
           longest=Math.max(longest,cnt);
       }

        return longest;
    }
    public static void main(String[] args) {
     int [] arr={100,4,100,1,101,3,2,1,1};
        System.out.println("Longest consecutive sequence length is:"+longestconse(arr));

    }
}
//tc=O(NlogN)+N=N

//optimal
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class longestConsecutive {

    static  int longestconse(int [] arr)
    {
       int n=arr.length;
       if(n==0) return 0;
       int longest=1;
        Set<Integer> hm=new HashSet<>();

        //putting all elemnts into array
        for(int i=0;i<n;i++)
        {
            hm.add(arr[i]);
        }

        //finding the longest sequence
        for(int i:hm)
        {
            if(!hm.contains(i-1))
            {
                int cnt=1;
                int x=i;

                while(hm.contains(x+1))
                {
                    x=x+1;
                    cnt=cnt+1;
                }
                longest=Math.max(longest,cnt);
            }

        }

        return longest;
    }
    public static void main(String[] args) {
     int [] arr={100,4,100,1,101,3,2,1,1};
        System.out.println("Longest consecutive sequence length is:"+longestconse(arr));

    }
}

//output TC=O(3N)  SC=O(N)
Longest consecutive sequence length is:4

