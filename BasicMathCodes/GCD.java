public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        // int l=Math.max(n,m);
        // int ans=0;
        // for(int i=1;i<=l;i++)
        // {
        //     if(n%i==0  && m%i==0)
        //     {
        //         ans=i;
        //     }

        // }
        // return ans;

        if (m != 0)
            return calcGCD(m, n % m);
        else
            return n;
    }
}
