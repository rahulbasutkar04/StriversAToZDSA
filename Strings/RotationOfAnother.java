package strings;

public class rotationOfAnother {
    public static boolean validStr(String s1,String s2)
    {
        if(s1.length()!=s2.length()) return false;
        int n=s1.length();

        while(n>=0){
            char temp=s2.charAt(n-1);
            StringBuilder sb=new StringBuilder(s2.substring(0,n-1));
            s2=temp+sb.toString();
            if(s2.equals(s2)) return true;

        }
        return false;
    }
    public static void main(String[] args) {

        String s1="aabca";
        String s2="bacaa";
        System.out.println(validStr(s1,s2));

    }
}
