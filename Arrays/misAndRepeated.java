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
//optimal
    //find missinf and repeated number from the gien n numbers
//optimal approach
public class missingandrepe {
    public static void main(String[] args) {
        int [] arr={3, 1, 2, 5, 4, 6, 7, 5};

        int n=arr.length;
        //calculate sum of n
        int sn=n*(n+1)/2;

        //calculat sum of square of n
        int s2n=(n*(n+1)*(2*n+1))/6;

        //calculate sum of elements in arr
        int s=0;
        int s2=0;
        for(int i=0;i<n;i++)
        {
            s+=arr[i];

            s2+=(arr[i]*arr[i]);
        }
        //now we know that x is repeating element and y is missing
        //to calculate x-y
        //sum of arr element - sum of n elements
        //to calculate x^2-y^2
        //sum of squre of arr elements - sum of square of n elements
        int val1=s-sn;//x-y
        int val2=s2-s2n;//x^2-y^2
        val2=val2/val1;//x+y
        //w k t (x+y)+(x-y)=2x

        int sum=val1+val2;
        int x=sum/2;
        int y=x-val1;

        System.out.println("Repeating number is:"+x+" "+"Missing Number is:"+y);





    }
}
//tc=O(N)
