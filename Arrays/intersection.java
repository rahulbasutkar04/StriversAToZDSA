import java.util.*;
public class intersection {
    public static void main(String[] args) {
        int [] arr1={1,1,2,3,4,4,5};
        int [] arr2={2,3,4,4,5,6,7,7,8};
        ArrayList<Integer> ans=new ArrayList<>();

        int n=arr1.length;
        int m=arr2.length;

        int i=0;
        int j=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr2[j]<arr1[i])
            {
                j++;
            }
            else {
                ans.add(arr1[i]);
                i++;
                j++;
            }

        }
        System.out.println(ans);
    }

}
//output
[2, 3, 4, 4, 5]
//time complexity=O(N+N)
