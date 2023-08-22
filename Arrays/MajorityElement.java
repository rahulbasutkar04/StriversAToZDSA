import java.util.*;
public class MajorityEleNby2 {
    public static void main(String[] args) {
        int [] arr={2,2,1,1,1,2,2};
        int n=arr.length;
  //      int count=0;
//        for(int i=0;i<n;i++)
//        {
//
//            for(int j=0;j<n;j++)
//            {
//                if(arr[j]==arr[i])count++;
//            }
//
//            if(count>n/2) {
//
//                System.out.println(arr[i]);
//                break;
//            }
//        }


//        HashMap<Integer,Integer> hm=new HashMap<>();
//        for(int i=0;i<n;i++)
//        {
//            int value=hm.getOrDefault(arr[i],0);
//            hm.put(arr[i],value+1);
//        }
//
//        for(Map.Entry<Integer,Integer> it:hm.entrySet())
//        {
//            if(it.getValue()>n/2)
//            {
//                System.out.println(it.getKey());
//            }
//        }
//optimal
        int count=0;
        int ele=0;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count=1;
                ele=arr[i];
            }
            else if(ele==arr[i])count++;
            else  count--;
        }

        int count2=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]==ele)count2++;
        }

        if(count2 >(n/2))
        {
            System.out.println("Majaority element is:"+ele);
        }


    }
}
Majaority element is:2
