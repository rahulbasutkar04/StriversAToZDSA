//find missing and repeated number from the given n numbers
public class missingandrepe {
    public static void main(String[] args) {
        int [] arr={3, 1, 2, 5, 4, 6, 7, 5};

        int n=arr.length;
        int repeted=-1;
        int missing=-1;
        for(int i=1;i<=n;i++)
        {
            int cnt=0;

            for(int j=0;j<n;j++)
            {
                if(arr[j]==i)cnt++;
            }

            if(cnt==2)repeted=i;
            else if(cnt==0)missing=i;

            if (repeted != -1 && missing != -1)
                break;
        }

        int [] ans={repeted,missing};
        System.out.println("Repeated:"+ans[0]+" "+"missiong:"+ans[1]);
    }
}
//ouput  tc=O(N^2)
Repeated:5 missiong:8
