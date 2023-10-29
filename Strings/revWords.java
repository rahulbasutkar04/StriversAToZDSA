package strings;
//input="Hello world";
//ouput="world Hello"
public class revWords {
    public static String rev(String s){
        int n=s.length();
        String [] words=s.split(" ");
        StringBuilder ans=new StringBuilder();

        for(int i=words.length-1;i>=0;i--)
        {
            ans.append(words[i]);
            if(i>0)
            {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s="Hello Welcome to the code club";
        System.out.println(rev(s));
    }
}
