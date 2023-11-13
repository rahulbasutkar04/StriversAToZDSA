package strings;
//Largest Common Prefix
//example->"Rahul","Raj","Ramesh",   ans->"Ra"
public class largestCommonPrefix {
    public static void help(String [] s)
    {
        int n=s.length;

        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int m=s[i].length();
            minLength=Math.max(m,minLength);
        }

        int count=0;
        boolean mismatch=false;

        for(int i=0;i<minLength;i++)
        {
            char c=s[0].charAt(i);
            for(int j=1;j<n;j++)
            {
                if(s[j].charAt(i)!=c)
                {
                    mismatch=true;
                    break;
                }
            }

            if(mismatch)
            {
                break;
            }
            else {
                count++;
            }
        }
        System.out.println(s[0].substring(0,count));
    }


    public static void main(String[] args) {
        String [] s={"Rahul","Raj","Ramesh","Rakesh"};
        help(s);
    }
}

