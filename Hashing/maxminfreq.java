{
    public static void main(String[] args) {
        int [] arr={1,4,1,1,1,2,3,6,7,3,5};
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


        //finding highest and lowest frequency
        int m=hashMap.size();
        int min=1;
        int max=0;
        int [] dum=new int[m];
        for(int i=0;i<m;i++)
        {
            dum[i]=hashMap.get(i+1);
            if(dum[i]<=min)
            {
                min=dum[i];

            }
            if(dum[i]>=max)
            {
                max=dum[i];
            }


        }

        System.out.println("Max:"+max);
        System.out.println("Min:"+min);

    }
}

//output

1-->4
2-->1
3-->2
4-->1
5-->1
6-->1
7-->1
Max:4
Min:1
