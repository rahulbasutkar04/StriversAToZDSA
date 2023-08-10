import java.util.*;
public class hashing {
    public static void main(String[] args) {
        int [] arr={1,4,1,2,3,6,7,3,5};
        int n=arr.length;

        //frequency using hashing

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if (hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
            else
            {
                hashMap.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet())
        {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }


    }
}

output-
1-->2
2-->1
3-->2
4-->1
5-->1
6-->1
7-->1
