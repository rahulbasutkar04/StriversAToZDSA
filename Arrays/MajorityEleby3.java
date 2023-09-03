import java.util.ArrayList;
import java.util.List;

public class majorityElenby3 {
    public static List<Integer> majo(int [] arr)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int cnt1=0;
        int cnt2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            if (cnt1 == 0 && ele2!= arr[i]) {
                cnt1 = 1;
                ele1 = arr[i];
            } else if (cnt2 == 0 && ele1 != arr[i]) {
                cnt2 = 1;
                ele2 = arr[i];
            } else if (arr[i] == ele1) cnt1++;
            else if(arr[i] == ele2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

            int c1=0;
            int c2=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==ele1) c1++;
                if(arr[i]==ele2) c2++;

            }

            int min=(int)(n/3)+1;

            if(c1>=min) ans.add(ele1);
            if(c2>=min) ans.add(ele2);

        return ans;
        }

      public static void main(String[] args) {
        int [] arr={1,1,1,1,3,3,3,2,2,2,2};
        List<Integer> answ=majo(arr);
          System.out.println("Majority elements are:");
          System.out.println(answ);
    }
}
//output
Majority elements are:
[1, 2]
