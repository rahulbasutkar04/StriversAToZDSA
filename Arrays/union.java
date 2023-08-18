//union of two array note->Two array must be sorted
import java.util.*;
public class union {
    public static void main(String[] args) {
        int [] arr1={1,1,2,3,4,5};
        int [] arr2={2,3,4,4,5,6,7,7,8};

        ArrayList<Integer> ans=new ArrayList<>();

        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;

        while(i<n1 && j<n2) {
            if (arr1[i] <= arr2[j]) {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
            } else {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;
            }

        }

            while(j<n2)
            {
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j])
                {
                    ans.add(arr2[j]);
                }
                j++;
            }

            while(i<n1)
            {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
            }

        System.out.println(ans);



    }
}
