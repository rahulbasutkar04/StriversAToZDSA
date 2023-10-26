package strings;
//remove outermost parentheses  ex="(()())(())()"   after removing ()()()
public class outerPara {
    public static String soltion(String s){
        int opcnt=0;
        int clcnt=0;
        int start=0;
        int n=s.length();
        String result="";

        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                opcnt++;
            }
            else if(c==')')
            {
                clcnt++;
            }

            if(opcnt==clcnt)
            {
                result+=s.substring(start+1,i);
                start=i+1;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String s="(()())(())()";
        System.out.println(soltion(s));
    }
}
//Time Complexity  O(N)
